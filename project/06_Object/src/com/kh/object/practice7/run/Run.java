package com.kh.object.practice7.run;
import com.kh.object.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpNo(1);
		e.setEmpName("John");
		e.setDept("Marketing");
		e.setJob("Director");
		e.setAge(30);
		e.setGender('F');
		e.setSalary(8000);
		e.setBonusPoint(50);
		e.setPhone("000-0000-0000");
		e.setAddress("00000");
		
		System.out.println(
				"EmpNo : " + e.getEmpNo() + "\n" +
				"EmpName : " + e.getEmpName() + "\n" +
				"Dept : " + e.getDept() + "\n" +
				"Job : " + e.getJob() + "\n" +
				"Age : " + e.getAge() + "\n" +
				"Gender : " + e.getGender() + "\n" +
				"Salary : " + e.getSalary() + "\n" +
				"BonusPoint : " + e.getBonusPoint() + "\n" +
				"Phone : " + e.getPhone() + "\n" +
				"Address : " + e.getAddress()
		);
	}

}
