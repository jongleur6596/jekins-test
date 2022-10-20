package com.yujin.jekinstest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JenkinsTest {
    public JenkinsTestService jenkinsTestService = new JenkinsTestService();

    @Test
    public void testAge() {
        assertEquals(24, jenkinsTestService.getAge(1999));
    }

}
