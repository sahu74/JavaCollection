package com.collection;

import java.util.Arrays;
import java.util.List;

import com.collection.stream.StreamPractice;

/**
 * @author haramohan.sahu
 *
 */
public class CollectionMain {
	
	

	public static void main(String[] args) {
	
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");	
		List<Integer> list=Arrays.asList(11,22,3,4,5,7,14);
System.out.println(StreamPractice.sumStream(list));
	}

}
