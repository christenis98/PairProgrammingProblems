package code;

public class DigitalToBerlin {
	String time;
	
	
	public DigitalToBerlin (String time) {
		this.time = time;
	}
	
	public void showberlin() {
		
		int secondNum = Integer.parseInt(time.substring(6, 8));
		
		FiveHourRow fiveHourRow= new FiveHourRow(Integer.parseInt(time.substring(0, 2)));
		
		SingleHourRow singleHourRow = new SingleHourRow(Integer.parseInt(time.substring(0, 2)));
		
		FiveMinutesRow fiveMinRow = new FiveMinutesRow(Integer.parseInt(time.substring(3, 5)));
		
		BottomMinutesRow bottomMin = new BottomMinutesRow(Integer.parseInt(time.substring(3, 5)));
		
		
		String seconds;
		if(secondNum % 2 == 0) seconds = "Y";
		else seconds = "O";
		
	
		System.out.println(seconds + "\n"
				+ fiveHourRow + "\n"
				+ singleHourRow + "\n"
				+ fiveMinRow + "\n"
				+ bottomMin + "\n"
				);
	}

	
}
