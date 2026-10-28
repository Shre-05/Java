/*import java.util.*;
public class Function{
  public static void printName(String name){
    System.out.println("The name is: "+name);
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name you want to print:");
    String name=sc.nextLine();
    printName(name);
  }
}

import java.util.*;
public class Function{
  public static int Addition(int a,int b){
    int sum=a+b;
    System.out.println("the sum is: "+sum);
    return 1;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values of a and b: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    Addition(a,b);
  }
}

import java.util.*;
public class Function{
  public static int Product(int a,int b){
    return a*b ;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the num a and b: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    int product=Product(a,b);
    System.out.println("the product of two nos is: "+product);
  }

}
import java.util.*;
public class Function{
  public static int factorial(int n){
    int fact=1;
    for(int i=n;i>=1;i--){
      fact=fact*i;
    }
    return fact;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n=sc.nextInt();
    System.out.println("The factorial of num is: "+factorial(n));
  }
}

import java.util.*;
public class Function{
  public static int average(int a,int b,int c){
    return (a+b+c)/3;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the  nos:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    System.out.println("The average of 3 nos is "+average(a,b,c));
  }
}

import java.util.*;
public class Function{
  public static int Sum(int n){
  int sum=0;
    for(int i=1;i<=n;i++){
      if(i%2!=0){
        sum=sum+i;
      }
      else{
      sum=sum+0;
      }
    }
    return sum;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();
    System.out.println("The sum of 1 to "+n+" odd numebers is:"+Sum(n));
  }
}

import java.util.*;
public class Function{
  public static void comparator(int a,int b){
    if(a>b){
      System.out.println(a+" is greater");
    }
    else if(b>a){
      System.out.println(b+"is greater");
    }
    else{
      System.out.println("both are equal");
    }
    return;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter values of a and b:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    comparator(a,b);
  }
}

import java.util.*;
public class Function{
  public static double circum(double radius){
    double circum=2*3.14*radius;
    return circum;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius value: ");
    double radius=sc.nextInt();
    System.out.println("The circumference of a circle is: "+circum(radius));
  }
}

import java.util.*;
public class Function{
  public static void checkEligibility(int age){
    if(age>=18){
      System.out.println("Eligible to vote");
    }
    else
    System.out.println("not eligible to vote");
    return;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age=sc.nextInt();
    checkEligibility(age);
  }
}

public class Function{
  public static void main(String[]args){
    do{
    
    }while(true);
  }

import java.util.*;
public class Function{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int pos=0;
    int neg=0;
    int zero=0;
    char choice='y';
    
    while(choice=='y'||choice=='Y'){
      System.out.println("Enter the number:");
      int num=sc.nextInt();
      if(num>0){
        pos++;
      }
      else if(num<0)
      neg++;
      else
      zero++;
      
      System.out.println("Do you want to continue or stop:y/n");
      choice=sc.next().charAt(0);
    }
    System.out.println("positive count:"+pos+"\nNegative count:"+neg+"\nzero count:"+zero);
  }

}

import java.util.*;
public class Function{
  public static int findPower(int x,int n){
    int result=1;
    for(int i=1;i<=n;i++){
      result=result*x;
    }
    return result;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of x and n");
    int x=sc.nextInt();
    int n=sc.nextInt();
    
    System.out.println("The result is: "+findPower(x,n));
  
  }
  
}
import java.util.*;

public class Function{
  public static int gcdCalculate(int num1,int num2){
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
    System.out.println("Enter the num1 and num 2:");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int gcd=gcdCalculate(num1,num2);
    System.out.println(gcd);
  }
}
*/
import java.util.*;
public class Function{
  public static int gcdCal(int num1,int num2){
  int gcd=1;
    for(int i=1;i<=num1 && i<=num2;i++){
      if(num1%i==0 && num2%i==0){
        gcd=i;
      }
    }
    return gcd;
    
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    System.out.println(gcdCal(num1,num2));
  }
}
