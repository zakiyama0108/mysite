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

public class TestClass_kurohon_05_03_getCause {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			x();
		}catch (Throwable e) {
			while (e != null) {
				System.out.println(e.getMessage());
				e = e.getCause();
			}
		}

	}
	
	static void x() throws Exception {
		try {
			y();
		} catch(Exception e) {
			throw new Exception("execption in x()", e);
		}
	}
	
	static void y() throws Exception {
		try {
			z();
		} catch (Exception e) {
			throw new Exception("exception in y()", e);
		}
	}
	
	static void z() throws Exception {
		throw new Exception("exception in z()");
	}
}


