//Bubble sort-Ascending
/* 
import java.util.*;
public class Sorting{

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]={7,8,3,1,2};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}

//Bubble sort- Descending
import java.util.*;
public class Sorting{

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]={7,8,3,1,2};

        for(int i=0;i<arr.length;i++){
        boolean isSwap=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
                if(isSwap==false)
                System.out.println("already sorted");
                break;
        }
        printArray(arr);
    }
}

//Selection sort-Ascending
import java.util.*;
public class Sorting{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]={7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
}

//selection sort-descending
//smallest can be changed to largest
import java.util.*;
public class Sorting{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]={7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]<arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
}

//insertion sort-Ascending
import java.util.*;
public class Sorting{
public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int arr[]={7,8,3,1,2};
    for(int i=1;i<arr.length;i++){
        int current=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>current){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current;
    }
    printArray(arr);
}}

//insertion sort- descending
import java.util.*;
public class Sorting{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]={7,8,1,3,2};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current>arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printArray(arr);
    }
}

//merge sort-Ascending
//time complexity-nlogn
public class Sorting{
    public static void Conquer(int arr[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
        }
        
    
    public static void Divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        Divide(arr, si, mid);
        Divide(arr, mid+1, ei);
        Conquer(arr,si,mid,ei);
    }
    public static void main(String[]args){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        Divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
    
//merge sort-descending
public class Sorting{
    public static void Conquer(int arr[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]>arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }

    }
    public static void Divide(int arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid=si+(ei-si)/2;
        Divide(arr,si,mid);
        Divide(arr,mid+1,ei);
        Conquer(arr,si,mid,ei);
    }
    public static void main(String[]args){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        Divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

//quick sort
public class Sorting{
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i; 

    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
        int pidx=partition(arr,low,high);
        quickSort(arr,low,pidx-1);
        quickSort(arr,pidx+1,high);}
    }
    public static void main(String[] args){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
