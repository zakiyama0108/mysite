package test_package_2021_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClass_kurohon_04_12_BufferedReader_lines {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//BufferedReaderクラスのlinesメソッドの利用
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\zakiyama0108\\git\\mysite\\MyProject\\src\\test_package_2021_05\\sample.txt"))){
			br.lines().forEach(System.out::println);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------");
		
		Path path = Paths.get("C:\\Users\\zakiyama0108\\git\\mysite\\MyProject\\src\\test_package_2021_05\\sample.txt");
		
		try{
			Files.lines(path).forEach(System.out::println);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println("--------------------");

		try(BufferedReader br2 = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			br2.lines().forEach(System.out::println);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
