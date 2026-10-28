import java.util.*;
public class Strings {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        /*//Declare a string
        String name="tony";
        System.out.println(name);

        //take an input
        // String name2=sc.nextLine();
        // System.out.println(name2);

        //print length of string
        System.out.println(name.length());
        //print characters of string
        String name1="Tony";
        String name2="Stark";
        String fullName=name1+" "+name2;
        System.out.println(fullName);
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));

        }

        //comparing two strings
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else if(name1.compareTo(name2)<0){
            System.out.println("name 1 is less");
 
        }
        else
            System.out.println("name 2 is less");

        //print the substring of string
        String sentence="my name is tony";
        System.out.println(sentence.substring(4,sentence.length()));

        String str="123";
        int number=Integer.parseInt(str);
        System.out.println(number);

        int num=1234;
        String str1=Integer.toString(num);
        System.out.println(num);

    //COMBINED length of an array string element
        int size=sc.nextInt();
        String array[]=new String[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextLine();
        }
        System.out.println("The names in array are: ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");

        }
        System.out.println("The combined length of all is: ");
        int count=0;
        for(int i=0;i<size;i++){
            count=count+array[i].length();

        }
System.out.println(count);

    //take i/p,create result,replace e with i
    String str=sc.next();
    String result="";
    for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result=result+"i";
            }
            else{
                result=result+str.charAt(i);

            }
    }
    System.out.println(result);

    //input email,create username until @  symbol
    String email=sc.nextLine();
    String username="";
    for(int i=0;i<email.length();i++){
         if(email.charAt(i)=='@'){
            break;
         }
         else{
            username=username+email.charAt(i);
         }
    }
    System.out.println(username);

    //reverse a string
    String str="Shreya";
    String reversed="";
    for(int i=str.length()-1;i>=0;i--){
        reversed=reversed+str.charAt(i);
    }
    System.out.println(reversed);

    //StringBuilder
    //create a new stringbuilder
    StringBuilder sb=new StringBuilder("Very ");
    //to add name
    sb.append("Good");
    System.out.println(sb);
    //to check length of string
    System.out.println(sb.length());
    //to print each char of string
    for(int i=0;i<sb.length();i++){
        System.out.print(sb.charAt(i)+" ");
    }
    System.out.println();
    //insert at a specific position
    sb.insert(1,'o');
    System.out.println(sb);

    //replace a charcater from certain position
    sb.setCharAt(0,'f');
    System.out.println(sb);

    //delete a character
    sb.delete(1,2);
    System.out.println(sb);

    //reverse a string using stringbulder
    String input=sc.next();
    StringBuilder sb=new StringBuilder(input);

    for(int i=0;i<sb.length()/2;i++){
        int front=i;
        int back=sb.length()-i-1;

        char frontChar=sb.charAt(front);
        char backChar=sb.charAt(back);

        sb.setCharAt(front,backChar);
        sb.setCharAt(back,frontChar);
    }
    System.out.println(sb);

    //ffind the combined length of all elements in stringbuilder array

    StringBuilder sb[]=new StringBuilder[5];
    int total=0;
    for(int i=0;i<sb.length;i++){
        sb[i]=new StringBuilder(sc.next());

    }
    for(int i=0;i<sb.length;i++){
        System.out.println(sb[i]);

    }
    for(int i=0;i<sb.length;i++){
        total=total+sb[i].length();

    }
    System.out.println(total);

    //take input,replace e with i
    String input=sc.next();
    StringBuilder sb=new StringBuilder(input);
    for(int i=0;i<sb.length();i++){
        if(sb.charAt(i)=='e')
        sb.setCharAt(i,'i');

    }
    System.out.println(sb);

    //take i/p email and create username till @ char
    String email=sc.nextLine();
    StringBuilder sb=new StringBuilder(email);
    for(int i=0;i<sb.length();i++){
        if(sb.charAt(i)=='@')
            sb.delete(i,sb.length());

    }
    System.out.println(sb);*/  

    
}
}


