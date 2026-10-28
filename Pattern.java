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
}}
