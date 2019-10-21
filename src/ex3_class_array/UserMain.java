package ex3_class_array;

public class UserMain {
	public static void main(String[] args) {
		User[] user = new User[2];
		
		user[0] = new User();
		
		user[0].name = "홍길동";
		user[0].age = 10;

		user[1] = new User();
		user[1].name = "임꺽정";
		user[1].age = 20;
		
		for(int i=0; i<user.length; i++)
		{
			System.out.println("이름 : "+user[i].name);
			System.out.println("나이 : "+user[i].age);
		}
		
	}
}
