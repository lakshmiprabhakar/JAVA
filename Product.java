public class Product
{
	int Pcde,Price;
	String Pnm;
	Product(int Pcode,String Pname,int Pprice)
	{
	 Pcde=Pcode;
	 Pnm=Pname;
	 Price=Pprice;
	}
	public static void main(String args[])
	{
	Product P1=new Product(111,"Book1",700);
	Product P2=new Product(222,"Book2",750);
	Product P3=new Product(302,"Book3",650); 
	}
	if(P1.Price>P2.Price && P1.Price>P3.Price)
	{
		System.out.println("Price of Product 1 is Greater");
	}
	else if(P1.Price<P2.Price && P2.Price>P3.Price)
	{
		System.out.println("Price of Product 2 is Greater");
	}
	else(P1.Price<P2.Price && P2.Price<P3.Price)
	{
		System.out.println("Price of Product 3 is Greater");
	}
}
