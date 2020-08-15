package design_patterns_builder;

public class BuilderPatterDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuBuilder menuBuilder = new MenuBuilder();
		Meal vegMeal = menuBuilder.prepareVegMeal();
		System.out.println("Veg Meal:");
		
		vegMeal.showItems();
		System.out.println("Veg cost:" + vegMeal.getCost());
		System.out.println("===========================");
		Meal nonVegMeal = menuBuilder.prepareNonVegMeal();
		System.out.println("Non-Veg Meal:");
		nonVegMeal.showItems();
		System.out.println("Non Veg cost:" + nonVegMeal.getCost());
	}

}
