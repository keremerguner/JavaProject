package oopIntro;

//constructor
//overloading

public class Product {
	public Product(){															//constructor olusturmak.
		System.out.println("Ben calistim !");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {		//overloading (biden fazla constructor olustruma)
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail= detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
