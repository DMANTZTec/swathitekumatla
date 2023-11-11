package worldStates;

public class States {
	private String name;
	private String city1;
	private String city2;
	private int no_districts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity1() {
		return city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getCity2() {
		return city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	public void setNo_districts(int no_districts) {
		this.no_districts = no_districts;
	}

	@Override
	public String toString() {
		return "States= [city1=" + city1 + ", city2=" + city2 + ", no_districts=" + no_districts + "]";
	}

}