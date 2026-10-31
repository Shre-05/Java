import java.util.*;
public class Rec {
    // Print numbers from 1 to N.
    public static void printNum(int n){
        if(n==0){
            return ;        
        }
        printNum(n-1);
        System.out.println(n);
    }
    // Print numbers from N to 1.
    public static void printNumDesc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumDesc(n-1);
    }
    // Find the sum of first N natural numbers.
    public static int Sum(int n){
        int sum=0;
        if(n==0){
            return 0;
        }
        sum=n+Sum(n-1);
        return sum;
    }
    // Find the factorial of N.
    public static int fact(int n){
        int Fact=1;
        if(n==1 || n==0){
            return 1;
        }
        Fact=n*fact(n-1);
        return Fact;
    }
    // Calculate \(a^b\) using recursion.
    public static int power(int n,int x){
        if(x==0){
            return 1;
        }
        int pow=n*(power(n,x-1));
        return pow;
    }
    // Find the sum of digits of a number.
    public static int sumOfDigit(int num){
        if(num==0){
            return 0;
        }
        return (num%10)+sumOfDigit(num/10);
    }
    // count the number of digits of a num
    public static int count(int num){
        if(num==0){
            return 0;
        }
        return 1+count(num/10);
    }
    // Reverse a string using recursion.
    public static String RevString(String str){
        if(str==null ||str.length()<=1){
            return str;
        }
        return (RevString(str.substring(1)))+str.charAt(0);

    }
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter value of n: "));
        int n=sc.nextInt();
        System.out.println("Enter value of X: ");
        int x=sc.nextInt();
        System.out.println(("Enter your num: "));
        int num=sc.nextInt();
        System.out.println("Enter your String: ");
        String str=sc.next();

        printNum(n);
        printNumDesc(n);
        System.out.println("Sum of first "+n+" natural no is: "+Sum(n));
        System.out.println("Factorial of "+n+" is: "+fact(n));
        System.out.println(("The answer of "+n+"^"+x+" is: "+power(n,x)));
        System.out.println(("The sum of digits od num "+num+" is: "+sumOfDigit(num)));
        System.out.println("The count of num "+num+" is: "+count(num));
        System.out.println("The reversed string is: "+RevString(str));

        sc.close();

    }
}
