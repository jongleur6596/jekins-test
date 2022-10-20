package com.yujin.jekinstest;

import org.springframework.stereotype.Service;

@Service
public class JenkinsTestService {
    public int getAge(int year) {
        return 2022 - year + 1;
    }
}
