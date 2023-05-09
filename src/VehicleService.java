class Vehicle
{
	String company;
	String colour;
	double price;
	public Vehicle(String company,String colour,double price) {
		this.company = company;
		this.colour = colour;
		this.price = price;
	}
	public Vehicle() {
	
	}
	@Override
	public String toString() {
		return "Vehicle [company=" + company + ", colour=" + colour + ", price=" + price + "]";
	}
	void Display()
	{
		System.out.println("Company :" +company);
		System.out.println("Colour :" +colour);
		System.out.println("Price :" +price);
	}
	
}
public class VehicleService {

	public static void main(String[] args) {
		Vehicle v = new Vehicle ("yamaha","cherry red",2200000.00);
		v.Display();
		System.out.println(v);

	}

}