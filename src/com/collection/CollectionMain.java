package com.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.collection.stream.StreamPractice;

/**
 * @author haramohan.sahu
 *
 */
public class CollectionMain {



	public static void main(String[] args) {
/*
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");	
		List<Integer> list=Arrays.asList(11,22,3,4,5,7,14);
		System.out.println(StreamPractice.sumStream(list));
		System.out.println("===========StreamfindFirst & ifPresent=====================");
		StreamPractice.streamIfPresent();
		System.out.println("===========streamOf=====================");
		StreamPractice.streamOf();
		System.out.println("===========IntStrea Example=====================");
		StreamPractice.intStreaRange();
		
		Stream.of("a1A", "a2B", "a3C").map(s -> s.substring(0)).forEach(System.out::println   );
		IntStream.range(1, 4).mapToObj( (i) -> "M" + i).forEach(System.out::println);
		*/
		
		StreamPractice.printStream();

	}

}
