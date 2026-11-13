import java.util.*;
public class Rec2 {
    public static void main(String[] args) {
        Recursion r=new Recursion();
        r.printName(5);
        r.printNum1toN(5);
        r.printNumNto1(5);
        System.out.println(r.paramtrizeSum(5, 0));
        System.out.println(r.functionalSum(5));
        System.out.println(r.factorial(5));
        int []arr={2,4,2,3,5};
        r.revArray(arr, 0, arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        int[] arr1={3,5,3,5,6,8};
        int arr2[]=r.revArrayUsingPointer(arr1, 0, arr1.length-1);
        for(int num:arr2){
        System.out.print(num+" ");}

        System.out.println();
        int arr3[]={394,5,6,23,56,7};
        r.revArrayUsingRecusrion(arr3, 0, arr3.length-1);
        for(int num: arr3){
        System.out.print(num+" ");}

        System.out.println();

        int[] arr4={35,5,3,3,6,32,7,9};
        r.revArrayUsingSinglePointer(arr4, 0);
        for(int num:arr4){
            System.out.print(num+" ");
        }
        String str="madam";
        System.out.println(r.checkPalindromeString(str, 0));
        System.out.println(r.checkPalindromeString3(str));

        System.out.println("The fibonnaci is: "+r.calFibonnaci(6));

        int[] arr5={3,1,2};
        r.printSubsequences(arr5, 0, new ArrayList<>());

        System.out.println();
        int [] arr6={1,1,2};
        r.printSubsequencesOfSum(arr6, 0, new ArrayList<>(), 0);
        System.out.println();
        r.printOneSubsequence(arr6, 0, new ArrayList<>(), 0);

        int res=r.countSubsequences(arr6, 0, new ArrayList<>(), 0);
        System.out.println(res);
    }
}
class Recursion{
    void printName(int n){
        if(n==0){
            return;
        }
        printName(n-1);
        System.out.println("Hello");
    }
    void printNum1toN(int n){
        if(n==0){
            return ;
        }
        printNum1toN(n-1);
        System.out.println(n);
    }

    void printNumNto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumNto1(n-1);
    }

    int paramtrizeSum(int i,int sum){
        if(i<1){
            return sum;
        }
        return paramtrizeSum(i-1, sum+i);
    }

    int functionalSum(int i){
        if(i<1){
            return 0;
        }
        return i+functionalSum(i-1);
    }

    int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    void revArray(int []arr,int left,int right){
        if(left>=right){
            return ;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        revArray(arr, left+1, right-1);
    }

    int[] revArrayUsingPointer(int arr[],int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;

        }
        return arr;
    }

    int[] revArrayUsingRecusrion(int[] arr,int left,int right){
        if(left>=right){
            return arr;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        return revArrayUsingRecusrion(arr, left+1, right-1);

    }

    void revArrayUsingSinglePointer(int []arr,int i){
        if(i>=arr.length/2){
            return ;
        }
        int temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;

        revArrayUsingSinglePointer(arr, i+1);
    }

    boolean checkPalindromeString(String str,int i){
        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
        return checkPalindromeString(str, i+1);
    }


    boolean checkPalindromeString3(String str){
        int l=str.length();
        for(int i=0;i<l/2;i++){
            if(str.charAt(i)!=str.charAt(l-i-1)){
                return false;
            }
        }
        return true;

    }

    int calFibonnaci(int n){
        if(n<=1){
            return n;
        }
        int last=calFibonnaci(n-1);
        int last2=calFibonnaci(n-2);
        int fib=last+last2;

        return fib;
    }

    void printSubsequences(int []arr,int index,ArrayList<Integer>Current){
        // base condition
        if(index==arr.length){
            System.out.println(Current);
            return;
        }

        // choice 1:to pick an element
        Current.add(arr[index]);
        printSubsequences(arr,index+1, Current);

        // backtracking
        Current.remove(Current.size()-1);
        
        // not to pick
        printSubsequences(arr, index+1, Current);
    }

    void printSubsequencesOfSum(int arr[],int i,ArrayList<Integer>Current,int sum){
        if(i==arr.length){
            if(sum==2){
                System.out.println(Current);
            }
            return;
        }
        Current.add(arr[i]);
        sum+=arr[i];
        printSubsequencesOfSum(arr, i+1, Current, sum);

        Current.remove(Current.size()-1);
        sum-=arr[i];

        printSubsequencesOfSum(arr, i+1, Current, sum);
    
    }

    boolean printOneSubsequence(int arr[],int i,ArrayList<Integer>Current,int sum){
        if(i==arr.length){
            if(sum==2){
                System.out.println(Current);
                return true;
            }
            return false;
        }
        Current.add(arr[i]);
        sum+=arr[i];
        if(printOneSubsequence(arr, i+1, Current, sum)){
            return true;
        }

        Current.remove(Current.size()-1);
        sum-=arr[i];

        if(printOneSubsequence(arr, i+1, Current, sum)){
            return true;
        }
        return false;
    
    }

    // Count the subseq whose sum is k
    int countSubsequences(int[] arr,int i,ArrayList<Integer>Current,int sum){
        if(i==arr.length){
            if(sum==2){
                return 1;
            }
            return 0;
        }

        sum+=arr[i];
        int l=countSubsequences(arr, i+1, Current, sum);
        sum-=arr[i];
        int r=countSubsequences(arr, i+1, Current, sum);

        return l+r;


    }


}