package Soal3;

public class KelasSatu {
	//Instance initialization block
	{
		System.out.println(11);
	}
	//Static block
	static {
		System.out.println(2);
	}
	//konstruktor 2 
	public KelasSatu(int i) {
		System.out.println(3);
	}
	//konstruktor 1 
	public KelasSatu() {
		System.out.println(4); 
	}
}


/*
 * Class pada KelasSatu terdapat sebuah beberapa block dan juga 2 konstruktor 
*/