
public class DollDecorator extends Doll {
	private Doll decoratedDoll;

	public DollDecorator(Doll decoratedDoll) {
		this.decoratedDoll = decoratedDoll;
	}

	@Override
	public int getPrice() {
		price = decoratedDoll.getPrice();
		return price;
	}
}
