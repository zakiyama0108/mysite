package test_package_2021_04;

import java.util.stream.Stream;

public class TestClass_murasaki_mogi_25 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Stream<String> stream = Stream.iterate("", s -> s + "a");
//		stream.limit(5).map(x -> x + "x").forEach(x -> System.out.println(x));
		System.out.println(stream.limit(5).map(x -> x + "x"));
		
	}

}
