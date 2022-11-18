package code;

public class FiveMinutesRow {
	private int min;
	private String minString;
	
	public FiveMinutesRow(int min) {
		this.min = min;
	}
	
	public FiveMinutesRow(String time) {
		this.minString = time;
		
	}
	
	
	public String toString() {
		int numY = min / 5;
		
		char[] res =  {'O','O','O','O','O','O','O','O','O','O','O'};
		int i = 0;
		while(i < numY) {
			if (i % 3 == 2) {
				res[i] = 'R';
			}else 
				res[i] = 'Y';
			i++;
		}
		
		return new String(res);
	}
	
	public int toInt() {
		int min = 0;
		for(int i = 0; i < minString.length(); i++) {
			if(minString.charAt(i) == 'Y' || minString.charAt(i) == 'R') min++;
		}
		
		return min*5;
		
	}

}
