package com.example.urlhitcounter.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {
    private int hitCount = 0;
    private Map<String, Integer> hitCounts = new HashMap<>();
    public int incrementHitCount() {
        return ++hitCount;
    }

    public int incrementHitCountByUsername(String username) {
        hitCounts.putIfAbsent(username, 0);
        int count = hitCounts.get(username);
        count++;
        hitCounts.put(username, count);
        return count;
    }
}