package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/personal-info")
public class PersonalInfoController {

    private final List<Map<String, Object>> submissions = new ArrayList<>();

    @PostMapping
    public Map<String, String> receivePersonalInfo(@RequestBody Map<String, Object> requestData) {
        submissions.add(requestData);
        System.out.println("受け取ったデータ：" + requestData);
        return Map.of("message", "データ受け取りました！");
    }

    @GetMapping
    public List<Map<String, Object>> getAllSubmissions() {
        return submissions;
    }
}
