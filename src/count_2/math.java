package count_2;
import java.util.Random;
public class math{
	public static void generateExerciseOfBinaryEquations(){
		int m,n,v,i;
		Random random=new Random();
		for (i=0;i<50;i++) 
{
		int ov=random.nextInt(2);
		switch(ov){
		case 0:
				n=generateOperand();
				do{
					m=generateOperand();
					v=m+n;
				}while (v>=100);
				System.out.println((i + 1)+":"+n+"+"+m+"="+v);
			break;
		default:
				n=generateOperand();
				do{
					m=generateOperand();
					v=m-n;
				} 
while(v<0);
				System.out.println((i+1)+":"+m+"-"+n+"="+v); 
			break;
}
		}
	}
	public static int generateOperand() {
		// ����100���ڵ�����
		Random random = new Random();
		return(short)random.nextInt(101);
	}
	public static void printHeader2() {
		System.out.println("�������50��100���ڵļӷ����������Ŀ�����");
	}
	public static void main(String[] args) {
		printHeader2();
		generateExerciseOfBinaryEquations();
	}
}