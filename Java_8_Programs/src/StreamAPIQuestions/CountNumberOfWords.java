package StreamAPIQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumberOfWords {
	
	
    //Q1)Write a Java Program to count the number of words in a string using HashMap in Java8 streams.
	//Input : "This this is is done by Mahesh Mahesh"
	//Output : Mahesh=2, by=1, this=1, This=1, is=2, done=1
	
	
	public static void main(String[] args) {
		String str = "This this is is done by Mahesh      Mahesh";
	
		LinkedHashMap<String, Long> collect = Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(collect);
		
	}

}
