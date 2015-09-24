import java.util.Scanner;

class TestCircularQueue2 {
    public static void main (String [] args){
        CircularQueue m = new CircularQueue();
		Scanner in = new Scanner (System.in);
		char x;
		String Response;
		System.out.println("enter command - i/d/p/l/q"); 
		Response = in.next();
		x = Response.charAt(0);
		x = Character.toLowerCase(x);
		while (x != 'q' && x != 'Q') {
			switch(x) {
				case 'i':
					m.insertQueue();
					break;
				case 'd':
				case 'D':
					m.deleteQueue();
					break;
				case 'l':
					m.PrintQueueLogical();
					break;
				case 'p':
					m.PrintQueuePhysical();
					break;
                default:
					System.out.println("Incorrect input -i/d/p/l/q");
					break;			
			}  //switch
			System.out.println("enter command -i/d/l/q/p");
			Response = in.next();
			x = Response.charAt(0);
			x = Character.toLowerCase(x);		
		} // end while
		System.out.println("im Queue");
	} // main
} // class