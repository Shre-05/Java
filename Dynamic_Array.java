public class Dynamic_Array {
    public static void main(String[] args) {
        Array a=new Array(5);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);
        a.display();
        System.out.println("Size: "+a.getSize());
        System.out.println("Capacity: "+a.getCapacity());
        a.insert(2,25);
        a.display();
        System.out.println("Size: "+a.getSize());
        System.out.println("Capacity: "+a.getCapacity());
        a.remove(3);
        a.display();
        System.out.println("Size: "+a.getSize());
        System.out.println("Capacity: "+a.getCapacity());

    }
}
class Array{
    private int[] arr;
    private int size;
    private int capacity;

    // constructor
    Array(int capacity){
        this.capacity=capacity;
        arr=new int [capacity];
        size=0;
    }

    // get size
    public int getSize(){
        return size;
    }
    // get capacity
    public int getCapacity(){
        return this.capacity;
    }

    // resize
    private void resize(){
        int newCap=this.capacity*2;
        int []newArr=new int[newCap];

        // copy elements
        for(int i=0;i<size;i++){
            newArr[i]=arr[i];
        }
        arr=newArr;
        this.capacity=newCap;
    }
    // add element
    public void add(int element){
        if (size==this.capacity){
            resize();
        }
        arr[size]=element;
        size++;
    }
    // insert element at index
    public void insert(int index,int element){
        if(index<0 ||index>size){
            System.out.println("Index out of bounds");
            return;
        }
        if(size==this.capacity){
            resize();
        }
        for(int i=size;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=element;
        size++;
    }
    // remove element at index
    public void remove(int index){
        if(index<0 ||index>=size){
            System.out.println("Index out of bounds");
            return;
        }
        for (int i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }
    // display elements
    public void display(){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
