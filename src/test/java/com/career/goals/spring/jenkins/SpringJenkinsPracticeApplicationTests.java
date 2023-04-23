package com.career.goals.spring.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsPracticeApplicationTests {

	Logger logger =LoggerFactory.getLogger(SpringJenkinsPracticeApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("test case excuting.....");
		assertEquals(true,true);
	}

}
