package com.sjht.sdk.huicai.demo.config;

import com.sjht.sdk.huicai.core.config.HuicaiApiConfig;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EqualsAndHashCode(callSuper = true)
@Data
@Configuration
@ConfigurationProperties(prefix = "sjht.huicai")
public class HuicaiProperties extends HuicaiApiConfig {
}
