package mypkg1;

import java.util.*;
import java.util.function.*;

public class MyClass1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("こんにちは！Javaプログラミング！");
		
		List<String> words = Arrays.asList("Tanaka", "Sato");
		words.replaceAll(new UnaryOperator<String>() {
			public String apply(String str) {
				return str.toUpperCase();
			}
		});
	}

}
