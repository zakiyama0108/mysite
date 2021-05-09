package test_package_2021_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class TestClass_kurohon_04_13_Stream_filter {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		IntStream.range(1, 5).filter(n -> n%2 == 0).forEach(System.out::print);

		System.out.println("");
		IntStream.range(1, 5).map(n -> n*2).forEach(System.out::print);
		
		System.out.println("");
		IntStream.range(1, 5).limit(2).forEach(System.out::print);

	}
}
