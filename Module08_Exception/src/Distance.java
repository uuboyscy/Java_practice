
public class Distance {

	int feet;
	int inch;
	
	public Distance(int feet, int inch) {	
		this.feet = feet;
		this.inch = inch;
	}
	
	void distance() 
	throws OverInchException {
		if(inch >= 12) {
			throw new OverInchException("Inch", inch);
		}
	}

	
} // end of class
