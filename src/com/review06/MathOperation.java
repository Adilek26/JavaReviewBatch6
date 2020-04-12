package com.review06;

public class MathOperation {
	

		// can be accessed from everywhere
		public int add(int num1, int num2) {
			int addition = num1 + num2;
			return addition;
		}

		// can be accessed from inside package, and inheritance
		protected void addNoReturn(int num1, int num2) {
			int addition = num1 + num2;
			System.out.println("Printing the result " + "inside the method " + addition);
		}

		// can be accessed from inside package
		int multiply(int num1, int num2) {
			System.out.println("the result is "+(num1*num2));
			return num1 * num2;
		}
		int sub(int num1, int num2) {
			int substrack=num1-num2;
			System.out.println("The result is "+substrack);
			return substrack;
		}
		double div(int num1, int num2) {
		double	div=num1/num2;
		System.out.println("The result is "+div);
			return div;
		}

		// can be accessed only within this class
		private void smth() {

		}
		public static void main(String[] args) {
			MathOperation str=new MathOperation();
			str.addNoReturn(20,10);
			str.multiply(20,10);
			str.sub(20,10);
			str.div(20, 10);
		}
}
