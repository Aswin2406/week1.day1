package week1day1;

public class Factorial {
	public static void main(String[] args) {
		int input =10;
		int i=1;
		int a=0;
		
		for ( i = input-1; i >0; i--) {
			
			a=input*i;   
			input=a;
			System.out.println(+i);
			
		}
		System.out.println("factorial:"+input);
	}
}
