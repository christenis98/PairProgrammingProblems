package code;

public class BerlinClock {

	public static void main(String[] args) {
		
		String time = "16:50:06";
		
		String berlin = "ORROOROOOYYRYYRYOOOOYYOO	";

		DigitalToBerlin toBerlin = new DigitalToBerlin(time);
		
		BerlinToDigital toDigital = new BerlinToDigital(berlin);
		
		toDigital.showDigitalTime();
	}

}
