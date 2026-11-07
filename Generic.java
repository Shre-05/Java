public class Generic {
    public static void main(String[]args){
        Gen<Integer> a=new Gen<>(10);
        System.out.println(a.getValue());
        a.setValue(5);
        System.out.println(a.getValue());
        
        Gen<String> b=new Gen<>("Hello");
        System.out.println(b.getValue());

        Gen2<Integer,String> c=new Gen2<>(100,"Good");
        System.out.println(c.getFirst());
        System.out.println(c.getSecond());

        printPair("Hello",100);

    }
    // genric method:
    public static <T,U> void printPair(T first,U second){
        System.out.print(first+" "+second);
    }
}
class Gen<T>{
    private T value;

    Gen(T value){
        this.value=value;
    }
    // getter
    public T getValue(){
        return value;
    }
    // setter
    public void setValue(T value){
        this.value=value;
    }

}

class Gen2<T,U>{
    private T first;
    private U second;

    Gen2(T first,U second){
        this.first=first;
        this.second=second;
    }
    //getter
    public T getFirst(){
        return first;
    }
    public U getSecond(){
        return second;
    }

}