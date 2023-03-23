package columns;
import enigma.console.TextAttributes;
import enigma.core.Enigma;
public class Screen {
public static enigma.console.Console cn = Enigma.getConsole("Columns",109,32,16);
	
    public static void text() {
		int i=1;
		while(i<99) {
			cn.getTextWindow().setCursorPosition(i, 0);
			System.out.println("_");
			cn.getTextWindow().setCursorPosition(i, 25);
			System.out.println("_");
			i++;
		}
		
		cn.getTextWindow().setCursorPosition(5, 2);//x,y
		System.out.println("C1");
		cn.getTextWindow().setCursorPosition(15, 2);
		System.out.println("C2");
		cn.getTextWindow().setCursorPosition(25, 2);
		System.out.println("C3");
		cn.getTextWindow().setCursorPosition(35, 2);
		System.out.println("C4");
		cn.getTextWindow().setCursorPosition(45, 2);
		System.out.println("C5");
		cn.getTextWindow().setCursorPosition(5, 3);
		System.out.println("--");
		cn.getTextWindow().setCursorPosition(15, 3);
		System.out.println("--");
		cn.getTextWindow().setCursorPosition(25, 3);
		System.out.println("--");
		cn.getTextWindow().setCursorPosition(35, 3);
		System.out.println("--");
		cn.getTextWindow().setCursorPosition(45, 3);
		System.out.println("--");
		
		cn.getTextWindow().setCursorPosition(65, 2);
		System.out.println("Transfer: ");
		cn.getTextWindow().setCursorPosition(65, 3);
		System.out.println("Score: ");
		
		cn.getTextWindow().setCursorPosition(65, 5);
		System.out.println("Box");
		cn.getTextWindow().setCursorPosition(65, 6);
		System.out.println("*---* ");
		cn.getTextWindow().setCursorPosition(65, 7);
		System.out.println("|   |");
		cn.getTextWindow().setCursorPosition(65, 8);
		System.out.println("|   |");
		cn.getTextWindow().setCursorPosition(65, 9);
		System.out.println("*---*");

	}

	public static void columns() {
		Box box=new Box();
		SingleLinkedList c1=new SingleLinkedList();
		SingleLinkedList c2=new SingleLinkedList();
		SingleLinkedList c3=new SingleLinkedList();
		SingleLinkedList c4=new SingleLinkedList();
		SingleLinkedList c5=new SingleLinkedList();
		cn.getTextWindow().setCursorPosition(5, 4);
	    c1.display(5,4);
	    cn.getTextWindow().setCursorPosition(15, 4);
	    c2.display(15,4);
	    cn.getTextWindow().setCursorPosition(25, 4);
	    c3.display(25,4);
	    cn.getTextWindow().setCursorPosition(35, 4);
	    c4.display(35,4);
	    cn.getTextWindow().setCursorPosition(45, 4);
	    c5.display(45,4);
	}
}

}
