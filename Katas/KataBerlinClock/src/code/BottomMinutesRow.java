package code;

public class BottomMinutesRow {
	private int min;
	private String minString;
	
	public BottomMinutesRow(int min) {
		this.min = min;
	}
	
	public BottomMinutesRow(String min) {
		this.minString = min;
	}
	
	public String toString() {
		int numY = min % 5;
		
		char[] res =  {'O','O','O','O'};
		int i = 0;
		while(i < numY) {
			res[i] = 'Y';
			i++;
		}
		
		return new String(res);
	}
	
	public int toInt() {
		int min = 0;
		for(int i = 0; i< minString.length() ; i++) {
			if(minString.charAt(i) == 'Y') min++;
		}
		
		return min;
		
	}

}


