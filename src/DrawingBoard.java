import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

public class DrawingBoard extends Frame{
	
	 public DrawingBoard(String title){
		 super(title);
	}
	
	 public static void showColorMenu(){
		System.out.println("1. 파랑");
		System.out.println("2. 노랑");
		System.out.println("3. 오렌지");
		System.out.println("4. 핑크");
	}
	 
	public Color selectColor(){
		System.out.println("*먼저 색을 정해보아요*");
		showColorMenu();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Color c = COLOR.BLACK;
		switch(num) {
		case 1:
			c = COLOR.BLUE;
			break;
		case 2:
			c = COLOR.YELLOW;
			break;
		case 3:
			c = COLOR.ORANGE;
			break;
		case 4:
			c = COLOR.PINK;
			break;
		}
		return c;
	}
	
	public static void showMenu(){
		System.out.println("1. 타원");
		System.out.println("2. 사각형");
		System.out.println("3. 직선");
	}
	public static void showMenu2(){
		System.out.println("1. 타원");
		System.out.println("2. 사각형");
	}
	
	public void drawShape(){
		Graphics g = this.getGraphics();
		Color c = selectColor();
		showMenu();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch(num) {
		case 1:
			Oval o = new Oval();
			g.setColor(c);
			o.draw(g);
			break;
		case 2:
			Rectangle r = new Rectangle();
			g.setColor(c);
			r.draw(g);
			break;
		case 3:
			Line l = new Line();
			g.setColor(c);
			l.draw(g);
			break;
		}
	}
	public void fillShape(){
		Graphics g = this.getGraphics();
		Color c = selectColor();
		showMenu2();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch(num) {
		case 1:
			Oval o = new Oval();
			g.setColor(c);
			o.fill(g);
			break;
		case 2:
			Rectangle r = new Rectangle();
			g.setColor(c);
			r.fill(g);
			break;
		}
	}
	public void deleteShape(){
		this.repaint();
	}
}
