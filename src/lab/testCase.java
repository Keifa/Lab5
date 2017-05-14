package lab;

import static org.junit.Assert.*;
import org.junit.Test;
import lab.Frame;
import lab.Game;

public class testCase {

	@Test
	public void userStory1() {
		Frame f = new Frame(2, 4);
		assertEquals(2, f.firstThrow);
		assertEquals(4, f.secondThrow);
	}
	
	@Test
	public void userStory2() {
		Frame f = new Frame(2, 6);
		assertEquals(8, f.score);
	}
	
	@Test
	public void userStory3() {
		Game g = new Game();
		g.addFrame(1, 5);
		assertEquals(1, g.frames[0].firstThrow);
		assertEquals(5, g.frames[0].secondThrow);
		
		g.addFrame(3, 6);
		assertEquals(3, g.frames[1].firstThrow);
		assertEquals(6, g.frames[1].secondThrow);
		
		g.addFrame(7, 2);
		assertEquals(7, g.frames[2].firstThrow);
		assertEquals(2, g.frames[2].secondThrow);
		
		g.addFrame(3, 6);
		assertEquals(3, g.frames[3].firstThrow);
		assertEquals(6, g.frames[3].secondThrow);
		
		g.addFrame(4, 4);
		assertEquals(4, g.frames[4].firstThrow);
		assertEquals(4, g.frames[4].secondThrow);
		
		g.addFrame(5, 3);
		assertEquals(5, g.frames[5].firstThrow);
		assertEquals(3, g.frames[5].secondThrow);
		
		g.addFrame(3, 3);
		assertEquals(3, g.frames[6].firstThrow);
		assertEquals(3, g.frames[6].secondThrow);
		
		g.addFrame(4, 5);
		assertEquals(4, g.frames[7].firstThrow);
		assertEquals(5, g.frames[7].secondThrow);
		
		g.addFrame(8, 1);
		assertEquals(8, g.frames[8].firstThrow);
		assertEquals(1, g.frames[8].secondThrow);
		
		g.addFrame(2, 6);
		assertEquals(2, g.frames[9].firstThrow);
		assertEquals(6, g.frames[9].secondThrow);
	}
	
	@Test
	public void userStory4() {
		Game g = new Game();
		g.addFrame(1, 5);
		g.addFrame(3, 6);
		g.addFrame(7, 2);
		g.addFrame(3, 6);
		g.addFrame(4, 4);
		g.addFrame(5, 3);
		g.addFrame(3, 3);
		g.addFrame(4, 5);
		g.addFrame(8, 1);
		g.addFrame(2, 6);
		assertEquals(81, g.gameScore);
	}
	
	@Test
	public void userStory5() {
		Game g = new Game();
		g.addFrame(10, 0);
		g.addFrame(3, 6);
		g.addFrame(7, 2);
		g.addFrame(3, 6);
		g.addFrame(4, 4);
		g.addFrame(5, 3);
		g.addFrame(3, 3);
		g.addFrame(4, 5);
		g.addFrame(8, 1);
		g.addFrame(2, 6);
		g.calcGameScore();
		assertEquals(94, g.gameScore);
	}
	
	@Test
	public void userStory6() {
		Game g = new Game();
		g.addFrame(1, 9);
		g.addFrame(3, 6);
		g.addFrame(7, 2);
		g.addFrame(3, 6);
		g.addFrame(4, 4);
		g.addFrame(5, 3);
		g.addFrame(3, 3);
		g.addFrame(4, 5);
		g.addFrame(8, 1);
		g.addFrame(2, 6);
		g.calcGameScore();
		assertEquals(88, g.gameScore);
	}
	
	@Test
	public void userStory7() {
		Game g = new Game();
		g.addFrame(10, 0);
		g.addFrame(4, 6);
		g.addFrame(7, 2);
		g.addFrame(3, 6);
		g.addFrame(4, 4);
		g.addFrame(5, 3);
		g.addFrame(3, 3);
		g.addFrame(4, 5);
		g.addFrame(8, 1);
		g.addFrame(2, 6);
		g.calcGameScore();
		assertEquals(103, g.gameScore);
	}
	
	@Test
	public void userStory8() {
		Game g = new Game();
		g.addFrame(10, 0);
		g.addFrame(10, 0);
		g.addFrame(7, 2);
		g.addFrame(3, 6);
		g.addFrame(4, 4);
		g.addFrame(5, 3);
		g.addFrame(3, 3);
		g.addFrame(4, 5);
		g.addFrame(8, 1);
		g.addFrame(2, 6);
		g.calcGameScore();
		assertEquals(112, g.gameScore);
	}
	
	@Test
	public void userStory9() {
		Game g = new Game();
		g.addFrame(8, 2);
		g.addFrame(5, 5);
		g.addFrame(7, 2);
		g.addFrame(3, 6);
		g.addFrame(4, 4);
		g.addFrame(5, 3);
		g.addFrame(3, 3);
		g.addFrame(4, 5);
		g.addFrame(8, 1);
		g.addFrame(2, 6);
		g.calcGameScore();
		assertEquals(98, g.gameScore);
	}
	
	@Test
	public void userStory10() {
		Game g = new Game();
		g.addFrame(1, 5);
		g.addFrame(3, 6);
		g.addFrame(7, 2);
		g.addFrame(3, 6);
		g.addFrame(4, 4);
		g.addFrame(5, 3);
		g.addFrame(3, 3);
		g.addFrame(4, 5);
		g.addFrame(8, 1);
		g.addFrame(2, 8);
		g.extraThrow = 7;
		g.calcGameScore();
		assertEquals(90, g.gameScore);
	}
	
	@Test
	public void userStory11() {
		Game g = new Game();
		g.addFrame(1, 5);
		g.addFrame(3, 6);
		g.addFrame(7, 2);
		g.addFrame(3, 6);
		g.addFrame(4, 4);
		g.addFrame(5, 3);
		g.addFrame(3, 3);
		g.addFrame(4, 5);
		g.addFrame(8, 1);
		g.addFrame(10, 0);
		g.extraThrow = 7;
		g.extraThrow2 = 2;
		g.calcGameScore();
		assertEquals(92, g.gameScore);
	}
}
