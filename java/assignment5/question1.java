package generic;

import java.util.HashSet;
import java.util.Set;


public class question1 {

	public static void main(String[] args) {
		
		Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "Manohar", 67000,"IT"));
        employees.add(new Employee(2, "Bannu",89000,"IT"));
        employees.add(new Employee(3, "Gonugunta",700000,"IT"));
        employees.add(new Employee(4, "ABCD",20200,"IT"));
        employees.add(new Employee(4, "xyz",405678,"IT"));
        
        System.out.println(employees);
    	

	}
}
