package com.yujin.jekinstest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JekinsTestApplicationTests {

	private JenkinsTest jenkinsTest = new JenkinsTest();

	@Test
	public void testAge() {
		assertEquals("I'm 24 years old", jenkinsTest.getAge(1999));
	}

}
