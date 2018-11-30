
public class TimeConvert {

	public static String milliSecToHMS(long sin){
		
		// h, m, s, millis;
		long[] t = new long[4];
		
		t[0] = sin%1000;
		sin /= 1000;
		
		for(int i = 1 ; i < t.length ; i++) {
			t[i] = sin%60;
			sin /= 60;
		}		
		
		return "" + t[3] + ":" + t[2] + ":" + t[1] + ":" + t[0];
	}
	
	public static String secToHMS(long sin){
		
		// h, m, s;
		long[] t = new long[3];
				
		for(int i = 0 ; i < t.length ; i++) {
			t[i] = sin%60;
			sin /= 60;
		}		
				
		return "" + t[2] + ":" + t[1] + ":" + t[0];
	}
	
} // ned of class
