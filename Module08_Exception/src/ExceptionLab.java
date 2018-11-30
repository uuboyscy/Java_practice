
public class ExceptionLab {

	public static void main(String[] args) {
		
		Distance d = new Distance(5,15);
		
		try {			
			d.distance();
		}catch(OverInchException k) {
			System.out.println(k.getMsg() + " " +k.getInch() + " is over 12");
		}

	}

}
