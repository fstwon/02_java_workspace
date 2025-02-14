package practice3.model.vo;

public class Dog extends Animal {
	// field
	/*
		+ PLACE : String = “애견카페”
		- weight : int
	*/
	public static final String PLACE = "애견카페";
	private int weight;
	
	// constructor
	/*
		+ Dog()
		+ Dog(name:String, kinds:String, weight:int)
	*/
	public Dog() {}
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}
	
	// method
	/*
		+ setter/getter()
		+ speak() : void
	*/
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static String getPlace() {
		return PLACE;
	}
	
	@Override
	public void speak() {
		/*
			부모클래스 오버라이딩 해서 구현
			부모의 toString() 메소드 호출하여 리
			턴 받은 결과값 뒤에 “ 몸무게는 ” +
			weight + “kg 입니다.” 합쳐서 출력
		*/
		System.out.println(super.toString() + " 몸무게는 " + weight + "kg 입니다.");
	}
}
