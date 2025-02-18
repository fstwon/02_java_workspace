package practice3.model.vo;

public class Dog extends Animal {
//	+ PLACE : String = “애견카페” (밑줄)
	public static final String PLACE = "애견카페";
//	- weight : int
	private int weight;
	
//	+ Dog()
	public Dog() {
		// * 부모클래스의 생성자가 먼저 실행됨!
		// super();	// 명시하지 않을 경우 부모클래스의 기본생성자가 실행
	}	
// 	+ Dog(name:String, kinds:String, weight:int)
	public Dog(String name, String kinds, int weight) {
//		this.name = name;
//		this.kinds = kinds;
		super(name, kinds);		// 부모클래스 생성자를 통해 초기화!
		// => 부모클래스의 생성자가 항상 먼저 실행되어야 함!!
		this.weight = weight;
	}
//	+ setter/getter()
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
//	+ speak() : void
	@Override
	public void speak() {
		// 부모의 toString() 메소드 호출하여 
		// 리턴 받은 결과값 뒤에 
		// “ 몸무게는 ” + weight + “kg 입니다.” 합쳐서 출력
		System.out.println(super.toString() 
							+ " 몸무게는 " + weight + "kg 입니다."); 
	}
}





