class Student{
    String name;
    int id;
    int age;

    Student(){

    }
    Student(Student s2){
        this.name=s2.name;
        this.id=s2.id;
        this.age=s2.age;
    }
    public void display(){
        System.out.println(name+"\n"+id+"\n"+age);
    }
}
public class Ex{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(s1); 
    }
}