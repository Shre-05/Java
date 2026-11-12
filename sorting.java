class Ex{
    public static void main(String[] args) {
        Sort s=new Sort();
        s.selectionSort();
        s.bubbleSort();
        s.insertionSort();
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
}