package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		List <Integer> num = new ArrayList<>();
		num.add(3);
		num.add(2);
		num.add(11);
		num.add(4);
		num.add(6);
		num.add(7);
		Set<Integer> num1 = new TreeSet<>(num);
		//System.out.println(num1);
		List<Integer> num2 = new ArrayList<>(num1);
		int i = num.size()-2;
		System.out.println(num2.get(i));	
	}

}
