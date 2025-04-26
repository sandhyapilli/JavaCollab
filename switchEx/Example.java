package switchEx;

public class Example {
	public static void main(String[] args) {
		int marks=99;
		
		switch(marks) {
		case 90:if(marks>=90)
		System.out.println("A");
		break;
		case 80:if(marks>=80)
		System.out.println("B");
		break;
		case 70:if(marks>=70) 
			System.out.println("C");
			break;
		case 4:if(marks>=50) 
	    System.out.println("D");
	    break;
	    default:
	    	System.out.println("Fail");
			}
		}
//		
//	        int choice = 2;
//
//	        switch (choice) {
//	            case 1:
//	                System.out.println("Hello!");
//	                break;
//	            case 2:
//	                System.out.println("How are you?");
//	                break;
//	            case 3:
//	                System.out.println("Goodbye!");
//	                break;
//	            default:
//	                System.out.println("Invalid choice.");
//	        }
//	    }
	}
	

