package queues;

public class CollegeStudentsData {
private int admissionNo;
private String name;
private String branch;
public int getAdmissionNo() {
	return admissionNo;
}
public void setAdmissionNo(int admissionNo) {
	this.admissionNo = admissionNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
@Override
public String toString() {
	return "[admissionNo=" + admissionNo + ", name=" + name + ", branch=" + branch + "]";
}
}

