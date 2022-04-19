package vkit;

public class demo {

		void func()
		{
			System.out.println("hi");
		}
			public static void main(String[] args) {
				demo d1=new demo();
				demo d2=new demo();
				d1.func();
		System.out.println(d1.getClass());
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
			}

}
