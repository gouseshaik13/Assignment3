class Amazon
{
String name;
long mobileNum;
String email;
String password;
public Amazon(String name, long mobileNum, String email, String password) {
	super();
	this.name = name;
	this.mobileNum = mobileNum;
	this.email = email;
	this.password = password;
}
public Amazon() {
	
}
@Override
public String toString() {
	return "" + name + "" + mobileNum + "" + email + "" + password + "";
}

}

	public class Ecommerce{
		public static void main(String[] args) {
		Amazon ob1=new Amazon("SaiRam ",7777766666L,"sai@hotmail.com","code@!23");
		Amazon ob2=new Amazon("Venu  ",9999988888L,"venus@gmail.com","secret@123#");
		Amazon ob3=new Amazon("Saketh",8888877777l,"saketh@yahoo.com","python@code");
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		
		}
	}
	
	






