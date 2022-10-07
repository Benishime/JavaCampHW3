package StaticDemo;

public class ProductManager {
		public void add(Product product){
			if(ProductValidator.isValid(product)) {
				System.out.println(product.name+" ürünü eklendi");
			}
			else {
				System.out.println(product.name+" ürününün bilgileri geçersizdir.");
			}
			
		}

}
