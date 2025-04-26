package com.example.LoggingDemo;

	// Extend RuntimeException for unchecked exceptions
	public class ResourceNotFoundException extends RuntimeException {
	    public ResourceNotFoundException(String message) {
	        super(message);
	    }
	    public class MethodNotFoundException extends Exception{
	    	public MethodNotFoundException(String message) {
	    		super(message);
	    	}
	    }
	   
	}


