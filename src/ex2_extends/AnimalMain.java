package ex2_extends;

public class AnimalMain {
	public static void main(String[] args) {
		Bear bear = new Bear();
		
		System.out.println("곰만의 특징 : "+ bear.woong);
		System.out.println("곰의 눈수 : "+ bear.getEye());
		System.out.println("곰의 다리수 : "+ bear.getLeg());
		
		System.out.println("---------------------");
		
		Lion lion = new Lion();
		System.out.println("사자만의 특징 : " + lion.hair);
		System.out.println("사자의 눈수 : "+ lion.getEye());
		System.out.println("사자의 다리수 : "+ lion.getLeg());
		
		System.out.println("---------------------");
		
		Snake snake = new Snake();
		System.out.println("뱀만의 특징 : " + snake.sensor);
		System.out.println("뱀만의 눈수 : " + snake.getEye());
		System.out.println("뱀의 다리수 : "+ snake.getLeg());
		
		System.out.println("---------------------");
		
	}
}
