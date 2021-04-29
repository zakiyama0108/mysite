package test_package_2021_02;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass_Stream_GroupingByConcurrent {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Stream<Integer> s1 = Stream.of(10, 20, 30, 40).parallel();
		Stream<Integer> s2 = Stream.of(50, 60, 70).parallel();
		Stream<Stream<Integer>> stream = Stream.of(s1, s2);
		ConcurrentMap<Boolean, List<Integer>> map = stream.flatMap(i -> i)
				.collect(Collectors.groupingByConcurrent(i -> i < 35));
		System.out.println(map.get(true).size() + " " + map.get(false).size());
		
		
		
		///////////////////////////////////////////////////////////
		System.out.println(map.size());
		
		for(List<Integer> list : map.values()) {
			for(int i : list) {
				System.out.println(list + ": " + i);
			}
		}
		
	}

}
