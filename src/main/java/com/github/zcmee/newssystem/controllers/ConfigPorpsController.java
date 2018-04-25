package com.github.zcmee.newssystem.controllers;

import com.github.zcmee.newssystem.components.ConfigPorpsComponent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("props")
public class ConfigPorpsController {
    private final ConfigPorpsComponent configPorpsComponent;

    @Value("${static-value}")
    private String importantMessage;

    public ConfigPorpsController(ConfigPorpsComponent configPorpsComponent) {
        this.configPorpsComponent = configPorpsComponent;
    }

    @GetMapping("all")
    public String getAllProps() {
        return "ConfigPorpsController{" +
                ", dasidania = " + configPorpsComponent.getAppName() +
                ", importantMessage='" + importantMessage + '\'' +
                '}';
    }

}
