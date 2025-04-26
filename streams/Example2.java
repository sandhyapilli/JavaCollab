package streams;

import java.util.stream.Stream;

public class Example2 {
	public static void main(String args[]) {
		Stream s=Stream.of(9,99,9999,73846,87635);
		s.forEach(System.out::println);  //it means streams are not only applicable for collections.It can be applicable
		                                 //for all the group of elements.
		Integer[] i= {1,2,3,4,5};
		Stream.of(i).forEach(System.out::println);//it means streams are applicable for arrays also.
	}

}
