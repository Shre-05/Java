import java.util.*;
public class operator {

    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        /*int a=10;
        int b=5;
        int c=1010;
        int d=0101;

        //binary operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //unary operator
        // ++a=preincrement a++=post increment
        //--a= pre decrement a--=post decrement
        System.out.println("result of unary operation:");
        int e=a++;
        System.out.println(a);
        System.out.println(e);

        int f=--a;
        System.out.println(a);
        System.out.println(f);

        int g=++a;
        System.out.println(a);
        System.out.println(g);
        
        //relational operator
        boolean result= (a==b);
        System.out.println(result);

        result=a<b;
        System.out.println(result);

        result=a>b;
        System.out.println(result);

        result=a!=b;
        System.out.println(result);

        //logical operator
        result=(a!=b && a>=b);
        System.out.println(result);

        result=(a!=b || a<=b);
        System.out.println(result);

        result=a>b;
        System.out.println(result);

        result=!(a>b);
        System.out.println(result);

        //bit manipulation

        //get bit- to access bit present at a specific location
        int n=sc.nextInt();
        int pos=sc.nextInt();

        int bitmask=1<<pos;

        if((bitmask & n)==0){
                System.out.println("the bit was zero");
        }
        else
            System.out.println("The bit was one");

        //set- to convert zero from a specific position into 1
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int bitmask=1<<pos;

        int number=bitmask | n;
        System.out.println(bitmask);

        //clear operation 1->0
        int n= sc.nextInt();
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int negate=~(bitmask);

        int newnum=negate & n;
        System.out.println(newnum);

        //update operation- 0->1; 1->0
        System.out.println("1:set\n2:clear");
        int choice=sc.nextInt();
        int n=sc.nextInt();
        int pos=sc.nextInt();

        int bitwise=1<<pos;

        if(choice==1){
            int newnumber=bitwise | n;
            System.out.println(newnumber);

        }
        else{
            int negate=~(bitwise);
            int newnum= negate & n;
            System.out.println(newnum);

        }*/

        /*int n=sc.nextInt();
        if(isPowerOfTwo(n)){
            System.out.println("The num is power of two");
        }
        else
            System.out.println("not a power of two");

        //to check if  a number is power of two
    public static boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n=n/2;
        }
        return n==1;

    }
        //to toggle a bot 0->1,1->0
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int result=toggleBit(n,pos);
        System.out.println(result);

        public static int toggleBit(int n,int pos){
        int mask=1<<pos;
        return n^mask;

    } */
    //count the number of 1's present in the binary num

    
}
}
