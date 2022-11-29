package com.workshop.configclient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties("config-server")
@Component
public class Configuration {
    private String value;
}
