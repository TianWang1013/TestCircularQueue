
import java.util.Scanner;



class TestCircularQueue{
    public static void main (String [] args){
        CircularQueue m = new CircularQueue();
	for (int J = 0; J < 3; J++ ){
        m.insertQueue();
        m.insertQueue();
        m.deleteQueue();
        m.PrintQueueLogical();
        m.PrintQueuePhysical();
        }
    } //end main
} //end test CicularQueue