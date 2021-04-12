package com.collection.stream;

import java.util.List;

public class StreamPractice {
	public static Long sumStream(List<Integer> list)
	{
		
		return list.stream().filter(i-> i > 10).mapToLong(i -> i).sum();
		
	}

}
