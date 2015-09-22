
import java.util.Scanner;

        
public class CircularQueue {
    private int head,tail;    
    private String name;
    private static final int size = 5;
    private String [ ] q = new String [size];
    Scanner input = new Scanner (System.in);
    public CircularQueue(){
        head=-1;
        tail=-1;
    }

        
    public void insertQueue(){
        name=getName();
        q[++tail]=name;
        if (isQueueFull()){
            System.out.println("Overflow");}
        else{
              if (isQueueEmpty()) {
                  head=head+1;
              }  //set head,specical case,algrothm doesn't
              if(tail==size-1) {//at end wrap
                 tail=-1;
              }
        }
    }//end
        
    public void deleteQueue ( ) {
        String X;
	      if(isQueueFull()) {
		       System.out.println("Overflow");
        }
	      else { 
		      X = q[head];
		      System.out.println ("servicing" +" " + X);
		      if (head == tail) {//just emptied q
		        head = -1; //rest head,tail
		        tail = -1;
        	}
		      else { //rest of delete q
		        head ++;
		        if (head == size) {//wrap
			      head = 0;
            }
		      } //end else
	      } //end other else
    } //end of delete queue
    
    public void PrintQueueLogical( ) {
        int next;
	      if (isQueueEmpty()) {
	       System.out.println("Empty");
        }
	      else{
	       	next = head;
	       	System.out.println("q[" + next +"]" + q[next]);
	       	while (next != tail) {
                 next ++;
          }
          if (next==size) {
              next = 0;
          }
        System.out.println ("q[" + next +"]" + q[next]);
	      } //end else
    } //end Print QueueLogical
    
    public void PrintQueuePhysical(){
	      for ( int J = 0;J < size; J++)
	      System.out.println ("q[" + J + "] = " + q[J]);
    } //end Print QueuePhysical
    
    private String getName(){
	      System.out.println ("enter name:");
	      return input.nextLine();
    } //get name
    
    public boolean isQueueEmpty(){
	      return ( head == -1);
    }
    
    public boolean isQueueFull(){
	      return ((tail - head + 1 == 0 ) || (tail - head + 1 == size));
	  } //end is                                                                                                                                                                                                    QueueFull
} //end CircularQueue


