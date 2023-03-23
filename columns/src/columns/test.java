package columns;
import enigma.console.TextAttributes;
import enigma.core.Enigma;
public class test {
	public static enigma.console.Console cn = Enigma.getConsole("Columns",109,32,16);
	public static void main(String[] args) {
		Box box=new Box();
		SingleLinkedList boxnumber=box.boxnumber();
		SingleLinkedList c1=new SingleLinkedList();
		SingleLinkedList c2=new SingleLinkedList();
		SingleLinkedList c3=new SingleLinkedList();
		SingleLinkedList c4=new SingleLinkedList();
		SingleLinkedList c5=new SingleLinkedList();
		Screen screen=new Screen();
		Screen.text();
		
		c1=box.columns(c1,boxnumber);
	    c2=box.columns(c2,boxnumber);
	    c3=box.columns(c3,boxnumber);
	    c4=box.columns(c4,boxnumber);
	    c5=box.columns(c5,boxnumber);
	    
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
	    cn.getTextWindow().setCursorPosition(48, 4);
	    boxnumber.display(48, 4);
	}



	}


