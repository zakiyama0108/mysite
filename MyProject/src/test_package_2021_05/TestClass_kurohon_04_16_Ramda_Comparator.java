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
import java.util.stream.IntStream;

public class TestClass_kurohon_04_16_Ramda_Comparator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<Employee> set = new TreeSet<>((e1, e2) -> e1.getId() -e2.getId());
		set.add(new Employee(3, "John"));
		set.add(new Employee(1, "Bill"));
		set.add(new Employee(2, "Eric"));
		System.out.println(set);
	}
}


