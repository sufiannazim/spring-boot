package com.jenkins.integration.demo;

import com.jenkins.integration.demo.controller.AdditionController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private AdditionController additionController;

	@Test
	public void testAdditionController() {
		assertEquals(new Integer(20), additionController.addTwoNumbers(10, 10));
	}
}

