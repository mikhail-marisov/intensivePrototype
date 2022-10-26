package com.aston.intesive.prototype;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TableTest {

	@Test
	void testClone() {
		
		Table table1 = new Table();
		table1.material = "plastic";
		table1.weight = 5;
		table1.Colour = "white";
		
		Table table2 = (Table) table1.clone();
		
		assertTrue (table1.equals(table2));
	}

}
