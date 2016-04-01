import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	private Triangle tri = null;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIllegal() {
		tri = new Triangle (1 ,2 ,3);
		tri.getBorders();
		assertEquals("Illegal",tri.getType(tri));
	}
	
	@Test
	public void testRegular() {
		tri = new Triangle (1 ,1 ,1);
		assertEquals("Regular",tri.getType(tri));
	}
	@Test
	public void testScalene() {
		tri = new Triangle (2 ,3 ,4);
		assertEquals("Scalene",tri.getType(tri));
	}
	@Test
	public void testIsosceles() {
		tri = new Triangle (2 ,3 ,2);
		assertEquals("Isosceles",tri.getType(tri));
	}
	@Test
	public void testIsosceles2() {
		tri = new Triangle (2 ,2 ,3);
		assertEquals("Isosceles",tri.getType(tri));
	}
	@Test
	public void testIsosceles3() {
		tri = new Triangle (1,1 ,-1);
		assertEquals("Isosceles",tri.getType(tri));
	}
}
