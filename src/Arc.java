import java.awt.Graphics;

/**
 * Class Oval:  inherits from Shape and handles oval shapes
 * @author devan
 */
public class Arc extends Shape
{
    private int startAngle;
    private int arcAngle;
    /** Constructor */
    public Arc()
    {
        super();  // call parent constructor (note the parent's constructor has no parameters)
        startAngle = 30;
        arcAngle = 70;
    }

    /**
     * Draw the shape
     * @param g   the graphics context to draw to
     */
    @Override
    public void draw(Graphics g)
    {
        // set the color to draw the shape in
        g.setColor(getColor());

        // draw the oval given the top left corner of the enclosing
        // rectangle and the width and height
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle); // the getter methods here are INHERITED FROM SHAPE!
    }
}