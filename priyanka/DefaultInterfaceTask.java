package priyanka;
interface DefaultInterfaceTask {
	
	    default void start() {
	        System.out.println("Starting the vehicle...");
	    }


	class Car implements DefaultInterfaceTask {
	    // Car does not override start(), so it will use the default method
	}

	
}
