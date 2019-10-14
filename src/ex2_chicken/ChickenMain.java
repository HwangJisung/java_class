package ex2_chicken;

public class ChickenMain {
	public static void main(String[] args) {
		Chicken c1 = new Chicken();
		c1.outChicken();
		
		Chicken c2 = new Chicken();
		c2.type = "양념";
		c2.born = "뼈 있는";
		c2.price = 17000;
		c2.outChicken();
	}
}
