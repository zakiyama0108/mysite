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
		
		//���݈ʒu�̐�΃p�X����J�����g�f�B���N�g�����擾����
        String path = new File(".").getAbsoluteFile().getParent();
        System.out.println(path);
		
		
        // 1.�t�@�C���̃p�X���w�肷��
        File inputFile = new File("in.txt");
        File outputFile = new File("out.txt");
        
        // 2.�t�@�C�������݂��Ȃ��ꍇ�ɗ�O����������̂Ŋm�F����
        if (!inputFile.exists()) {
            System.out.print("�t�@�C�������݂��܂���");
            return;
        }
        
		try (FileReader in = new FileReader(inputFile);
			FileWriter out = new FileWriter(outputFile)){
			//�t�@�C���̓ǂݏ���
            // 3.FileReader�N���X��read���\�b�h���g����1�������ǂݍ��ݕ\������
            int data;
            while ((data = in.read()) != -1) {
                System.out.print((char) data);
            }
		}catch (IOException e) {
			//��O����
		}
		
		
		
		
	}
}



