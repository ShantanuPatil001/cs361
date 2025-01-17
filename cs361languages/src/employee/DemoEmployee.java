/**
 * 
 */
package employee;

/**
 * @author SHANTANU DEEPAK PATIL
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

		Employee emp2 = new Employee("Don", "Holmes", "123456799");

		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete - Completed
		// emp3.whoAmI(); // prints "EMPLOYEE" or subclass-specific message because it call's the method of an actual object type, which is PartTimeEmployee.
		// emp3.getHourlyRate(); // returns syntax error because emp3 is referenced as an Employee, and Employee class does not have the getHourlyRate() method.

		// TODO To complete - Completed
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
		} else {
			System.out.println("emp3 not instance of part time employee");
		}

		// Downcasting 1
		// TODO Uncomment and run the code - Completed
		// PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// TODO To complete - Completed
		// This instruction compiles / does not compile
		// because ...
		// This instruction compiles because syntactically downcasting from a superclass to a subclass is allowed.
		
		// This instruction returns a ClassCastException at run time
		// because ...
		// This instruction returns a ClassCastException at run time because emp1 is not an instance of PartTimeEmployee, but its an instance of Employee.


		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO Look at the solution below - Completed
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
