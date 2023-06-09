import java.awt.Color;
import java.awt.Graphics2D;

public class Circle extends MyShape 
{
	private int radius;


	public Circle(int x, int y, int radius, Color fillColor, Color lineColor) {
		super(x, y, fillColor, lineColor);

		this.radius = radius;
	}

	public void draw(Graphics2D g)
	{
		g.setColor(this.getFillColor());
		g.fillOval(x, y, radius, radius);
		g.setColor(this.getLineColor());
		g.drawOval(x, y, radius, radius);
		
		g.drawString(String.valueOf(value), x + radius / 2, y + radius / 2);
	}


	public int getRadius() {
		return this.radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}


}
