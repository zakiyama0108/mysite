package test_package_2021_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass_kurohon_04_17_Stream_peek {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Stream<String> stream = Stream.of("banana", "apple", "orange")
				.filter(e -> e.length() > 5)
				.peek(e -> System.out.print(e + " "))
				.map(String::toUpperCase)
				.peek(e -> System.out.print(e + " "));
		System.out.print("OK ");
		long count = stream.count();
		
	}
}


