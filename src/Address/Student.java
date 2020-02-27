package Address;

import java.util.ArrayList;
import java.util.List;

public class Student {
private int Student_id;
private String Student_Name;
List<Address> ad=new ArrayList();

public int getStudent_id() {
	return Student_id;
}
public void setStudent_id(int student_id) {
	Student_id = student_id;
}
public String getStudent_Name() {
	return Student_Name;
}
public void setStudent_Name(String student_Name) {
	Student_Name = student_Name;
}
public List<Address> getAd() {
	return ad;
}
public void setAd(List<Address> ad) {
	this.ad = ad;
}



}
