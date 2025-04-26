package priyanka;

public class Appending {
	public static void main(String[] args) throws InterruptedException {
		
	
//   String s="Sandhya";
//   StringBuilder s1= new StringBuilder();
//   s1.append("aishu");
//   s1.append("siri");
//   s1.append(s);
//  
		//StringBuilder s=new StringBuilder("pandhi aishu peddha kukka");
//		String wordToAdd=":avnu nijame 100%";
//		int index=24;
//		s.insert(index, wordToAdd);
//		s.replace(6,11,"siri");
//		System.out.println(s);
		
	
		        // Create a shared StringBuffer object
		      //  StringBuffer buffer = new StringBuffer("Hello");

		        // Create two threads that will append to the StringBuffer
		StringBuilder builder= new StringBuilder("Hello");
		        Thread thread1 = new Thread(() -> {
		            for (int i = 0; i < 5; i++) {
		                builder.append("A");
		            }
		        });

		        Thread thread2 = new Thread(() -> {
		            for (int i = 0; i < 5; i++) {
		                builder.append("B");
		            }
		        });

		        // Start both threads
		        thread1.start();
		        thread2.start();
		        

		        // Wait for both threads to finish
	        thread1.join();
		        thread2.join();

		        // Output the final result
		        System.out.println("Final StringBuffer: " + builder);
		    }
		

		 
}
