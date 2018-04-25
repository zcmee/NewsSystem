package com.github.zcmee.newssystem.components;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my-configuration-properties")
public class ConfigPorpsComponent {

    private String appName;
    private String appDescription;
    private String appDateBirth;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public String getAppDateBirth() {
        return appDateBirth;
    }

    public void setAppDateBirth(String appDateBirth) {
        this.appDateBirth = appDateBirth;
    }

}
