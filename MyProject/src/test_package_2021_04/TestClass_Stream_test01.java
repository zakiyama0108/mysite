package test_package_2021_04;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class TestClass_Stream_test01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Stream<String> fruits = Stream.of("banana", "apple", "mango", "kiwi", "peach", "cherry", "lemon");
		Function<String, Integer> getCount = fruit-> fruit.length();
		Optional<String> result = fruits.map(Object::toString).collect(maxBy(comparing(getCount)));
		System.out.println("result: " + result.orElse("no item"));

		System.out.println("-----------------");
	
		Stream<String> fruits2 = Stream.of("banana", "apple", "mango", "kiwi", "peach", "cherry", "lemon");
		Function<String, Integer> getCount2 = fruit2-> fruit2.length();
//		Optional<String> result2 = fruits2.map(Object::toString).collect(maxBy(comparing(getCount2)));
//		fruits2.forEach(x->System.out.println(x));
		fruits2.map(Object::toString).forEach(System.out::println);
		//System.out.println("result: " + result2.orElse("no item"));
	}

}
