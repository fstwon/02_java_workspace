package practice3.model.vo;

public abstract class Animal {
	// field
	/*
		- name : String
		- kinds : String
	*/
	private String name;
	private String kinds;
	
	// constructor
	/*
		# Animal()
		# Animal(name:String, kinds:String)
	*/
	protected Animal() {}
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	// method
	/*
		+ toString() : String
		+ speak() : void (abstract)
	*/
	
	@Override
	public String toString() {
		/*
			“저의 이름은” + name + “이고, 종류는 “ + kinds + “입니다.“
			의 형식으로 문자열 만들어 리턴 처리
		*/
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	public abstract void speak();
}
