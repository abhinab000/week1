package week4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
	private Product p;
	@BeforeEach
	void setup() {
	 p = new Product("Degree", 3.0, 1);
	}
	
	

	@Test
	void testInfo() {
		assertEquals("Degree", p.getname());
	}

	@Test
	void testGetname() {
		assertEquals("Degree", p.getname());
	}

	@Test
	void testGetprice() {
		assertEquals(3.0,p.getprice());
	}

	@Test
	void testGetquantity() {
		assertEquals(1, p.getquantity());
	}

	@Test
	void testIsAffordable() {
		assertTrue(p.isAffordable(4));
		assertFalse(p.isAffordable(2));
		
	}

}
