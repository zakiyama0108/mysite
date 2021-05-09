package test_package_2021_04;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestClass_murasaki_mogi_26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Predicate<? super String> f = s -> s.length() > 3;
		System.out.println("f: " + f);
		
		Stream<String> stream = Stream.iterate("x", s -> s + s);
		
		Stream<String> stream2 = Stream.iterate("x", s -> s + s);
		stream2.limit(5).forEach(x -> System.out.println("stream: " + x));
		
		boolean a = stream.noneMatch(f);
		System.out.println("noneMatch Results: " + a);
		boolean b = stream.anyMatch(f);
		System.out.println("anyMatch Results: " + b);
		
	}

}
