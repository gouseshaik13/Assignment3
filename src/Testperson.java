
public class Testperson {
	public static void main(String[] args) {
		Person ob1 = new Person();
		Person ob2 = new Person();
		ob1.setage(89);
		ob1.setname("gouse");
		ob1.setprice(7000);
		
		System.out.println("enter person1 values");
		System.out.println(ob1.getage());
		System.out.println(ob1.getname());
		System.out.println(ob1.getprice());
		
		ob2.setage(77);
		ob2.setname("basha");
		ob2.setprice(5448);
		
		System.out.println("enter person2 values");
		System.out.println(ob2.getage());
		System.out.println(ob2.getname());
		System.out.println(ob2.getprice());
		
	}

}
