package com.amdocs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlikiRevisionProjectMsApplicationTests {

	@DisplayName("A special test case")
	@Disabled("Disabled until bug #42 has been resolved")
	@Test
	void contextLoads() {
		ProductManager productManager = new ProductManager();
		assertEquals("hello","hello2");
	}

}
