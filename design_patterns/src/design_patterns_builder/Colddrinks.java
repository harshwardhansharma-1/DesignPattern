package design_patterns_builder;

public abstract class Colddrinks implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract float price(); 
}
