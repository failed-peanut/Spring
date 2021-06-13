package com.failedpeanut.springboot.surgery;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootSurgeryApplicationTests {

	@Autowired
	private SimpleService myService;

	@Test
	public void messageTestFail() {/*This will Fail, Testing Fail scenario*/
		String msg = myService.getMessage();
		assertEquals("Some Random Msg", msg);
	}
	@Test
	public void messageTestPass() {/*This will Pass, Testing Pass scenario*/
		String msg = myService.getMessage();
		assertEquals("*******Simple Service for Demo Purpouse!*******", msg);
	}
}
