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

public class TestClass_kurohon_05_06_MyException {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			doIt();
		} catch (MyException e) {
			//例外処理
			System.out.println(e.getMessage());
		}		
	}
	
	public static void doIt() throws MyException {
//		if(value < 0) {
			throw new MyException("testMyExceptionMessage");
//		}
	}

}



