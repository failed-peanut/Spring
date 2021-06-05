package com.failedpeanut.configclient;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("dev")
@RestController
@RefreshScope
public class DevController {
	
	@Autowired
	private DbConfiguration dbConfig;
	
	@Value("${my.name}")
	private String appName;
	
	@Value("${my.description}")
	private String appDescription;
	
	@Value("${my.dev:MY_DEV_DEFAULT_VALUE}")//specify default value for any key with ':'
	private String myDevDefault;
	
	@Value("#{${listOfStrings}}")//Retrieve List from properties NOTE: use # with $
	private List<String> listOfStrings;
	
	@Value("#{${mapofusers}}")//Retrieve map from properties NOTE: use # with $
	private Map<String,String> users;
	
	@Value("${test.refreshscope}")
	private String refreshScope;
	
	@GetMapping("/dev")
	public String returnAppNameAndDescription() {
		
		return "App Name is:->"+appName+""+"\n"
				+ ""+"App Description:->"+appDescription+"\n"
						+ "DB Configuration is: ->"+dbConfig.toString()+"\n"+
				"DEFAULT_VALUE:->"+myDevDefault;
	}
	
	@GetMapping("/dev/mapList")
	public String returnMapList() {
		
		return listOfStrings.toString()+"--Map for test--"+users.toString();
	}
	
	@GetMapping("/devrefresh")
	public String refresh() {
		return refreshScope;
	}

}
