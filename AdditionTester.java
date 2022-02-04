import static org.junit.Assert.*;
import org.junit.*;

public class AdditionTester{
	@Test
	public void testAdd(){
		//assertEquals("1 + 1 = 3, will fail", Addition.add(1,1), 3);
		assertEquals("1 + 1 = 2", Addition.add(1,1), 2);
		assertEquals("10 + 10 = 20", Addition.add(10, 10), 20);
		assertEquals("-1 + 1 = 0", Addition.add(-1,1), 0);
	}
}