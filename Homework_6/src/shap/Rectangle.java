package shap;

public class Rectangle implements Shap {

	double w1, w2; // rectangle
	
	public double computeArea() {
		return w1 * w2;
	}
	
	public double computeCircumference() {
		return 2 * (w1 + w2);
	}
	
}
