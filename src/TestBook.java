public class TestBook {
	public static void main(String[] args) {
		Book ob1 = new Book();
		Book ob2 = new Book();
		ob1.setBookId(675);
		ob1.setBookName("java");
		ob1.setBookPrice(33.9);

		System.out.println("enter book1 details");
		System.out.println(ob1.getBookId());
		System.out.println(ob1.getBookName());
		System.out.println(ob1.getBookPrice());

		ob2.setBookId(453);
		ob2.setBookName("javag");
		ob2.setBookPrice(76.9);

		System.out.println("enter book2 details");
		System.out.println(ob2.getBookId());
		System.out.println(ob2.getBookName());
		System.out.println(ob2.getBookPrice());


	}
}