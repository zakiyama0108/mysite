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

public class TestClass_kurohon_04_18_Stream_Match {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		IntPredicate p = n -> n == 1;
		
		System.out.println(IntStream.of(1, 2, 3).allMatch(p));
		System.out.println(IntStream.of(1, 1, 1).allMatch(p));
		
		System.out.println(IntStream.of(1, 2, 3).anyMatch(p));
		System.out.println(IntStream.of(2, 3, 4).anyMatch(p));
		
		System.out.println(IntStream.of(1, 2, 3).noneMatch(p));
		System.out.println(IntStream.of(2, 3, 4).noneMatch(p));
	}
}


