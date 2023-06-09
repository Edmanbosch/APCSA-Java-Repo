import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public abstract class MyShape {
	protected int x;
	protected int y;
	protected Color fillColor;
	protected Color lineColor;

	protected int value = 0;

	public MyShape(int x, int y, Color fillColor, Color lineColor) {
		this.x = x;
		this.y = y;
		this.fillColor = fillColor;
		this.lineColor = lineColor;

		Random rand = new Random();
		value = rand.nextInt(1, 10);
	}

	public abstract void draw(Graphics2D g);

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getFillColor() {
		return this.fillColor;
	}

	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

	public Color getLineColor() {
		return this.lineColor;
	}

	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
