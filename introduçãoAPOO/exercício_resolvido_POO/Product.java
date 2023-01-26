package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//agora quando eu printar no main algum objeto da classe Product, ele sai isso!
	//String.format serve para colocar as duas casas decimais no preco
	public String toString() {
		return " " + name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", TotalValueInStock());
	}
}
