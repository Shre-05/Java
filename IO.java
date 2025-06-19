import java.util.Scanner;

class IO
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		//String
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Name is "+name);
		sc.nextLine();
		System.out.println("\n");
		//long sentence
		System.out.println("Enter sentence");
		String sen=sc.nextLine();
		System.out.println("Sentence is "+sen);
		
		System.out.println("\n");
		//byte Number
		System.out.println("Enter byte no of size 1 byte");
		byte b=sc.nextByte();
		System.out.println("No is "+b);
		
		System.out.println("\n");
		//short and char=2byte
		System.out.println("Enter Short");
		short s=sc.nextShort();
		System.out.println("Short is "+s);
		
		System.out.println("\n");
		//int and float=4 byte
		System.out.println("Enter int");
		int i=sc.nextInt();
		System.out.println("int is "+i);
		
		System.out.println("\n");
		System.out.println("Enter float");
		float f=sc.nextFloat();
		System.out.println("float is "+f);
		
		System.out.println("\n");
		//long and double=8 byte
		System.out.println("Enter long");
		long l=sc.nextLong();
		System.out.println("long is "+l);
		
		System.out.println("\n");
		System.out.println("Enter double");
		double d=sc.nextDouble();
		System.out.println("double is "+d);
		
		System.out.println("\n");
		//boolean- 1 byte
		System.out.println("Enter boolean");
		boolean bo=sc.nextBoolean();
		System.out.println("bool is "+bo);
		
		System.out.println("\n");
		//char= 2 byte
		System.out.println("Enter char");
		char c=sc.next().charAt(0);
		System.out.println("char is "+c);
	}
}
