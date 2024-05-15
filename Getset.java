package pack;

public class Getset {
	private int runs = 100;
	private int balls = 100;
	private int strikerate = (runs/balls)*100;
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}
	public float getStrikerate() {
		return strikerate;
	}
	public void setStrikerate(int strikerate) {
		this.strikerate = strikerate;
	}
	
	

}
