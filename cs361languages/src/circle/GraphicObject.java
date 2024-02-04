/**
 * 
 */
package circle;

/**
 * @author cscharff
 *
 */

// abstract class

abstract class GraphicObject {

	private int pixelX, pixelY;

	abstract void moveTo(int newX, int newY);

	abstract void draw();

	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	public boolean equals(Circle obj) {
		return false;
	}

}
