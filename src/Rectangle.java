import java.awt.*;

public class Rectangle extends Shape {

	public Rectangle(){
		super();
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	@Override
	void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	void fill(Graphics g) {
		// TODO Auto-generated method stub
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	

}