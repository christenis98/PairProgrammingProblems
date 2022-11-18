package code;

public class SingleHourRow {
	private int hour;
	private String hourString;
	
	public SingleHourRow(int hour) {
		this.hour = hour;
	}
	
	public SingleHourRow (String hour) {
		this.hourString = hour;
	}
	
	public String toString() {
		int numH = hour % 5;
		
		char[] res =  {'O','O','O','O'};
		int i = 0;
		while(i < numH) {
			res[i] = 'R';
			i++;
		}
		
		return new String(res);
	}


	public int toInt() {
		int hour = 0;
		for(int i = 0; i < hourString.length(); i++) {
			if(hourString.charAt(i) == 'R') hour++;
		}
		
		return hour;
		
	}

}
