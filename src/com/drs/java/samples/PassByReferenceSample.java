package com.drs.java.samples;

import com.drs.java.samples.entity.*;


public class PassByReferenceSample {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("dasa");
		
		String name = "dasa";
		
		method1(name, emp.getName(), emp);
				
		System.out.println(" After method calling Name: " + name + " Employee Name: " + emp.getName());

	}

	private static void method1(String name, String empName, Employee emp) {
		System.out.println(" Before Change: " + name + " Employee Name: " + empName + " Employee Obj Name: " +emp.getName());
		name = "Raja";
		empName = " RaJa";
		emp.setName("SEKHAR");
		System.out.println(" After Change: " + name + " Employee Name: " + empName + " Employee Obj Name: " +emp.getName());
	}

}
