import java.util.*;
class sorting{
    public static void main(String[] args) {
        Sort s=new Sort();
        s.selectionSort();
        s.bubbleSort();
        s.insertionSort();
        int []arr={83,4,6,7,3,45,8,4,32,7,9};
        System.out.println("Merge Sort");
        s.mergeSort(arr, 0, arr.length-1);
        s.printArray(arr);

    }
}

class Sort{
    void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void selectionSort(){
        int []arr={2,4,1,57,3,4,6};
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            int smallest=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }

        print(arr);
    }

    void bubbleSort(){
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        for(int i=n-1;i>=1;i--){
            int didswap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didswap=1;
                }
            }
            if(didswap==0){
                break;
            }
            System.out.println("Running");
        }
        print(arr);
    }

    void insertionSort(){
        int []arr={3,5,2,5,7,3,21,4};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        print(arr);
    }

    void mergeSort(int arr[],int low,int high){
        if(low>=high){
            return ;
        }
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
        
    }
    void merge(int[]arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer>temp=new ArrayList<>();

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }

    }
    void printArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
}