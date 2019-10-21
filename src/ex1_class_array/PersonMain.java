package ex1_class_array;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.name = "홍길동";
		p1.age = 20;
		
		Person p2 = new Person();
		
		p2.name = "제시카";
		p2.age = 30;

		System.out.println( p1.name + " / " + p1.age);
		System.out.println( p2.name + " / " + p2.age);
		
		System.out.println("----------------------------");
		
		Person[] p_arr = new Person[2];
		
//		p_arr[0] = new Person();
//		p_arr[1] = new Person();
		
		for(int i=0; i < p_arr.length; i++) {
			p_arr[i] = new Person();
		}
		
		p_arr[0].name = "홍길동";
		p_arr[0].age = 20;

		p_arr[1].name = "제시카";
		p_arr[1].age = 30;
				
		for(int i = 0 ; i < p_arr.length; i++)
		{
			System.out.println(p_arr[i].name + " / " + p_arr[i].age);
		}
	}
}
