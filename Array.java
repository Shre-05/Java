class Array{
    public static void main(String[] args) {
        int[] arr={2,4,2,1,3,8};
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i+=1;
        }
    }
}