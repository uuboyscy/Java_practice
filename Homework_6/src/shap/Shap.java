/*
 * 2.	介面的練習-Shape
有一interface名為Shape，內有兩個成員方法：一為計算面積computeArea()，另為計算周長computeCircumference()。
寫兩個類別分別為Circle和Rectangle，用以實作上述介面，並驗証結果。
 */

package shap;

public interface Shap {

	public double computeArea();
	public double computeCircumference();
	
} // end of interface
