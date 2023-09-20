package com.example.urlhitcounter.controller;


import com.example.urlhitcounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")

public class UrlHitController {

    @Autowired

    public UrlHitService urlHitService;

    @GetMapping("/count")
    public ResponseEntity<Integer> getHitCount(){
        int count = urlHitService.getHitCount();
        return ResponseEntity.ok(count);
    }
}
