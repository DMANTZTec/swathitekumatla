package arrayList;

public class Customers {
    private int accNo;
	 private String name;
	 private float amount;
	 
	 public int getAccNo() 
	 {
	 	return accNo;
	 }

	 public void setAccNo(int accNo) {
	 	this.accNo = accNo;
	 }

	 public String getName() {
	 	return name;
	 }

	 public void setName(String name) 
	 {
	 	this.name = name;
	 }

	 public float getAmount() 
	 {
	 	return amount;
	 }

	 public void setAmount(float amount) 
	 {
	 	this.amount = amount;
	 }

	@Override
	public String toString() {
		return " [accNo=" + accNo + ", name=" + name + ", amount=" + amount + "]";
	}
	
}
