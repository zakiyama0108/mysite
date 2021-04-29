package test_package_2021_02;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass_AtomicInteger_001 {
	public static void main(String args[]) {
		AtomicInteger num1 = new AtomicInteger(0);
		int[] num2 = {0};
		
		IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> num1.incrementAndGet());
		System.out.println(num1);
		
		IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> ++num2[0]);
		System.out.println(num2[0]);
		

//		int[] num3 = IntStream.iterate(1, i -> i+1).limit(5).toArray();
//		for(int i : num3) {
//			System.out.println(i);
//		}
		//Arrays.asList(num3).forEach(System.out::println);
//		List<Integer> list = new ArrayList<>();
//		for(int i : num3) {
//			list.add(i);
//		}
//		
//		List<int[]> list = Arrays.asList(num3);
//		list.forEach(System.out::println);
	}
}
