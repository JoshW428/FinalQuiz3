package Quiz3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	Triangle x = new Triangle(2,3,4);
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		assertEquals(x.getArea(),2.9047);
		assertEquals(x.getPerimeter(),9);
	}

}
