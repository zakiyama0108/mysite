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
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass_kurohon_04_22_IntStream {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.printf("個数: %d\n", IntStream.of(1, 2, 3).count());
		System.out.printf("平均: %.1f\n", IntStream.of(1, 2, 3).average().getAsDouble());
		System.out.printf("最大: %d\n", IntStream.of(1, 2, 3).max().getAsInt());
		System.out.printf("最小: %d\n", IntStream.of(1, 2, 3).min().getAsInt());
		System.out.printf("合計: %d\n", IntStream.of(1, 2, 3).sum());
		
	}
}


