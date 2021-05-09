package test_package_2021_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass_kurohon_04_25_summingDouble {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Double total = Arrays.asList(
			new Book("Java Programming", 25.20),
			new Book("Introduce Java SE 8", 22.98),
			new Book("Functional Programming pocket guide", 16.77)
		).stream().collect(Collectors.summingDouble(Book::getPrice));
		
		System.out.println(total);
	}
}


