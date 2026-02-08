package com.vidhan.vid_service_a_config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConfigTestController {

	@Value("${app.name:not-set}")
	private String appName;

	@Value("${app.featureEnabled:not-set}")
	private String featureEnabled;

	@Value("${app.commonMessage:not-set}")
	private String commonMessage;

	@GetMapping("/config")
	public Map<String, String> getConfig() {
		return Map.of(
				"app.name", appName,
				"app.featureEnabled", featureEnabled,
				"app.commonMessage", commonMessage
		);
	}
}
