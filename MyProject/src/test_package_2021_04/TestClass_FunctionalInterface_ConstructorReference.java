package test_package_2021_04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestClass_FunctionalInterface_ConstructorReference {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//コンストラクタ参照
		//Suplier
		//Supplier<Foo> obj1 = () -> new Foo();
		Supplier<Foo> obj1 = Foo::new;
		System.out.println(obj1.get().a);
		
		//コンストラクタ参照
		//Function
		//Function<Integer, Foo> obj2 = i -> new Foo(i);
		Function<Integer, Foo> obj2 = Foo::new;
		System.out.println(obj2.apply(20).a);
		
		//コンストラクタ参照
		//Suplier
		//Supplier<List<Foo>> obj4 = () -> new ArrayList<Foo>();
		Supplier<List<Foo>> obj4 = ArrayList<Foo>::new;
		System.out.println(obj4.get().size());
	}
}

class Foo{
	int a=10;
	Foo(){}
	Foo(int a){this.a = a;}
}
