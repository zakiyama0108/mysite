package mypkg1;

import java.util.*;
import java.util.function.*;

public class MyClass1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("����ɂ��́IJava�v���O���~���O�I");
		
		List<String> words = Arrays.asList("Tanaka", "Sato");
		words.replaceAll(new UnaryOperator<String>() {
			public String apply(String str) {
				return str.toUpperCase();
			}
		});
	}

}
