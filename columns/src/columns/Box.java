package columns;
import java.util.Random;
public class Box {
	public SingleLinkedList boxnumber() {
		SingleLinkedList sllbox=new SingleLinkedList();
		
		int count=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0;
		Random rnd=new Random();
		int number;
		while(count<50) {
			number=rnd.nextInt(10)+1;
			switch(number) {
			case 1:
				if(count1<5) {
					sllbox.add(number);
					count1++;
					count++;
				}
				break;
			case 2:
				if(count2<5) {
					sllbox.add(number);
					count2++;
					count++;
				}
				break;
			case 3:
				if(count3<5) {
					sllbox.add(number);
					count3++;
					count++;
				}
				break;
			case 4:
				if(count4<5) {
					sllbox.add(number);
					count4++;
					count++;
				}
				break;	
			case 5:
				if(count5<5) {
					sllbox.add(number);
					count5++;
					count++;
				}
				break;	
			case 6:
				if(count6<5) {
					sllbox.add(number);
					count6++;
					count++;
				}
				break;
			case 7:
				if(count7<5) {
					sllbox.add(number);
					count7++;
					count++;
				}
				break;
			case 8:
				if(count8<5) {
					sllbox.add(number);
					count8++;
					count++;
				}
				break;
			case 9:
				if(count9<5) {
					sllbox.add(number);
					count9++;
					count++;
				}
				break;	
			case 10:
				if(count10<5) {
					sllbox.add(number);
					count10++;
					count++;
				}
				break;	
				
			}
		}
		
		return sllbox;
	}
	
	public SingleLinkedList columns(SingleLinkedList column,SingleLinkedList boxnumber) {
		
		for(int i=0;i<6;i++) {
			int number=boxnumber.popList();
			column.add(number);
			boxnumber.delete(number);
		}
		return column;
	}
}

}
