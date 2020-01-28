package classpart;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.age= 3;
		person.name= "James";
		person.isMarried = true;
		person.numOfChildren =3;
		
		System.out.println("나이 :" + person.age);
		System.out.println("이름 :" + person.name);
		System.out.println("결혼여부 :" + person.isMarried);
		System.out.println("자식 수 :" + person.numOfChildren);
	}

}
