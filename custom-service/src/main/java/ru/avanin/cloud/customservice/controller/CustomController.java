package ru.avanin.cloud.customservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class CustomController {

    @Value("${custom.prop: }")
    String customProperty;

    @GetMapping("/prop")
    String customPropertyValue(){
        return this.customProperty;
    }

}
