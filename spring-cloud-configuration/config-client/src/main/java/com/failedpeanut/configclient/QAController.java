package com.failedpeanut.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("qa")
@RestController
@RefreshScope
public class QAController {
	
	@Autowired
	private DbConfiguration dbConfig;
	
	@Value("${my.name}")
	private String appName;
	
	@Value("${my.description}")
	private String appDescription;
	
	@Value("${test.refreshscope}")
	private String refreshScope;
	
	/*Providing default value for key; NOTE: the below is not present in configclient-qa.properties file*/
	@Value("${my.dev:MY_DEFAULT_QA_VALUE}")
	private String myDevDefault;
	
	@GetMapping("/qa")
	public String returnAppNameAndDescription() {
		
		return "App Name is:->"+appName+""+"\n"
				+ ""+"App Description:->"+appDescription+"\n"
						+ ""+dbConfig.toString();
	}
	@GetMapping("/qarefresh")
	public String refresh() {
		return refreshScope;
	}

}
