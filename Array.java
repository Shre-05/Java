import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public class Array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // 1D array:
        int [] marks=new int[3];
            // adding elments using loop
        for (int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
            // print array elements:
        System.out.println("You array elements re:");
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}


