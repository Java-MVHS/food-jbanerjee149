public class Pizza extends Food
{
	public Pizza(String ingredientIn,int PriceIn, int amtIn)
	{
		super("baked",ingredientIn,"Pizza",PriceIn,amtIn);
	}
	
	public Pizza(String prepMethodIn,String ingredientIn2,String nameIn,int PriceIn, int amtIn)
	{
		super( prepMethodIn, ingredientIn2, nameIn,PriceIn,amtIn);
	}
}
