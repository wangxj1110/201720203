package count_2;
public class AdditionOperation extends math_2 {
	public AdditionOperation() {	
		generateBinaryOperation('+');		
	}
	public boolean checkingCalculation(int anInteger){
		return anInteger <= UPPER;
	}
	int calculate(int left, int right){
		return left+right;
	}
}