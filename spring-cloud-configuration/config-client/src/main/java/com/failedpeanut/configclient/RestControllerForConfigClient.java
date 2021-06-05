package com.failedpeanut.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RestControllerForConfigClient {

	@Value("${my.name}")
	private String appName;
	
	@Value("${my.description}")
	private String appDescription;
	
	@Value("${app.defaultname:DEFAULT_NAME}")
	private String defaultName;
	
	@Value("${test.refreshscope}")
	private String refreshScope;
	
	/*Providing default value for key; NOTE: the below is not present in any of the properties file*/
	@Value("${key.notpresent:NO_KEY_VALUE_IN_PROPERTY_FILE}")
	private String keyNotPresent;
	
	@GetMapping("/app")
	public String returnAppNameAndDescription() {
		return "App Name is:->"+appName+":::"+"App Description:->"+appDescription;
	}
	
	@GetMapping("/default")
	public String returnDefaultAppName() {
		return defaultName;
	}
	
	@GetMapping("/nokey")
	public String noKey() {
		return keyNotPresent;
	}
	
	@GetMapping("/refresh")
	public String refresh() {
		return refreshScope;
	}
}
