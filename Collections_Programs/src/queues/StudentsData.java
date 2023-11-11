package queues;

public  class StudentsData implements Comparable<StudentsData>{
	private int rollNo;
	private String name;
	private int rank;
	private String college;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public int compareTo(StudentsData o) {
		// TODO Auto-generated method stub
		if(rank<o.rank)
			return -1;
		else if(rank>o.rank)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return " [rollNo=" + rollNo + ", name=" + name + ", rank=" + rank + ", college=" + college + "]";
	}
}
