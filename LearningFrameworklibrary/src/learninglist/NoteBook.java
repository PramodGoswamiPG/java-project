package learninglist;

public class NoteBook {
	String brand;
	int page;
	double Price;
	public NoteBook(String notebookname, int page, double price) {
		super();
		this.brand = brand;
		this.page = page;
		Price = price;
	}
	@Override
	public String toString() {
		return "NoteBook [brand=" + brand + ", page=" + page + ", Price=" + Price + "]";
	}
	
	

}
