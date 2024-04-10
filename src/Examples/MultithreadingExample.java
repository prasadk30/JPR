package Examples;


//Class representing a thread that prints numbers from 1 to 5
class NumberThread extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("NumberThread: " + i);
         try {
             Thread.sleep(1000); // Pause for 1 second
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
}

//Class representing a thread that prints alphabets from A to E
class AlphabetThread extends Thread {
 public void run() {
     for (char ch = 'A'; ch <= 'E'; ch++) {
         System.out.println("AlphabetThread: " + ch);
         try {
             Thread.sleep(1000); // Pause for 1 second
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        // Creating objects of NumberThread and AlphabetThread
        NumberThread numberThread = new NumberThread();
        AlphabetThread alphabetThread = new AlphabetThread();

        // Starting the threads
        numberThread.start();
        alphabetThread.start();
    }

}
