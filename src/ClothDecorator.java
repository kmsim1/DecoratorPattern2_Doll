
public class ClothDecorator extends DollDecorator{

	public ClothDecorator(Doll decorateddisplay) {
		super(decorateddisplay);
	}
	
	public int getPrice() {
		price = super.getPrice();
		return 20000+price;
	}

}
