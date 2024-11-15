public	class	FoodTester
{
	public static void main (String args[])
	{
		Food food1 = new Food("baked",	"banana", "Muffins",50,12);
		Food food2 = new Food("fried", "yam", "Fritters",100,3);
		Pizza pizza1	= new Pizza("pepperoni",250,8);
		DeepDishPizza pizza2	= new DeepDishPizza("pepperoni",250,8);
		food1.printForSale( "Muffins",50,12);
		food2.printForSale( "Muffins",50,12);
		pizza1.printForSale( "Muffins",50,12);
		food1.printForSale( "Muffins",50,12);
	}
}
