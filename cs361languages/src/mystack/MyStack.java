/**
 * 
 */
package mystack;

/**
 * @author SHANTANU DEEPAK PATIL
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete - Completed
		if (theStack == null) {
            return null;
        }
        T topVal = theStack.val;
        theStack = theStack.next;
        return topVal;
	}

	public void push(T v) {
		// TODO To complete - Completed
		theStack = new MyNode<T>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete - Completed
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> intStack = new MyStack<>();
        intStack.push(1);
        intStack.push(2);
        System.out.println(intStack.pop()); // Should print 2
        intStack.push(5);
		 
		// TODO To complete - Completed
		
        // Create a stack of Person
        MyStack<Person> personStack = new MyStack<>();
		
        // Push a person p1 with your name
        Person p1 = new Person();
        p1.setFname("Shantanu");
        p1.setLname("Patil");
        personStack.push(p1);
        
        // Push a person p2 with my name
        Person p2 = new Person();
        p2.setFname("Shantanu");
        p2.setLname("Patil");
        personStack.push(p2);
        
        //System.out.println(personStack.pop().getFname());
        
	}

}
