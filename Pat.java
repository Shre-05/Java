import java.util.*;
public class Pat{
	public static void main(String[]args){
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1||i==5||j==1||j==5){
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
		System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=4;i++){
			int spaces=4-i;
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		int num=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num=num+1;
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
			int sum=i+j;
				if(sum%2==0){
					System.out.print("1");
				}
				else{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=5;i++){
		int spaces=5-i;
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			int spaces=2*(4-i);
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			int spaces=2*(4-i);
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=5;i++){
		int spaces=5-i;
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				if(i==1||i==5||j==1||j==5){
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++){
			int spaces=5-i;
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++){
			int spaces=5-i;
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			for(int j=2;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=4;i++){
			int spaces=4-i;
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			int star=2*(i)-1;
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--){
			int spaces=4-i;
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			int star=2*i-1;
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

