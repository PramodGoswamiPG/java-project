package learninglist;

public class Pen {
	String name;
	String color;
	Double Price;
	public Pen(String name, String color, Double price) {
		super();
		this.name = name;
		this.color = color;
		Price = price;
	}
	@Override
	public String toString() {
		return "Pen [name=" + name + ", color=" + color + ", Price=" + Price + "]";
	}
	
	

}
