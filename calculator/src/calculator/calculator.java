package calculator;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class calculator {
	
	private double a;
	private double b;
	private double answer;

	   public double add() {
	        answer = a+b;
	        return answer;          
	    }

	  public double subtract() {
	        answer = a-b;
	        return answer;          
	    }

	    public double multiply() {
	        answer = a*b;
	        return answer;          
	    }

	    public double divide() {
	        answer = a/b;
	        return answer;          
	    }

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double getAnswer() {
			return answer;
		}

		public void setAnswer(double answer) {
			this.answer = answer;
		}

		
		
	    
}

