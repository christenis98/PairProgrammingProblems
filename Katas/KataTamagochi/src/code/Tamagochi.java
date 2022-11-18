package code;

public class Tamagochi {
	private int hungriness;
	private int fullness;
	private int tiredness;
	private int happiness;
	
	public Tamagochi() {
		this.hungriness = 0;
		this.happiness = 100;
		this.tiredness = 0;
		this.fullness = 100;
	}
	
	
	

	public void parseAction(int action) {
		switch (action) {
		case 1: 
			this.feed();
			break;
		case 2:
			this.play();
			break;
		case 3:
			this.sleep();
			break;
		case 4:
			this.poop();
			break;
		default:
			this.timePass();
		}
		
	}

	public void feed() {
		this.fullness +=20;
		this.hungriness -=20;
		this.checker();
	}
	
	public void play() {
		this.happiness += 20;
		this.checker();
	}
	
	public void sleep() {
		this.tiredness -=20;
		this.checker();
	}
	
	
	public void poop() {
		this.fullness -= 50;
		this.checker();
	}
	
	public void timePass() {
		this.tiredness+=5;
		this.hungriness+=5;
		this.happiness-=5;
		
	}
	
	public void checker() {
		if(this.fullness > 100) this.fullness = 100;
		if(this.fullness < 0) this.fullness = 0;
		if(this.hungriness > 100) this.hungriness= 100;
		if(this.hungriness < 0) this.hungriness = 0;
		if(this.tiredness > 100)this.tiredness = 100;
		if(this.tiredness < 0)this.tiredness = 0;
		if(this.happiness > 100)this.happiness = 100;
		if (this.happiness < 0)this.happiness = 0;
	}

	public int getHungriness() {
		return hungriness;
	}



	public int getFullness() {
		return fullness;
	}



	public int getTiredness() {
		return tiredness;
	}



	public int getHappiness() {
		return happiness;
	}

}
