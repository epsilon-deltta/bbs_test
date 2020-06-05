package com.test.yp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class rollingTest {
	rolling rol ;
	@Test
	public void testSum() {
		System.out.println("answer was this !!" + rol.sum(3, 4));
	}

	@Test
	public void testSum0() {
		System.out.println("quenstion was this !!" + rol.sum(3, 4));
		assertEquals(60, rol.sum(10, 50), 10);
	}
	
}
