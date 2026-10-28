import java.util.*;
class calc{
  public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the values of a and b");
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   
	   System.out.println("Enter the number of operation you want to perform: ");
	   System.out.println("1:Addition\n2:Subtraction\n3:Multiplication\n4:Division");
	    int choice=sc.nextInt();
	    
	    switch(choice){
	    case 1:System.out.println(a+b);
	    break;
	    case 2:System.out.println(a-b);
	    break;
	    case 3:System.out.println(a*b);
	    break;
	    case 4:System.out.println(a/b);
	    break;
	    }
	   
	   
}
}

