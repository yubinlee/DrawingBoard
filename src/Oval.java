import java.awt.*;
import java.util.Scanner;

public class Oval extends Shape {
	
	public Oval(){
		super();
	}

	public Oval(int centerX, int centerY, int width, int height) {
		super(centerX, centerY, width, height);
	}


	@Override
	void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	void fill(Graphics g) {
		// TODO Auto-generated method stub
		g.fillOval(getX(), getY(), getWidth(), getHeight());
	}
	

}
