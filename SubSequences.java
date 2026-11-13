import java.util.*;
public class SubSequences {
    public static void main(String[] args) {
        Sub s=new Sub();
        int []arr={3,1,2};
        // print subsequences
        s.printSubsequences(arr, 0, new ArrayList<>());
        // print subseq.with sum K
        System.out.println();
        s.printSubWithSumK(arr, 0, new ArrayList<>(), 0, 3);

        System.out.println();
        // print only one subseq of sum k:
        s.printOneSubsequenceOfSum(arr, 0, 0, 3, new ArrayList<>());

        // print the count of subseq with sum K
        int res3=s.countSubsequences(arr, 0, 3, 0);
        System.out.println(res3);

        System.out.println();
        // to print Subsequneces of a string
        s.printStringSub("Yes", 0, new ArrayList<>());
        System.out.println();

        // Check whether any subsequence has sum K
        boolean res5=s.ifSubsequneceHasSumK(arr, 0, 3, 0);
        System.out.println(res5);
        System.out.println();

        // Print subsequences containing exactly K elements
        s.printSubsContainingExactlyKElements(arr, 0, new ArrayList<>(), 2);

    }
}
class Sub{
    //to print subsequences:
    void printSubsequences(int []arr,int i,ArrayList<Integer>Current){
        // Base condition:
        if(i==arr.length){
            System.out.println(Current);
            return;
        }
        // to pick an element:
        Current.add(arr[i]);
        printSubsequences(arr, i+1, Current);

        // remove
        Current.remove(Current.size()-1);
        

        // not to pick
        printSubsequences(arr, i+1, Current);
    }

    // to print subarrays with sum k
    void printSubWithSumK(int[]arr,int i,ArrayList<Integer>Curr,int sum,int target){
        // base condition: 
        if(i==arr.length){
            if(sum==target){
                System.out.println(Curr);
            }
            return;
        }

        // to pick an element
        Curr.add(arr[i]);
        sum+=arr[i];
        printSubWithSumK(arr, i+1, Curr,sum, target);

        // remove
        Curr.remove(Curr.size()-1);
        sum-=arr[i];

        // not to pick
        printSubWithSumK(arr, i+1, Curr, sum, target);
    }

    // print only one subseq. with sum K:
    boolean printOneSubsequenceOfSum(int arr[],int i,int sum,int target,ArrayList<Integer>Curr){
        // base condition
        if(i==arr.length){
            if(sum==target){
                System.out.println(Curr);
                return true;
            }
            return false;
        }
        // to pick an element
        Curr.add(arr[i]);
        sum+=arr[i];
        if(printOneSubsequenceOfSum(arr, i+1, sum, target, Curr)){
            return true;
        }

        // remove
        Curr.remove(Curr.size()-1);
        sum-=arr[i];

        // not to pick
        if(printOneSubsequenceOfSum(arr, i+1, sum, target, Curr)){
            return true;
        }
        return false;
    }

    // print Count of subseq of that sum
    int countSubsequences(int[] arr,int i,int target,int sum){
        // Base condition
        if(i==arr.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }

        // to pick an element
        sum+=arr[i];
        int l=countSubsequences(arr, i+1, target, sum);
        // to remove an elemnt
        sum-=arr[i];
        int r=countSubsequences(arr, i+1, target, sum);

        return l+r;

    }

    // Print all subsequences of a string.
    void printStringSub(String str,int i,ArrayList<Character>Curr){
        // base condition
        if(i==str.length()){
            System.out.println(Curr);
            return;
        }

        // to pick
        Curr.add(str.charAt(i));
        printStringSub(str, i+1, Curr);

        // remove
        Curr.remove(Curr.size()-1);

        printStringSub(str, i+1, Curr);
    }

    // Check whether any subsequence has sum K

    boolean ifSubsequneceHasSumK(int[]arr,int sum,int target,int i){
        // base condition
        if(i==arr.length){
            return sum==target;
        }
        // pick
        if(ifSubsequneceHasSumK(arr, sum+arr[i], target, i+1)){
            return true;
        }

        // not pick
        if(ifSubsequneceHasSumK(arr, sum, target, i+1)){
            return true;
        }
        return false;
    }

    // Print subsequences containing exactly K elements
    void printSubsContainingExactlyKElements(int []arr,int i,ArrayList<Integer>Curr,int k){
        // if more than k elemnets
        if(Curr.size()>k){
            return;
        }

        // if  not enough elements are available
        if(Curr.size()+(arr.length-i)<k){
            return ;
        }
        // baseCondition:
        if(i==arr.length){
            if(Curr.size()==k){
                System.out.println(Curr);
            }
            return;
        }
        // to pick
        Curr.add(arr[i]);
        printSubsContainingExactlyKElements(arr, i+1, Curr, k);

        Curr.remove(Curr.size()-1);

        // not to pick
        printSubsContainingExactlyKElements(arr, i+1, Curr, k);
    }

    // Find the maximum sum among subsequences of size K
}
