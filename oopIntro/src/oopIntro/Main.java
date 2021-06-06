package oopIntro;

//snipped kullanýmý sys + ctrl + space

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram", 10); // Ornek , referans , instance olusturma

			
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Hp 3H821EA");
		product2.setDetail("Laptop");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Icecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		

	};

}