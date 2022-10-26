package com.aston.intesive.prototype;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChairTest {

	@Test
	void testClone() {
		Chair chair1 = new Chair();
		chair1.material = "wood";
		chair1.weight = 3;
		chair1.Colour = "brown";
		
		Chair chair2 = (Chair) chair1.clone();
		
		assertTrue (chair1.equals(chair2));

	}

}
