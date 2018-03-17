package net.xinqushi.test;

public class breaktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		int a;
		int b;
		int c;
		do {
			a=0;
			b=1;
			c=a+b;
			System.out.println(c);
			break;
			
		}while(true);
		for(;a<986&&b<986&&c<986;) {
			a=b+c;
			b=a+b;
			c=a+b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			
		}
	}

}
