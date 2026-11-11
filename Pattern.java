import java.util.*;
public class Pattern{
public static void main(String[]args){
  int n=4;
  int m=5;
  /*
  *****
  *****
  *****
  *****
  */
  for(int i=1;i<=n;i++){
    for(int j=1;j<=m;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  
  /*
  *****
  *   *
  *   *
  *****
  */
  for(int i=1;i<=n;i++){
    for(int j=1;j<=m;j++){
      if(i==1||i==n||j==1||j==m){
        System.out.print("*");
      }else
      System.out.print(" ");
    }
    System.out.println();
  }
  
  /*
  *
  **
  ***
  ****
  */
  for (int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  
  /*
  ****
  ***
  **
  *
  */
  for(int i=4;i>=1;i--){
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  
  /*
     *
    **
   ***
  ****
  */
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
      System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  
  /*
  1
  12
  123
  1234
  12345*/
  
  for(int i=1;i<=m;i++){
    for(int j=1;j<=i;j++){
      System.out.print(j);
    }
    System.out.println();
  }
  
  /*
  12345
  1234
  123
  12
  1 */
  
  for(int i=m;i>=1;i--){
    for(int j=1;j<=i;j++){
      System.out.print(j+" ");
    }
    System.out.println();
  }
  for(int i=1;i<=m;i++){
    for(int j=1;j<=m-i+1;j++){
      System.out.print(j);
    }
    System.out.println();
  }
  
  /*
  1
  2 3
  4 5 6
  7 8 9 10 
  11 12 13 14 15*/
  int num=1;
  for(int i=1;i<=m;i++){
    for(int j=1;j<=i;j++){
      System.out.print(num+" ");
      num=num+1;
    }
    System.out.println();
  }
  
  
  /*
  1
  01
  101
  0101
  10101*/
  for(int i=1;i<=m;i++){
    for(int j=1;j<=i;j++){
    int sum=i+j;
      if(sum%2!=0){
        System.out.print("0 ");
      }
      else{
        System.out.print("1 ");
      }
    }
    System.out.println();
  }
  
  /*
      *****
     *****
    *****
   *****
  *****
  */
  for(int i=1;i<=5;i++){
    for(int j=1;j<=5-i;j++){
      System.out.print(" ");
    }
    for(int j=1;j<=5;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  
  /*
  *      *
  **    **
  ***  ***
  ********
  ***  ***
  **    **
  *      *
  */
  for(int i=1;i<=4;i++){
    //upper half part
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    //spaces
    int spaces=2*(4-i);
    for(int j=1;j<=spaces;j++){
      System.out.print(" ");
    }
    //second half part
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  for(int i=4;i>=1;i--){
    //upper half part
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    //spaces
    int spaces=2*(4-i);
    for(int j=1;j<=spaces;j++){
      System.out.print(" ");
    }
    //second half part
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  
  /*
      *****
     *   *
    *   *
   *   *
  *****
  */
  for(int i=1;i<=5;i++){
    //spaces
    int spaces=5-i;
    for(int j=1;j<=spaces;j++){
      System.out.print(" ");
    }
    //star
    for(int j=1;j<=5;j++){
      if(i==1||i==5||j==1||j==5){
        System.out.print("*");
      }
      else{
        System.out.print(" ");
      }
    }
    System.out.println();
  }
  /*
      1    
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5*/
  for(int i=1;i<=5;i++){
    //spaces
    int spaces=n-i;
    for(int j=1;j<=spaces;j++){
      System.out.print(" ");
    }
    //num
    for(int j=1;j<=i;j++){
      System.out.print(i+" ");
    }
    
    System.out.println();
  }
  /*
       1
      212
     32123
    4321234
   543212345*/
  for(int i=1;i<=5;i++){
    //spaces
    int spaces=n-i;
    for(int j=1;j<=spaces;j++){
      System.out.print("  ");
    }
    //number-half first
    for(int j=i;j>=1;j--){
      System.out.print(j+" ");
    }
    for(int j=2;j<=i;j++){
      System.out.print(j+" ");
    }
    System.out.println();
  }
  
  /*
     *
    ***
   *****
  *******
  *******
   *****
    ***
     *
  */
  for(int i=1;i<=4;i++){
    int spaces=4-i;
    for(int j=1;j<=spaces;j++){
      System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    for(int j=2;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  for(int i=4;i>=1;i--){
      int spaces=4-i;
      for(int j=1;j<=spaces;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      for(int j=2;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    /*
    *********
     *******
      *****
       ***
        *
    */
   for(int i=4;i>=0;i--){
    for(int j=0;j<n-i-1;j++){
      System.out.print(" ");
    }
    for(int j=0;j<2*i+1;j++){
      System.out.print("*");
    }
    System.out.println();
   }
  
   for(int i=0;i<5;i++){
    for(int j=0;j<i;j++){
      System.out.print(" ");
    }
    for(int j=0;j<2*5-(2*i+1);j++){
      System.out.print("*");
    }
    for(int j=0;j<i;j++){
      System.out.print(" ");
    }
    System.out.println();
   }
  //  diamond pattern
  //first half
  for(int i=0;i<5;i++){
    for(int j=0;j<5-1-i;j++){
      System.out.print(" ");
    }
    for(int j=0;j<2*i+1;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  // second half
  for(int i=0;i<5;i++){
    for (int j=0;j<i;j++){
      System.out.print(" ");
    }
    for(int j=0;j<2*5-(2*i+1);j++){
      System.out.print("*");
    }
    for (int j=0;j<i;j++){
      System.out.print(" ");
    }
    System.out.println();
  }

  /*
  *
  **
  ***
  ****
  *****
  ****
  ***
  **
  *
  
  */
//  first half
 for(int i=1;i<=5;i++){
  for(int j=1;j<=i;j++){
    System.out.print("*");
  }
  for(int j=1;j<=5-i;j++){
    System.out.print(" ");
  }
  System.out.println();
 }
//  second half
 for(int i=1;i<=5;i++){
  for(int j=1;j<=5-i;j++){
    System.out.print("*");
  }
  for(int j=1;j<=i;j++){
    System.out.print(" ");
  }
  System.out.println();
 }

 /*
 1
 01
 101
 0101
 10101 */
 for(int i=1;i<=5;i++){
  for(int j=1;j<=i;j++){
    if((i+j)%2==0){
      System.out.print(1);
    }
    else{
      System.out.print(0);
    }
  }
  System.out.println();
 }

 /*
 1      1
 12    21
 123  321
 12344321 */
 for(int i=1;i<=4;i++){
  // num
  for(int j=1;j<=i;j++){
    System.out.print(j);
  }
  // space
  for(int j=1;j<=2*4-2*i;j++){
    System.out.print(" ");
  }
  // num
  for(int j=i;j>=1;j--){
    System.out.print(j);
  }
  System.out.println();
 }
int number=1;
for(int i=1;i<=5;i++){
  for(int j=1;j<=i;j++){
    System.out.print(number+" ");
    number+=1;
  }
  System.out.println();
 }

 /*
 A
 AB
 ABC
 ABCD
 ABCDE */

 for(int i=1;i<=5;i++){
  for(char ch='A';ch<'A'+i;ch++){
    System.out.print(ch+" ");
  }
  System.out.println();
 }

/*
ABCDE
ABCD
ABC
AB
A */
System.out.println();
for(int i=0;i<5;i++){
  for(char ch='A';ch<='A'+(5-i-1);ch++){
    System.out.print(ch+" ");
  }
  System.out.println();
}

/*
A
BB
CCC
DDDD
EEEEE */
for(int i=0;i<5;i++){
  char ch=(char)('A'+i);
  for(int j=0;j<=i;j++){
    System.out.print(ch+" ");
  }
  System.out.println();
}
}}


