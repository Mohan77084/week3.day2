package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;

public class MaxDuplicate {
public static void main(String[] args) {
	String a = "abbaba";
	Map<Character,Integer> hm= new HashMap<>();
	char[] charArray = a.toCharArray();
	int maxCount = 1;
	char maxElement = charArray[0];
	for(int i = 0;i<charArray.length;i++) {
		if(hm.containsKey(charArray[i])) {
			hm.put(charArray[i], hm.get(charArray[i])+1);
		}
		else {
			hm.put(charArray[i], 1);
		}		
	
	int count = hm.get(charArray[i]);
	if(count>maxCount) {
		maxCount = count;
		maxElement = charArray[i];
		}
	}
	System.out.println(maxElement);
}
}
