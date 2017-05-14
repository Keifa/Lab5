package lab;

import static org.junit.Assert.*;
import org.junit.Test;
import lab.Frame;

public class testCase {

	@Test
	public void userStory1() {
		Frame f = new Frame(2, 4);
		assertEquals(2, f.firstThrow);
		assertEquals(4, f.secondThrow);
	}

}
