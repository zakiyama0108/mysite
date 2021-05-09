package test_package_2021_05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class TestClass_kurohon_04_05_ramda_forEach {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//
		List<String> list = Arrays.asList("A", "B", "C");
		
		Consumer<String> action = new Consumer<String>() {
			public void accept(String str) {
				System.out.print(str);
			}
		};
		
		Stream<String> stream = list.stream();
		stream.forEach(action);
	}

}
