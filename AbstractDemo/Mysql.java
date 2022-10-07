package AbstractDemo;

public class Mysql extends MainDatabase {
	public void Add() {
		System.out.println("Mysql veritabanına eklendi");
	}
	public void Remove() {
		System.out.println("Mysql veritabanından silindi");	
	}
	public void Update() {
		System.out.println("Mysql veritabanında güncellendi");
	}
	public void Get() {
		System.out.println("Mysql veritabanından getirlildi");
	}

}
