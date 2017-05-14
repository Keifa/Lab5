
package lab;

import lab.Frame;

public class Game {
	
	private int NR_OF_FRAMES = 10;
	private int currentFrame = 0;
	
	public Frame[] frames = new Frame[NR_OF_FRAMES];
	public int gameScore = 0;
	
	public int extraThrow = 0;
	public int extraThrow2 = 0;
	
	Game() {
		
	}
	
	public void addFrame(int firstThrow, int secondThrow) {
		if(this.currentFrame < this.NR_OF_FRAMES) {
			this.frames[this.currentFrame] = new Frame(firstThrow, secondThrow);
			this.gameScore += this.frames[this.currentFrame++].score;
		}
	}
	
	public void calcGameScore() {
		boolean prevWasStrike = false;
		for(int i = 0; i < this.NR_OF_FRAMES; i++) {		
			if(this.frames[i].strike && i < this.NR_OF_FRAMES - 1) {
				if(prevWasStrike) {
					this.gameScore += this.frames[i + 1].firstThrow;
				}
				this.gameScore += this.frames[i + 1].score;
				prevWasStrike = true;
			}
			else if(this.frames[i].spare && i < this.NR_OF_FRAMES - 1) {
				this.gameScore += this.frames[i + 1].firstThrow;
				prevWasStrike = false;
			}
			else {
				if(this.frames[i].spare) {
					if(prevWasStrike) {
						this.gameScore += this.frames[i].firstThrow;
					}
					this.gameScore += this.extraThrow;
				}
				else if(this.frames[i].strike) {
					if(prevWasStrike) {
						this.gameScore += this.frames[i].score;
					}
					this.gameScore += this.extraThrow + this.extraThrow2;
				}
				
				prevWasStrike = false;
			}
		}
	}
	
	public void printGame() {
		for(int i = 0; i < this.currentFrame; i++) {
			this.frames[i].print();
		}
	}
}
