import java.util.*;
public class Loop{
	public static void main(String[]args){
	  /*for(int i=0;i<100;i++){
	    System.out.println("Hello world");
	  }
	  for(int i=0;i<=10;i++){
	    System.out.println(i);
	  }
	  int i=0;
	  while(i<11){
	    System.out.println(i);
	    i++;
	  }
	  int i=0;
	  do{
	    System.out.println(i);
	    i++;
	  }while(i<1 );
	  
	  //print sum of n numbers:
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int sum=0;
	  for(int i=1;i<=n;i++){
	    sum=sum+i;
	  }
	  System.out.println(sum);*/
	  
	  //print table of number given by user:
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the table number:");
	  int n=sc.nextInt();
	  System.out.println("\n");
	  System.out.println("The table of "+n+" is:");
	  int mul=0;
	  for(int i=1;i<=10;i++){
	    mul=n*i;
	    System.out.println(mul);
	  }
	}
}
