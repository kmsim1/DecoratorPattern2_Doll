
public class Client {
	public static void main(String[] args) {
		Doll d1 = new BasicDoll();
		System.out.println("�⺻ ���� ���� : " + d1.getPrice());

		Doll d2 = new RibbonDecorator(d1);
		System.out.println("�⺻ ���� ���� + ���� : " + d2.getPrice());

		Doll d3 = new ClothDecorator(d2);
		System.out.println("�⺻ ���� ���� + ����  + �� : " + d3.getPrice());
	}
}
