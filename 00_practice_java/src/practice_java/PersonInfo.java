package practice_java;

public class PersonInfo {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 25; 
        double height = 175.5; 
        char bloodType = 'O'; 

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("혈액형: " + bloodType);
        System.out.printf("이름: %s\n나이: %d\n키: %.1f\n혈액형: %c", name, age, height, bloodType);
    }
}
