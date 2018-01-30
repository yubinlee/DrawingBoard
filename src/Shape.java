import java.awt.*;
import java.util.Scanner;

public abstract class Shape {
	private int x;
	private int y;
	
	private int width;
	private int height;
	
	public Shape() {
		setAll();
	}
	
	public Shape(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	void setAll(){
		Scanner scan = new Scanner(System.in);
		
		while (true){
			System.out.print("x좌표: ");
			int x = scan.nextInt();
			System.out.print("y좌표: ");
			int y = scan.nextInt();
			System.out.print("넓이: ");
			int w = scan.nextInt();
			System.out.print("높이: ");
			int h = scan.nextInt();
		
			if (x < 0 || y < 0 || w < 0 || h < 0) {
				System.out.println("마이너스 값 왜 넣으세요");
			}
			else if (x > WINDOW.HEIGHT || y > WINDOW.WIDTH || w > WINDOW.HEIGHT || h > WINDOW.WIDTH) {
				System.out.println("윈도우 사이즈 초과");
			}
			else {
				setX(x);
				setY(y);
				setWidth(w);
				setHeight(h);
				break;
			}
		}
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	abstract void draw(Graphics g);
	abstract void fill(Graphics g);
}
