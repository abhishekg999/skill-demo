import static org.junit.Assert.*;
import org.junit.*;

public class AdditionTester{
	@Test
	public void testAdd(){
		assertEquals("1 + 1 = 3, will fail", Addition.add(1,1), 3);
	}
}