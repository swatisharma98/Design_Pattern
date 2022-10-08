package decorator;


//Decorator - Attach additional responsibilities to an object dynamically.Decorators provide a flexible alternative to subclassing 
//for extending functionality
public class StarBuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage beverage = new Espresso();
		System.out.println("beverage="+beverage.getDescription()+"code=="+beverage.cost());
		Beverage beverage2 = new HouseHold();
		beverage2 = new Mocha(beverage2);
		System.out.println("Beverage with Mocha=="+beverage2.getDescription()+"  Cost=="+beverage2.cost());
		
		

	}

}
