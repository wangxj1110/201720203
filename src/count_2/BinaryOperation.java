package count_2;
import java.util.Random;
public class BinaryOperation {
	static String [] e=new String[50];
	static short [] r=new short[50];
	public static void printHeader()
{
		System.out.println("�������50��100���ڵļӷ�������ʽ��ϰ��");
	}
	public static void generateEquations()
{
		short m=0,n=0,v=0,ov=0;  		
		char o='+';
		Random random = new Random();
		for(int i=0;i<50;i++)
{
			ov=(short)random.nextInt(2); 
			m=(short)random.nextInt(101);		// �������������
			if(ov==1)
{
				do 
{
					n=(short)random.nextInt(101);
					v=(short) (m+n);
				} 
while(100<v||v<0);			
				o='+';
			} 
else 
{
				do 
{
					n=(short)random.nextInt(101);
					v=(short) (m-n);
				}
 while (100<v||v<0);
				o='-';
			}			
			e[i]=""+m+o+n+"=";
			r[i]=v;
		}
	}
	public static void printExercise(){
		for (int i=0;i<e.length; i++){
			System.out.println(""+(i+1)+":\t"+e[i]);
		}
	}
	
public static void printCalculations(){
		for (int i=0;i<r.length; i++){
			System.out.println(""+(i+1)+":\t"+r[i]);
		}
	}
	public static void main(String[] args) {
		printHeader();
		generateEquations();
		printExercise();
		System.out.println();
		System.out.println("������ϰ��Ĳο���:");
		printCalculations();	
	}
}