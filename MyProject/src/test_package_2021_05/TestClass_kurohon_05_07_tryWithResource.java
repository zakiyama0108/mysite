package test_package_2021_05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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

public class TestClass_kurohon_05_07_tryWithResource {

	public static void main(String[] args) {
		
		//現在位置の絶対パスからカレントディレクトリを取得する
        String path = new File(".").getAbsoluteFile().getParent();
        System.out.println(path);
		
		
        // 1.ファイルのパスを指定する
        File inputFile = new File("in.txt");
        File outputFile = new File("out.txt");
        
        // 2.ファイルが存在しない場合に例外が発生するので確認する
        if (!inputFile.exists()) {
            System.out.print("ファイルが存在しません");
            return;
        }
        
		try (FileReader in = new FileReader(inputFile);
			FileWriter out = new FileWriter(outputFile)){
			//ファイルの読み書き
            // 3.FileReaderクラスとreadメソッドを使って1文字ずつ読み込み表示する
            int data;
            while ((data = in.read()) != -1) {
                System.out.print((char) data);
            }
		}catch (IOException e) {
			//例外処理
		}
		
		
		
		
	}
}



