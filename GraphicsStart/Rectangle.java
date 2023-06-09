import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle extends MyShape 
{
	private int width;
	private int height;


	public Rectangle(int x, int y, int width, int height, Color fillColor, Color lineColor) {
		super(x, y, fillColor, lineColor);

		this.width = width;
		this.height = height;
	}

	public void draw(Graphics2D g)
	{
		g.setColor(fillColor);
		g.fillRect(x, y, width, height);
		g.setColor(lineColor);
		g.drawRect(x, y, width, height);
	}


	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
