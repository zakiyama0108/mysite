package test_package_2021_05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass_kurohon_04_10_range {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		//1~9�܂ł̐��l�͈̓X�g���[��
		IntStream.range(1, 10).forEach(System.out::print);
		
		System.out.println("");
		System.out.println("----------------------");
		//0~9�܂ł̐��l�͈̓X�g���[��
		IntStream.range(0, 10).forEach(System.out::print);

		
		System.out.println("");
		System.out.println("----------------------");
		
		//0~10�܂ł̐��l�͈̓X�g���[��
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
		
		
	}
}
