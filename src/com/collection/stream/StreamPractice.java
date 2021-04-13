package com.collection.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
 * Stream operations are either intermediate or terminal. Intermediate operations return a stream so we can chain multiple 
 * intermediate operations without using semicolons. Terminal operations are either void or return a non-stream result. 
 * In the above example filter, map and sorted are intermediate operations whereas forEach is a terminal operation.
 */

public class StreamPractice {
	public static Long sumStream(List<Integer> list)
	{

		return list.stream().filter(i-> i > 10).mapToLong(i -> i).sum();

	}
	/*
	 * Just use Stream.of() to create a stream from a bunch of object references.
	 */
	public static void streamOf()
	{
		Stream.of("A1", "A2", "A3", "A4")
		.findFirst()
		.ifPresent(System.out::println);  // a1

	}
	/*
	 * Calling the method stream() on a list of objects returns a regular object stream
	 */
	public static void streamIfPresent()
	{
		Arrays.asList("a1", "a2", "a3")
		.stream().findFirst()
		.ifPresent(System.out::println);  // a1
	}
	public static void streamFilter()
	{
		Arrays.asList("a1", "a2", "a3")
		.stream().filter(i->i.startsWith("a")).forEach(System.out::println);
	}

	public static void intStreaRange()
	{
		IntStream.range(1, 4).forEach(System.out::println);
	}

}
