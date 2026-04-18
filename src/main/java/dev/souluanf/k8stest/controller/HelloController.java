package dev.souluanf.k8stest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @Value("${APP_MESSAGE:k8s-test running on k3s}")
    private String appMessage;

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", appMessage);
    }
}
