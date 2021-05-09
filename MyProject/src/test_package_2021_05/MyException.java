package test_package_2021_05;

public class MyException extends Exception{

	/**
	 * warningを回避するための宣言
	 */
	private static final long serialVersionUID = 1L;
	
	//コンストラクタ
	public MyException(String msg){
		super(msg);
	}
	
}
