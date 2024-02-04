/**
 * 
 */
package circle;

/**
 * @author Shantanu Patil
 *
 */

// TODO Complete the code - Completed

public class Circle extends GraphicObject implements Cloneable {

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;

	/**
	 * 
	 */
	public Circle() {
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {
	}

	// TODO To complete - Completed
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	@Override
	public String toString() {
		return "Circle: centerX = "+centerX+" centerY = "+centerY+" radius = "+radius;
	}

	// TODO To complete - Completed
	// TODO Be sure that you understand the difference between equals and ==  - Completed
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	@Override
	public boolean equals(Circle obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		return ((Double.compare(centerX, obj.centerX) == 0) && (Double.compare(centerY, obj.centerY) == 0)
				&& (Double.compare(radius, obj.radius) == 0));
	}

	// TODO To complete - Completed
	/**
	 * @return an exact copy of the Circle that is a new instance - Completed
	 */
	 @Override
	protected Object clone() throws CloneNotSupportedException{
		 return super.clone();
	}

}
