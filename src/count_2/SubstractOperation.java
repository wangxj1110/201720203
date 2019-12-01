package count_2;
public class SubstractOperation extends math_2 { 
public SubstractOperation() { 
	generateBinaryOperation('-');
 } 
boolean checkingCalculation(int anInteger){
 return anInteger >= LOWER;
 }
int calculate(int left, int right){
 return left-right;
 } 
}