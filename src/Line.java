import java.awt.Graphics;

/**
 * Class Rectangle:  inherits from Shape and draws a rectangle
 * @author Devan Ng
 */
public class Line extends Shape
{
    /** Constructor */
    public Line()
    {
        super();  // call parent constructor (note the parent's constructor has no parameters)
    }

    /** Draw the shape
     * @param g   the graphics context on which to draw
     */
    @Override
    public void draw(Graphics g)
    {
        // set the color
        g.setColor(getColor());

        // draw the rectangle given the top left point and width and height
        g.drawLine(getP1().x, getP1().y, getP2().x, getP2().y); // the getter methods here are INHERITED FROM SHAPE!
    }
}
