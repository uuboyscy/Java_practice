package shap;

public class Cricle implements Shap{

	final double PI = 3.14159;
	double r; // circle radius	
	
	public double computeArea() {
		return PI*r*r;
	}
	
	public double computeCircumference() {
		return 2 * PI * r;
	}
	
}
