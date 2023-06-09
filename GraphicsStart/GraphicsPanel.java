import java.awt.*;
import javax.swing.JPanel;


public class GraphicsPanel extends JPanel 
{

    public GraphicsPanel() 
	{
        this(null);  // Call the other constructor, with parameter null.
    }

    public GraphicsPanel(String messageString) 
	{
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g) 
	{
        super.paintComponent(g);  // Call the paintComponent method from the 
                                  // superclass, JPanel.  This simply fills the 
                                  // entire panel with the background color, black.
        
        Graphics2D g2d = (Graphics2D)g;  // (To make the text smoother.)


		drawParabola(g2d, 32, 10, 10, 2, 3, 2);

	} // end 

	void drawPattern(Graphics2D g2d, MyShape[][] pattern)
	{
		for (int gx = 0; gx < pattern.length; gx++)
		{
			for (int gy = 0; gy < pattern[gx].length; gy++)
			{
				pattern[gx][gy].draw(g2d);
			}
		}
	}


	void drawPatternBorder(Graphics2D g2d, int gridSize, int cellCountX, int cellCountY)
	{
		Circle[][] grid = new Circle[cellCountX][cellCountY];

		for (int gx = 0; gx < cellCountX; gx++)
		{
			for (int gy = 0; gy < cellCountY; gy++)
			{
				Color innerColor = new Color(100, 200, 100);
				Color outerColor = new Color(20, 60, 20);

				if (gx > 0 && gy > 0 && gx < cellCountX - 1 && gy < cellCountY - 1)
				{
					innerColor = new Color(200, 100, 100);
					outerColor = new Color(70, 40, 40);
				}

				grid[gx][gy] = new Circle(gx * gridSize, gy * gridSize, gridSize, innerColor
				, outerColor);
			}
		}

		drawPattern(g2d, grid);
	}


	void drawPatternX(Graphics2D g2d, int gridSize, int cellCountX, int cellCountY)
	{
		Circle[][] grid = new Circle[cellCountX][cellCountY];

		for (int gx = 0; gx < cellCountX; gx++)
		{
			for (int gy = 0; gy < cellCountY; gy++)
			{
				Color innerColor = new Color(100, 200, 100);
				Color outerColor = new Color(20, 60, 20);

				if (gx != gy && (cellCountX - 1 - gx) != gy)
				{
					innerColor = new Color(200, 100, 100);
					outerColor = new Color(70, 40, 40);
				}

				grid[gx][gy] = new Circle(gx * gridSize, gy * gridSize, gridSize, innerColor
				, outerColor);
			}
		}

		drawPattern(g2d, grid);
	}


	void drawPatternOddEven(Graphics2D g2d, int gridSize, int cellCountX, int cellCountY)
	{
		Circle[][] grid = new Circle[cellCountX][cellCountY];

		for (int gx = 0; gx < cellCountX; gx++)
		{
			for (int gy = 0; gy < cellCountY; gy++)
			{
				Color innerColor = new Color(100, 200, 100);
				Color outerColor = new Color(20, 60, 20);
				
				Circle circle = new Circle(gx * gridSize, gy * gridSize, gridSize, innerColor
				, outerColor);
				
				if (circle.getValue() % 2 != 0)
				{
					circle.fillColor = new Color(200, 100, 100);
					circle.lineColor = new Color(70, 40, 40);
				}

				grid[gx][gy] = circle;
			}
		}

		drawPattern(g2d, grid);
	}

	
	void drawParabola(Graphics2D g2d, int gridSize, int cellCountX, int cellCountY, int a, int h, int k)
	{
		Circle[][] grid = new Circle[cellCountX][cellCountY];

		for (int gx = 0; gx < cellCountX; gx++)
		{
			for (int gy = 0; gy < cellCountY; gy++)
			{
				Color innerColor = new Color(200, 100, 100);
				Color outerColor = new Color(70, 40, 40);
				
				Circle circle = new Circle(gx * gridSize, gy * gridSize, gridSize, innerColor
				, outerColor);
				
				int y = (int) (a * Math.pow((gx - h), k));

				if (y == gy)
				{
					circle.fillColor = new Color(100, 200, 100);
					circle.lineColor = new Color(20, 60, 20);
					
				}

				grid[gx][gy] = circle;
			}
		}

		drawPattern(g2d, grid);
	}


	void drawSquareGrid(Graphics2D g2d, int gridSize, int cellCountX, int cellCountY)
	{
		Square[][] grid = new Square[cellCountX][cellCountY];

		for (int gx = 0; gx < cellCountX; gx++)
		{
			for (int gy = 0; gy < cellCountY; gy++)
			{
				grid[gx][gy] = new Square(gx * gridSize, gy * gridSize, gridSize, Color.green
				, new Color(20, 60, 20));
			}
		}

		drawPattern(g2d, grid);
	}

	

	void drawCircleGrid(Graphics2D g2d, int gridSize, int cellCountX, int cellCountY)
	{
		Circle[][] grid = new Circle[cellCountX][cellCountY];

		for (int gx = 0; gx < cellCountX; gx++)
		{
			for (int gy = 0; gy < cellCountY; gy++)
			{
				grid[gx][gy] = new Circle(gx * gridSize, gy * gridSize, gridSize, Color.green
				, new Color(20, 60, 20));
			}
		}

		drawPattern(g2d, grid);
	}


} // end paintComponent()
