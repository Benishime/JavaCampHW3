package Overriding;

public class Console {

	public static void main(String[] args) {
		BaseKrediManager[] krediler =new BaseKrediManager[] 
				{new TarımKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};
		for(BaseKrediManager kredi : krediler) {
			System.out.println(kredi.hesapla(1000));
		}
	}

}
