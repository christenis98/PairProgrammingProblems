package code;

public class BerlinToDigital {
	
	private String berlinTime;
	
	public BerlinToDigital(String berlin) {
		this.berlinTime = berlin;
	}
	
	public void showDigitalTime() {
		
		int seconds = secToInt(berlinTime.charAt(0));
	
		FiveHourRow fiveHourRow = new FiveHourRow(berlinTime.substring(1, 5));
		
		SingleHourRow singleHourRow = new SingleHourRow(berlinTime.substring(5, 9));
		
		FiveMinutesRow fiveMinRow = new FiveMinutesRow(berlinTime.substring(9, 20));
		
		BottomMinutesRow bottomMin = new BottomMinutesRow(berlinTime.substring(20, 24));
		
		int hours = fiveHourRow.toInt() + singleHourRow.toInt();
		int minutes = fiveMinRow.toInt() + bottomMin.toInt();
		
		String time = String.format("%02d", hours) + ":" +
				String.format("%02d", minutes) + ":" +
				String.format("%02d", seconds);
		
		;
		
		System.out.println(time);
	}
	
	private int secToInt(char c) {
		int n = (int) Math.random();
		if (c == 'Y') {
			return (2*n) % 60;
		}
		else return (2*n + 1) % 60;
	}
	
}
