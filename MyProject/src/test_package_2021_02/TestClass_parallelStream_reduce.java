package test_package_2021_02;

import java.util.Arrays;

public class TestClass_parallelStream_reduce {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String strings = Arrays.asList("�P", "�Q", "�R").parallelStream().parallel()
					.reduce("", (s1, s2) -> s1 + s2);

		System.out.println(strings);
	}

}
