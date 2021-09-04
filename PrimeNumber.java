package week1day1;

public class PrimeNumber {
public static void main(String[] args) {
	int input = 4;
	
	int i;
	int flag =0;
	for (i = 2;i<= input/2  ; i++) {
		if(input %i==0) {
			flag++;
			break;
			
		}
		
		
		if (flag == 0 ) {
			System.out.println("primr number");
			
		}
		else {
			System.out.println("not prime number");
			
		}
	}
	
	
	 
}
}
