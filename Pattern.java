import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter your rows");
int rows=sc.nextInt();
for(int i=1;i<=rows-1;i++) {
	for(int j=1;j<i;j++) {
		System.out.print("*"+" ");
	}
	
	System.out.println("");
}
	for(int i=rows-1;i>=0;i--) 
	{
		for(int j=0; j <= i-1;j++) {
		System.out.print("*"+" ");
	}
	
	System.out.println("");
}
	sc.close();
	}

}
