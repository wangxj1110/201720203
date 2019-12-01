package count_2;
public class Test{
	public static void main(String[] args) {
		math_2 bop;
        System.out.println("test1:('+')");   
        for (int i=0; i<10; i++){
        	bop = new AdditionOperation();
        	System.out.println(bop);
        }
        System.out.println("test1:('-')");   
        for (int i=0; i<10; i++){
        	bop = new SubstractOperation();
        	System.out.println(bop);
        }
       
	}
}