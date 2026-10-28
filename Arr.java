import java.util.*;
public class Arr{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//create a simple array and print
		/*int array[]=new int[3];
		array[0]=97;
		array[1]=95;
		array[2]=99;
		
		System.out.println(array[2]);*/
		
		//create an array using loop and user input
		/*int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}*/
		
		//take an array of names as an input from user and print on screen
		/*int size=sc.nextInt();
		String array[]=new String[size];
		for(int i=0;i<size;i++){
			array[i]=sc.next();
		}
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}*/
		
		//find max and min no. in an array of integer
		/*int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++){
			if(array[i]<min)
			min=array[i];
			if(array[i]>max)
			max=array[i];
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);*/
		
		//take an array as an input and check is it is in ascending order
		/*int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}
		boolean isAscending=true;
		for(int i=0;i<array.length-1;i++){
			if(array[i]>array[i+1])
			isAscending=false;
		}
		if(isAscending==true)
		System.out.println("Array is sorted");
		else
		System.out.println("Array is not sorted");*/
		
		//2D array
		/*int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int array[][]=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
			array[i][j]=sc.nextInt();}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}*/
		
		//matrix as an input.search for a given no x and print indices at which it occurs
		/*int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int array[][]=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the numbr you want to search");
		int x=sc.nextInt();
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(array[i][j]==x){
					System.out.println("no x found at row:"+i+" col:"+j);
				}
			}
		}*/
		
		//print the values of array in spiral form-spiral matrix problem
		int m=3;
		int n=4;
		int array[][]=new int[m][n];
		for(int i=0;i<m;i++){
		  for(int j=0;j<n;j++){
		    array[i][j]=sc.nextInt();
		  }
		}
		for(int i=0;i<m;i++){
		  for(int j=0;j<n;j++){
		    System.out.print(array[i][j]+" ");
		  }
		  System.out.println();
		}
		int srow=0;int erow=m-1;
		int scol=0;int ecol=n-1;
		System.out.println("The spiral array is:");
		while(srow<=erow && scol<=ecol){
		  for(int j=scol;j<=ecol;j++){
		    System.out.print(array[srow][j]+" ");
		  }
		  for(int i=srow+1;i<=erow;i++){
		    System.out.print(array[i][ecol]+" ");
		  }
		  for(int j=ecol-1;j>=scol;j--){
		  if(srow==erow)
		  break;
		    System.out.print(array[erow][j]+" ");
		  }
		  for(int i=erow-1;i>=srow+1;i--){
		  if(scol==ecol)
		  break;
		    System.out.print(array[i][scol]+" ");
		  }
		  srow++;scol++;erow--;ecol--;
		}
}}
