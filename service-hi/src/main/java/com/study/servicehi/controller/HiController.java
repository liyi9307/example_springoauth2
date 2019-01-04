package com.study.servicehi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HiController {
    Logger logger = LoggerFactory.getLogger(HiController.class);
    @Value(value = "${server.port}")
    private String port;
    @Value(value = "${spring.application.name}")
    private String applicationName;

    @RequestMapping("/hello")
    public String hello(){
        return "hello! " + "I am from " + applicationName + ": " + port;
    }

    @RequestMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String admin(){
        return "isAdmin";
    }

    @GetMapping("/getPrinciple")
    public OAuth2Authentication getPrincile(OAuth2Authentication oAuth2Authentication, Principal principal,
                                            Authentication authentication){
        logger.info(oAuth2Authentication.getUserAuthentication().getAuthorities().toString());
        logger.info(oAuth2Authentication.toString());
        logger.info(principal.toString());
        logger.info(principal.getName());
        return oAuth2Authentication;
    }
}
