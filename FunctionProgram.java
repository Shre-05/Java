import java.util.*;
public class FunctionProgram{
	//print given name in function
	/*public static void printName(String name){
		System.out.println(name);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		printName(name);
	}*/
	
	//A function to add two nos and return sum
	/*public static void add(int a,int b){
		int sum=a+b;
		System.out.println(sum);
		return;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		add(a,b);
	}*/
	
	//to multiply two nos:
	/*public static int multiply(int a,int b){
		int mul=a*b;
		return mul;
	}
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(multiply(a,b));
	}*/
	//find factorial of no:
	/*public static int factorial(int n){
	int fact=1;
		for(int i=n;i>=1;i--){
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
	}*/
	
	//3 nos from user and make function to print avg
	/*public static int average(int a,int b,int c){
		int avg=(a+b+c)/3;
		return avg;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(average(a,b,c));
	}*/
	
	//sum of all odd nos from 1 to n
	/*public static int sum(int n){
		int result=0;
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				result=result+i;
			}
		}
		return result;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sum(n));
	}*/
	
	//2 nos as i/p return greater of two
	/*public static int compare(int a,int b){
		if(a>b)
		return a;
		else if(b>a)
		return b;
		else
		return 0;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print(compare(a,b));
	}*/
	//radius as i/p return circumference
	/*public static double circum(double radius){
		double cir=2*3.14*radius;
		return cir;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextInt();
		System.out.print(circum(radius)); 
	}*/
	//age-i/p o/p-eligible to vote or not
	/*public static void checkEligibility(int age){
		if(age>=18)
		System.out.println("Eligible to vote");
		else 
		System.out.println("not eligible");
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		checkEligibility(age);
	}*/
	
	//infinite loop using while loop
	/*public static void main(String[]args){
		do{
		
		}while(true);
	}*/
	
	//write a program to enter he number till user wants and at the end should display the count of positve,negative and zeros entered.
	/*public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int positive=0;
		int negative=0;
		int zero=0;
		char choice='y';
		
		while(choice=='y'|| choice=='Y'){
			System.out.println("Enter the num");
			int num=sc.nextInt();
			if(num>0)
			positive++;
			else if(num<0)
			negative++;
			else
			zero++;
			
			System.out.println("Do you want to continue? y/n");
			choice=sc.next().charAt(0);
		}
		System.out.println(positive);
		System.out.println(negative);
		System.out.println(zero);
	}*/
	
	//x,n-i/p, find x^n
	/*public static int power(int x,int n){
		int result=x;
		for(int i=1;i<n;i++){
			result=result*x;
		}return result;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(power(x,n));
	}*/
	
	//calculate gcd
	/*public static int calculateGcd(int num1,int num2){
		while(num1!=num2){
			if(num1>num2)
			num1=num1-num2;
			else
			num2=num2-num1;
		}
		return num1;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(calculateGcd(num1,num2));
	}*/
	/*public static int gcd(int num1,int num2){
	int gcd=1;
		for (int i=1;i<=num1 && i<=num2;i++){
			if(num1%i==0 && num2%i==0)
			gcd=i;
		}
		return gcd;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(gcd(num1,num2));
	}*/
	
	public static void fib(int n){
		int num1=0;
		int num2=1;
		int num3;
		for(int i=1;i<=n;i++){
			System.out.print(num1+" ");
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fib(n);
	}
}
