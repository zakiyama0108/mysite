package test_package_2021_05;

public class TestClass_kurohon_03_06_ramda {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Funnableインタフェースを実装する匿名内部クラス
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("OK");
				System.out.println("---------------------");
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		
		Runnable r2 = () -> System.out.print("ok");
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
