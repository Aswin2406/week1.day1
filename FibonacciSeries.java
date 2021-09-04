package week1day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num =3;
		int firstnum=4;
		int secnum=3;
		int sum;
		
		System.out.println(num);
		System.out.println("********************************************");
		
		
		System.out.println(++firstnum);
		System.out.println( "********************************************* ");
		
		
		System.out.println(++secnum);
        System.out.println("*********************************************");
        
        sum=firstnum+secnum;
		System.out.println("sum answer:"+  firstnum+secnum);
		System.out.println("*********************************************");
		
		
		
	   firstnum=secnum;
	   System.out.println("*********************************************");
	   
	   
	   secnum=sum;
	   System.out.println("*******************************************");
		  
	   
	   System.out.println("sum final ouput:"+ sum);
		
		
	}
		
			
		}
	
	


