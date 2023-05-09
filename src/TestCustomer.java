class Customer
{
int id;
String name;
String address;
long mobileNo;
double payBill;
public Customer() 
{
id = 1236;
name = "gouse";
address = "kondapalli";
mobileNo = 9182778672l;
payBill = 35000.00;
}
void display()
{
	System.out.println("Id :" +id);
	System.out.println("Name :" +name);
	System.out.println("Address :" +address);
	System.out.println("MobileNo :" +mobileNo);
	System.out.println("PayBill :" +payBill);
}

}
public class TestCustomer {

	public static void main(String[] args) {
		Customer c = new Customer ();
		c.display();
	}

}