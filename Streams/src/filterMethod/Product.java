package filterMethod;

public class Product {
	private int id;
	private String name;
	private double price;
	private int weight;
	private double rating;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Product(int id, String name, double price,int weight, double rating) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.rating = rating;
	}

	@Override
	public String toString() 
	{
		return "[id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + ", rating=" + rating+ "]";
	}
	
	
}
