package com.example.demo.controller;

import com.example.demo.model.PersonalInfo;
import com.example.demo.repository.PersonalInfoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;


import java.util.List;

@RestController
@RequestMapping("/api/personal-info")
@CrossOrigin(origins = "*") // ← フロントと通信できるように（必要に応じてドメイン指定）
public class PersonalInfoController {

    private final PersonalInfoRepository repository;

    public PersonalInfoController(PersonalInfoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Map<String, String> savePersonalInfo(@RequestBody PersonalInfo info) {
        repository.save(info);
        Map<String, String> response = new HashMap<>();
        response.put("message", "保存完了しました！");
        return response;
    }


    

    @GetMapping
    public List<PersonalInfo> getAll() {
        return repository.findAll();
    }
}
