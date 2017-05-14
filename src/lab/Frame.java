package lab;

public class Frame {
	
	public int firstThrow = 0;
	public int secondThrow = 0;
	public int score = 0;
	
	Frame(int firstThrow, int secondThrow) {
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		this.score = this.firstThrow + this.secondThrow;
	}
}
