package lab;

public class Frame {
	
	public int firstThrow = 0;
	public int secondThrow = 0;
	public int score = 0;
	public boolean strike = false;
	public boolean spare = false;
	
	Frame(int firstThrow, int secondThrow) {
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		this.score = this.firstThrow + this.secondThrow;
		
		if(this.firstThrow == 10 || this.secondThrow == 10) {
			this.strike = true;
		}
		else if(this.score == 10) {
			this.spare = true;
		}
	}
	
	public void print() {
		System.out.println("[" + this.firstThrow + "," + this.secondThrow + "]");
	}
}
