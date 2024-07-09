package Java8_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoverDuplicateTask4 {

	public static void main(String[] args) {
		  List<Integer> integers = new ArrayList<>();
	        integers.add(1);
	        integers.add(2);
	        integers.add(3);
	        integers.add(2);
	        integers.add(4);
	        integers.add(1);
	        integers.add(5);
	        System.out.println("Original list: " + integers);
		List<Integer> list=integers.stream().distinct().collect(Collectors.toList());
		 System.out.println("after removing duplicates Original list are: " + list);
		
	}

}
