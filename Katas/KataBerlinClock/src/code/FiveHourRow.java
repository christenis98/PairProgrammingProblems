package code;

public class FiveHourRow {
	
	private int hour;
	private String hourString;
	
	public FiveHourRow(int hour) {
		this.hour = hour;
	}
	
	public FiveHourRow(String hourString) {
		this.hourString = hourString;
		
	}
	
	public String toString() {
		int numH = hour / 5;
		
		char[] res =  {'O','O','O','O'};
		int i=0;
		while(i < numH) {
			res[i] = 'R';
			i++;
		}
		
		return new String(res);
	}
	
	public int toInt() {
		int min = 0;
		for(int i = 0; i < hourString.length(); i++) {
			if(hourString.charAt(i) == 'Y' || hourString.charAt(i) == 'R') min++;
		}
		
		return min*5;
		
	}

}
