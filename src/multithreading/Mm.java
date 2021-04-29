package multithreading;

public class Mm {
	public static void main(String[] args) throws InterruptedException 
    { 
        int n = 8; // Number of threads 
        for (int i=1; i<9; i++) 
        { 
            Multithreading object = new Multithreading(); 
            Thread.sleep(3000);
            object.start(); 
        } 
    } 

}
