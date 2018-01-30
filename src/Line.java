import java.awt.*;
import java.util.Scanner;

public class Line {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Line(){
		setAll();
	}
	
	public Line(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	void setAll(){
		Scanner scan = new Scanner(System.in);
		
		while (true){
			System.out.print("시작 x좌표: ");
			int x1 = scan.nextInt();
			System.out.print("시작 y좌표: ");
			int y1 = scan.nextInt();
			System.out.print("끝 x좌표: ");
			int x2 = scan.nextInt();
			System.out.print("끝 y좌표: ");
			int y2 = scan.nextInt();
		
			if (x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0) {
				System.out.println("마이너스 값 왜 넣으세요");
			}
			else if (x1 > WINDOW.HEIGHT || y1 > WINDOW.WIDTH || x2 > WINDOW.HEIGHT || y2 > WINDOW.WIDTH ) {
				System.out.println("윈도우 사이즈 초과");
			}
			else {
				setX1(x1);
				setY1(y1);
				setX2(x2);
				setY2(y2);
				break;
			}
		}
	}
	
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawLine(getX1(), getY1(), getX2(), getY2());
	}


}