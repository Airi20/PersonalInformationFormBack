package com.example.demo.controller; // ← 実際のパッケージ名に合わせてね！

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String hello() {
        return "バックエンドはちゃんと生きてるよ！（Reactは別ポートで動いてるよ）";
    }
}
