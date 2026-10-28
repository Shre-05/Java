import java.util.*;
public class calculator{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the wo numbers a and b:");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Enter the number of operation you want to perform:");
		System.out.println("1:Addition\n2:Subtraction\n3:Multiplication\n4:Division");
		
		int choice=sc.nextInt();
		switch(choice){
			case 1:System.out.println(a+b);
			break;
			case 2:if(a>b){
				System.out.println(a-b);
			}else if(a<b){
				System.out.println(b-a);
			}else{
				System.out.println(a-b);
			}
			break;
			case 3:System.out.println(a*b);
			break;
			case 4:if(a>b){
				System.out.println(a/b);
			}
			else if(a<b){
				System.out.println(b/a);
			}
			else if(b==0){
				System.out.println("Invalid division");	
			}
			break;
			default: System.out.println("Invalid input");
		}
	}
}
