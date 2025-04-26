package priyanka;

public interface InterfaceAmbiguity {
	 
	    default void show() {
	        System.out.println("A's show method");
	    }
	}

	interface B {
	    default void show() {
	        System.out.println("B's show method");
	    }
	}

	class C implements InterfaceAmbiguity, B {
	    // Compiler error if show() is not overridden
	    @Override
	    public void show() {
	        System.out.println("C's show method");
	    }
	}

	


