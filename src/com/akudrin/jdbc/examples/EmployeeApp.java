package com.akudrin.jdbc.examples;

import java.util.List;

public class EmployeeApp {

	public static void main(String[] args) {
		
        EmployeeDAO studentDao = new EmployeeDAO();

        Employee employee1 = new Employee("Bart Simpson", "Male", 3);

        studentDao.saveEmployee(employee1);
        
        Employee employee2 = new Employee("Michael Jackson", "Male", 1);

        studentDao.saveEmployee(employee2);

        List <Employee> students = studentDao.getEmployees();

        students.forEach(s -> System.out.println(s.getName()));

	}

}
