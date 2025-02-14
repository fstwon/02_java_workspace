package practice3.model.vo;

public class Cat extends Animal {
	// field
	/*
		- location : String
		- color : String
	*/
	private String location;
	private String color;
	public static final String[] LOCATIONS = new String[] {"미국", "한국", "일본", "영국", "캐나다"};
	public static final String[] COLORS = new String[] {"검정", "주황", "노랑", "점박", "얼룩"};
	// constructor
	/*
		+ Cat()
		+ Cat(name:String, kinds:String, location:String, color:String)
	*/
	public Cat() {}
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	
	// method
	/*
		+ setter/getter()
		+ speak() : void
	*/

	@Override
	public void speak() {
		/*
			부모클래스 오버라이딩 해서 구현
			부모의 toString() 메소드 호출하여 리턴 받은 결과값 뒤에 
			location + “에 서식하며, 색상은 “ + color + “입니다.”
			합쳐서 출력
		*/
		System.out.println(super.toString() + " " + location + "에 서식하며, 색상은 " + color + "입니다.");
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
