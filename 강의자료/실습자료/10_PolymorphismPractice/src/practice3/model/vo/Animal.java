package practice3.model.vo;

public abstract class Animal {
// 접근제한자 예약어 class 클래스명
// => 예약어 위치에 "abstract" 사용 시 추상클래스(미완성 클래스)가 됨!
//	  * 추상클래스는 인스턴스를 생성할 수 없음!! 
//      단, 참조자료형으로 사용할 수 있음
	private String name;
	private String kinds;
	
//  # Animal()
	protected Animal() {}
//	# Animal(name:String, kinds:String)
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	// => protected 접근제한자를 사용하여 생성자를 정의하게 되면
	//    해당 클래스는 같은 패키지 내에서 또는 상속 관계에서만 
	//    인스턴스를 생성할 수 있음!
	//    -> 현재 클래스는 추상클래스로 직접 생성은 불가! 
	//		 이 클래스를 상속받은 클래스에서만 super() 생성자를 사용하여 실행할 것임!
	
//	+ speak() : void (abstract)
	public abstract void speak();
	// 접근제한자 예약어 반환형 메소드명(매개변수정보)
	// => 예약어 위치에 "abstract" 사용되면 추상메소드가 됨!
	//	  추상 메소드는 구현부가 없음! 따라서 메소드 머리부 끝에 세미콜론으로 끝맺음!
	
//	+ toString() : String
	@Override	// => 오버라이딩된 메소드임을 의미함!
	public String toString() {
		// toString() 는 Object 클래스에 정의되어 있는 메소드
		// => 따라서, 현재 클래스에서 재정의됨! (오버라이딩)
		
		// * 보통 toString 메소드는 현재 클래스의 모든 필드의 정보를
		//	 문자열로 반환하는 역할을 하도록 재정의됨!
		//   => 참조변수를 문자열로 사용할 때, toString 메소드 호출됨!
		
		// “저의 이름은” + name + “이고, 종류는 “ + kinds + “입니다.“
		
		// return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
		return String.format("저의 이름은 %s이고, 종류는 %s입니다."
								, name, kinds);
	}
}





