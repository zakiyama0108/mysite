package test_package_2021_03;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class TestClass_ListResourceBundle extends ListResourceBundle{

	public Object[][] getContents() {
		Long data1 = 10000L;
		Integer data2 = 500;
		int[] data3 = {10, 20, 30};
		Object[][] contents = {{"data1", data1}, {"data2", data2}, {"data3", data3}};
		return contents;
	}

}

class Test{
	public static void main(String[] args) {
		ResourceBundle obj = ResourceBundle.getBundle("test_package_2021_03.TestClass_ListResourceBundle");
		Long data1 = (Long)obj.getObject("data1");
		Integer data2 = (Integer)obj.getObject("data2");
		int[] data3 = (int[])obj.getObject("data3");
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.print("data3 : ");
		for(int i : data3) {System.out.print(i+ " ");}
		
		System.out.println("");
		System.out.println("-------------------------------------");
		TestClass_ListResourceBundle listResourceBundle = new TestClass_ListResourceBundle();
		Object[][] contents = listResourceBundle.getContents();
		
		for(Object data[] : contents) {
			System.out.println(data[0] + ": " + data[1]);
		}
		
		
	}
}