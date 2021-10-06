package fibonnaciSequence;
import java.util.Scanner;
import java.lang.Math;

public class FPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		System.out.println("Print Two Numbers");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3;
//		int count = 11;
//		for(int i = 0; i<count;i++) {
//			num3 = num1 + num2;
//			System.out.println("" + num3);
//			num1 = num2;
//			num2 = num3;
//		}
//*************************************************************NUM2*************************************************
//		System.out.println("Please enter any number");
//		int number = scan.nextInt(), originalNumber, remainder, result = 0, n = 0;
//
//        for (originalNumber = number;originalNumber != 0; originalNumber /= 10, ++n);
//
//        
//        
//        for (originalNumber = number;originalNumber != 0; originalNumber /= 10)
//        {
//            remainder = originalNumber % 10;
//            result += Math.pow(remainder, n);
//        }
//
//        if(result == number)
//            System.out.println(number + " is an Armstrong number.");
//        else
//            System.out.println(number + " is not an Armstrong number.");
//		********************************************************NUM 3*********************************
		
		
		int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		
		
		
		
		
		
		
		
    }
			
		}
	


