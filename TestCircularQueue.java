import java.util.Scanner;



class TestCircularQueue{
    public static void main (String [] args){
        CircularQueue m = new CircularQueue();
	for (int J = 0; J < 3; J++ ){
            m.insertQueue();
            m.insertQueue(); //insert the element into the queue
            m.deleteQueue(); //delete the element from the queue
            m.PrintQueueLogical(); //print the logical process of insert and delete the queue
            m.PrintQueuePhysical();
        }
    } //end main
} //end test CicularQueue