public class Food
{
	protected String str;

	public Food()
	{
		str = new String("");
	}
	public	Food(String	prepMethod,	String	ingredient,	String	name,int Price,int amt)
	{
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient +
		 " will be sold for " +(Price)+" with " +amt +" "+name +" at "+ Price 
		 +" cents each $" + (int)(amt*(Price/100.0))+" can be made";
		 
	}
	public void printForSale(String name,int Price, int amt)
	{
		System.out.println(str);
	}

}
