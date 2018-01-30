import java.awt.Window;
import java.util.Scanner;

public class DrawingBoardMain {
	
	public static void showMenu(){
		System.out.println("1. 도형 그리기");
		System.out.println("2. 도형 색칠하기");
		System.out.println("3. 도형 삭제하기");
		System.out.println("0. 종료");
	}
	
	public static void main(String[] args){
		DrawingBoard d = new DrawingBoard("그림판");
		d.setSize(1000,700);
		d.setVisible(true);
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int num = 0;
		while (flag) {
			showMenu();
			num = scan.nextInt();
			switch(num) {
			case 1:
				d.drawShape();
				break;
			case 2:
				d.fillShape();
				break;
			case 3:
				d.deleteShape();
				break;
			case 0:
				flag = false;
				break;
			}
		}
	}
}
