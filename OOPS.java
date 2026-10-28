//copy constructors- an object s2 is passed without any arguments and here the copy contructors are helping to get the info related o s1 to s2 i.e the info is being copied
/*class Student{
    String name;
    int id;

    //default constructor
    Student(){

    }
    //copy constructor
    Student(Student s2){
        this.name=s2.name;
        this.id=s2.id;
    }
    public void printInfo(){
        System.out.println("name:"+name+"\nid:"+id);
    }
}

public class OOPS{

    public static void main(String[]args){
        //creating obj 1 and passing info
        Student s1=new Student();
        s1.name="abc";
        s1.id=1;
        System.out.println("s1 info:");
        s1.printInfo();
        //object 2 info is mapped from obj 1
        Student s2=new Student(s1);
        System.out.println("s2 info:");
        s2.printInfo();
    }
}

//polymorphism
//overloading/compile time polymorphism
class Operation{
    public int addition(int a,int b){
        return a+b;
    }
    public int addition(int a,int b,int c){
        return a+b+c;
    }
    public double addition(double a,double b){
        return a+b;
    }
}
public class OOPS{
    public static void main(String[]args){
        Operation op=new Operation();
        System.out.println(op.addition(10,20));
        System.out.println(op.addition(2.0,15.30));
        System.out.println(op.addition(1,2,3));
    }
}

//runtime polymorphism
class Person{
    public void print(){
        System.out.println("I am a person");
    }
}
class Father extends Person{
    public void print(){
        System.out.println("I am a father");
    }
}
public class OOPS{
    public static void main(String[]args){
        Person p=new Person();
        p.print();
        Father f=new Father();
        f.print();
    }
}

//access modifiers
class Account{
    public String name;
    public int account_no;
    private String password;

    Account(String name,int account_no){
        this.name=name;
        this.account_no=account_no;
    }

    public void displayName(){
        System.out.println(this.name+"\n"+this.account_no);
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
}
public class OOPS{
    public static void main(String[]args){
        Account ac=new Account("abc", 123);
        ac.displayName();
        ac.setPassword("xyz");
        System.out.println(ac.getPassword());
    }
}

//Encapsulation+get set methods
class A{
    private String name;
    private int id;
    private String password;

    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setPass(String password){
        this.password=password;
    }

    //getter
    public void getName(){
        System.out.println(name);
    }
    public void getId(){
        System.out.println(id);
    }
    public void getPass(){
        System.out.println(password);
    }
}
public class OOPS{
    public static void main(String[]args){
        A a=new A();
        a.setName("abc");
        a.setId(1);
        a.setPass("xyz");

        a.getName();
        a.getId();
        a.getPass();

    }
}
//inheritance
//single
class Animal{
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }
}
public class OOPS{
    public static void main(String[]args){
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}


//multilevel
class Living{
    public void eat(){
        System.out.println("Living animal eats");
    }
}
class Human extends Living{
    public void walk(){
        System.out.println("all humans can talk");
    }
}
class Female extends Human{
    public void dance(){
        System.out.println("the woman is dancing");
    }
}
public class OOPS{
    public static void main(String[]args){
        Female obj=new Female();
        obj.eat();
        obj.walk();
        obj.dance();
    }
}

//hierrachical 
class Human{
    public void eat(){
        System.out.println("all humans can eat");
    }
}
class  Male extends Human{
    public void walk(){
        System.out.println("all males are walking");
    }
}
class Female extends Human{
    public void dance(){
        System.out.println("all females are dancing");
    }
}
public class OOPS{
    public static void main(String[]args){
        Male m=new Male();
        m.eat();
        m.walk();

        Female f=new Female();
        f.eat();
        f.dance();
    }
}

//hybrid
class Living{
    public void eat(){
        System.out.println("all living animals eats");
    }
}
class Human extends Living{
    public void walk(){
        System.out.println("all humans can walk");
    }
}
class Animal extends Living{
    public void leg(){
        System.out.println("animals walk on 4 legs");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("dogs can bark");
    }
}
class Male extends Human{
    public void quite(){
        System.out.println("all males are quite");
    }
}
class Female extends Human{
    public void talk(){
        System.out.println("all females are talking");
    }
}
public class OOPS{
    public static void main(String[]args){
        Dog d=new Dog();
        d.eat();
        d.leg();
        d.bark();

        Male m=new Male();
        m.eat();
        m.walk();
        m.quite();

        Female f=new Female();
        f.eat();
        f.walk();
        f.talk();
    }
}

//multiple-implemented using ineterfaces= interface
interface A{
    void showA();
}
interface B{
    void showB();
}
class C implements A,B{
    public void showA(){
        System.out.println("hello");
    }
    public void showB(){
        System.out.println("hi");
    }
}
public class OOPS{
    public static void main(String[]args){
        C c=new C();
        c.showA();
        c.showB();
    }
}

//abstract class
abstract class Animal{
    abstract void sound();
    public void eat(){
        System.out.println("animal eats");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("dog barks");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("cat mewos");
    }
}
public class OOPS{
    public static void main(String[]args){
        Dog d=new Dog();
        d.sound();
        d.eat();

        Cat c=new Cat();
        c.sound();
        c.eat();

    }
}*/

//static
class Student{
    static{
        System.out.println("class Student loaded successfully");
    }
    String name;
    int id;
    static String clg="abc";
    static int year=1990;
    //static method-
    public static void display(){
        System.out.println("hello");
    }
    //static method can only access static variable and non static variable can't be accessed 
    public static void print(){
        System.out.println(year);
    }
}
public class OOPS{
    //static block- it is loaded when the class is loaded and un even before the main method runs
    //used for initialization that should happen once the class is loaded
    static{
        System.out.println("Here main class is loaded");
    }
    public static void main(String[]args){
        Student s1=new Student();
        System.out.println(s1.name="xyz");
        s1.id=1;
        //static method can be accessed with the name of the class w/o needing bject creation
        Student.display();
        Student.print();
        System.out.println(Student.clg);//no object creation is required to access this
    }
}