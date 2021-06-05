package com.failedpeanut.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("prod")
@RestController
@RefreshScope
public class ProdController {
	
	@Autowired
	private DbConfiguration dbConfig;
	
	@Value("${my.name}")
	private String appName;
	
	@Value("${my.description}")
	private String appDescription;
	
	/*Providing default value for key; NOTE: the below is not present in configclient-prod.properties file*/
	@Value("${my.dev:MY_DEFAULT_PROD_VALUE}")
	private String myDevDefault;
	
	@Value("${test.refreshscope}")
	private String refreshScope;
	
	@GetMapping("/prod")
	public String returnAppNameAndDescription() {
		
		return "App Name is:->"+appName+""+"\n"
				+ ""+"App Description:->"+appDescription+"\n"
						+ ""+dbConfig.toString();
	}
	
	@GetMapping("/prodrefresh")
	public String refresh() {
		return refreshScope;
	}

}
