package columns;

import enigma.core.Enigma;

public class SingleLinkedList {
	public Node head = null;
	public Node tail = null;
	
	public void add(Object data) {
		if(head==null) {
			Node newNode = new Node(data);                   
			head = newNode;
			tail = newNode;
		}
		else  {           
			Node newnode = new Node(data);
			newnode.setLink(head);
			head = newnode;
		}
	}
	public void delete(Object dataToDelete) {
		if(size()==1) {
			head = null;
			return;
		}
		while((Integer)head.getData()==(Integer)dataToDelete)
			head = head.getLink();
		Node temp = head;
		Node previous = null;
		while(temp != null) {
			if((Integer)temp.getData()==(Integer)dataToDelete) {
				previous.setLink(temp.getLink());
				temp=previous;
				return;
			}
			previous = temp;
			temp = temp.getLink();
			
		}
	}
	public boolean search(Object item) {
        boolean flag = false;
        if(head == null)
            System.out.print("Linked list empty.");
        else {
            Node temp = head;
            while(temp != null) {
                if(item == temp.getData()) 
                    flag = true;
                temp = temp.getLink();
            }
        }
        return flag;
    }
	
	public void display(int x, int y) {
		enigma.console.Console cn = Enigma.getConsole("Columns",109,32,16);
		if(head==null)
			System.out.println("Linked list is empty");
		else {
			Node temp=head;
			while(temp!=null) {
				cn.getTextWindow().setCursorPosition(x, y);
				System.out.println(temp.getData());
				temp=temp.getLink();
				y++;
			}
		}
	}
	public int popList() {
		int listnumber=0;
		if(head==null)
			System.out.println("Linked list is empty");
		else {
			Node temp=head;
			if(temp!=null) {
				listnumber=(int) temp.getData();
				
			}
		}
		return listnumber;
	}
	
	public int size() {
		int count = 0;
		if(head == null) {
			System.out.println("Linked list is empty.");
		}
		else {
			Node temp = head;
			while(temp != null){
				count++;
				temp=temp.getLink();
			}
		}
		return count;
	}
	
	public int countnumber(Object e) {         
        Node current = head;
        int count = 0;
        for(int i = 0; i < size(); i++) {
            if(e == current.getData()) {
                count++;
            }
            current = current.getLink();
        }
        return count;
    }
	
	
    public void addsorted(Object data) {

        if(head==null) {
            Node newNode = new Node(data);                
            head = newNode;
            tail = newNode;
        }
        else if(Integer.parseInt(data.toString().split(" ")[1]) < Integer.parseInt(head.getData().toString().split(" ")[1])) {          
            Node newnode = new Node(data);
            newnode.setLink(head);
            head = newnode;
        }
        else {
            Node temp = head;
            Node previous = null;
            
            while(temp!=null && Integer.parseInt(data.toString().split(" ")[1]) > Integer.parseInt(temp.getData().toString().split(" ")[1])) {
                previous = temp;
                temp=temp.getLink();
            }
            if(temp==null){                                     
                Node newnode = new Node(data);
                previous.setLink(newnode);
            }
            else {                                              
                Node newnode = new Node(data);
                newnode.setLink(temp);
                previous.setLink(newnode);
            }
        }
    }

	
	
	



}
		







