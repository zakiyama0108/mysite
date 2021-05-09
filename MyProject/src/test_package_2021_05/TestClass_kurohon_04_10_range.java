package test_package_2021_05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass_kurohon_04_10_range {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//1~9までの数値範囲ストリーム
		IntStream.range(1, 10).forEach(System.out::print);
		
		System.out.println("");
		System.out.println("----------------------");
		//0~9までの数値範囲ストリーム
		IntStream.range(0, 10).forEach(System.out::print);

		
		System.out.println("");
		System.out.println("----------------------");
		
		//0~10までの数値範囲ストリーム
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
		
		
	}
}
