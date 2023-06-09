import java.awt.Color;
import java.awt.Graphics2D;

public class Square extends MyShape 
{
	private int size;


	public Square(int x, int y, int size, Color fillColor, Color lineColor) {
		super(x, y, fillColor, lineColor);

		this.size = size;
	}

	public void draw(Graphics2D g)
	{
		g.setColor(fillColor);
		g.fillRect(x, y, size, size);
		g.setColor(lineColor);
		g.drawRect(x, y, size, size);
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
