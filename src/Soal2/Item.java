package Soal2;

public class Item {
	private String name;
	public Item() {
		this.name = "Ipin";
		System.out.println(name);
	}
	public Item(String name) {
		this.name = name;
		System.out.println(name); //agar jika dipanggil tidak null hasilnya 
	}
}
