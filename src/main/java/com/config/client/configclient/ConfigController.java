package com.config.client.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController{

    @Value("${property.file}")
    String env;
    
    @RequestMapping(method=RequestMethod.GET,path="/localenv")
    public String getEnv(){
        return this.env;

    }

}