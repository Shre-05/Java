/*
//print 5 to 1 no;
import java.util.*;
public class Recusion{
    public static void printNum(int n){
        if(n==0)
            return;
        System.out.println(n);
        printNum(n-1);
    }
;    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNum(n);
    }
}
//print 1-5 number/start -end
import java.util.*;
public class Recusion{
    public static void printNum(int start,int end){
        if(start>end){
            return;
        }
        System.out.print(start+" ");
        printNum(start+1,end);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        printNum(start,end);
    }
}

//calculate sum
import java.util.*;
public class Recusion{
    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        printSum(i+1,n,sum);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        printSum(i,n,sum);
    }
}

//calculate factorial
import java.util.*;
public class Recusion{
    public static int printFact(int n){
    if(n==0||n==1){
        return 1;
    }
    int factNM1=printFact(n-1);
    int fact=n*factNM1;
    return fact;
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=printFact(n);
    System.out.println(ans);
}
}

import java.util.*;
public class Recusion{
    public static int printFact(int n){
        if(n==1||n==0){
            return 1;
        }
        int factNM1=printFact(n-1);
        int fact=n*factNM1;
        return fact;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=printFact(n); 
        System.out.println(ans);
        
    }
}

import java.util.*;
public class Recusion{
    public static void printFib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        printFib(b,c,n-1);
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=0;
    int b=1;
    System.out.print(a);
    System.out.print(b);
    int n=7;
    printFib(a,b,n-2);}
}

//calculate x^n with stack height n
import java.util.*;
public class Recusion{
    public static int printPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int pownm1=printPower(x,n-1);
        int pown=x*pownm1;
        return pown;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int ans=printPower(x,n);
        System.out.println(ans);
    }
}

//calculate x^n with stack height logn
public class Recusion{
    public static int printPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return printPower(x, n/2)*printPower(x, n/2);
        }
        else
            return printPower(x, n/2)*printPower(x, n/2)*x;
    }
    public static void main(String[]args){
        int x=2;
        int n=5;
        int ans=printPower(x,n);
        System.out.println(ans);
    }
}

//tower of hanoi
//time complexity-o(2^n)
import java.util.*;
public class Recusion{
    public static void towerOfHanoi(int n,String src,String hlp,String dest){
        if(n==1){
            System.out.println("tranfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, hlp);
        System.out.println("tranfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, hlp, src, dest);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanoi(n,"s","h","d");
    }
}

//print a string in reverse
//tc-o(n) where n=lengt of string
import java.util.*;
public class Recusion{
    public static void printRev(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(0));
            return ;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printRev(str,str.length()-1);
    }
}

//to print the first and last occurance of character
//tc-o(n)- n is legth of string
import java.util.*;
public class Recusion{
    public static int first=-1;
    public static int last=-1;
    public static void printOccur(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar=str.charAt(idx);
        if(currentChar==element){
            if(first==-1){
                first=idx;
            }
            else
                last=idx;
        }
        printOccur(str, idx+1, element);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str="abaacdaefaa";
        printOccur(str,0,'a');
    }
}

//to check if an array is in strictly inreasing order
public class Recusion{
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else
            return false;
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        System.out.println(isSorted(arr,0));
    }
}
//move x to end of string
public class Recusion{
    public static void MoveToEnd(String str,int i,int count,String newString){
        
        if(i==str.length()){
            for(int j=0;j<count;j++){
                newString=newString+'x';
            }
            System.out.println(newString);
            return ;
        }
        char curr=str.charAt(i);
        if(curr=='x'){
            count++;
            MoveToEnd(str,i+1,count,newString);
            
        }
        else{
            newString=newString+curr;
            MoveToEnd(str,i+1,count,newString);
        }
    }
    public static void main(String[]args){
        String str="axbcxxd";
        MoveToEnd(str, 0, 0, "");
    }
}

//remove duplicates
public class Recusion{
    public static boolean[] map=new boolean[26];
    public static void removeDup(String str,int i,String newString){
        if(i==str.length()){
            System.out.println(newString);
            return ;
        }
    char curr=str.charAt(i);
    if((map[curr-'a'])==true){
        removeDup(str, i+1, newString);
    }
    else{
        newString+=curr;
        map[curr-'a']=true;
        removeDup(str, i+1, newString);
    }
}
    public static void main(String[]args){
        String str="abbccda";
        removeDup(str,0,"");
    }
}
    

//print all subsequences of string
//tc-o(n^2)
public class Recusion{
    public static void printSub(String str,int i,String newString){
        if(i==str.length()){
            System.out.println(newString);
            return ;
        }
        char curr=str.charAt(i);
        //to be in
        printSub(str, i+1, newString+curr);
        //not to be in
        printSub(str, i+1, newString);
    }
    public static void main(String[]args){
        String str="abc";
        printSub(str,0,"");
    }
}

// print uninque substrings
import java.util.HashSet;
public class Recusion{
    public static void printSub(String str,int i,String newString,HashSet<String>set){
        if(i==str.length()){
            if(set.contains(newString)){
                return ;
            }
            else{
            System.out.println(newString);
            set.add(newString);
            return ;}
        }
        char curr=str.charAt(i);
        //to be in
        printSub(str,i+1,newString+curr,set);
        //not to be in
        printSub(str,i+1,newString,set);
    }
    public static void main(String[]args){
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        printSub(str,0,"",set);
    }
}

//print permutation of a string
public class Recusion{
    public static void printPerm(String str,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstring=str.substring(0,i)+str.substring(i+1);
            printPerm(newstring, perm+curr);
        }
    }
    public static void main(String[]args){
        String str="abc";
        printPerm(str,"");
    }
}

//count the path in maze to reach a certain point
public class Recusion{
    public  static int countPath(int i,int j,int n,int m){
        if(i==n && j==m){
            return 0;
        }
        if(i==n-1 || j==n-1){
            return 1;
        }
        int donwPath=countPath(i+1,j,n,m);
        int rightPath=countPath(i,j+1,n,m);
        int total=donwPath+rightPath;
        return total;
    }
    public static void main(String[]args){
        int n=3;
        int m=3;
        int total=countPath(0,0,n,m);
        System.out.println(total);
    }
}*/

//place tile of size 1xm in nxm maze
public class Recusion{
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertical=placeTiles(n-m, m);
        int horizontal=placeTiles(n-1, m);
        return vertical+horizontal;

    }
    public static void main(String[]args){
        int m=2;
        int n=4;
        int ans=placeTiles(n, m);
        System.err.println(ans);
    }
}