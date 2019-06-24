package com.app.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
@Id
private String id;
private Integer eid;
private String eName;
private Double eSal;
public Student() {
	super();
}
public Student(Integer eid, String eName, Double eSal) {
	super();
	this.eid = eid;
	this.eName = eName;
	this.eSal = eSal;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public Double geteSal() {
	return eSal;
}
public void seteSal(Double eSal) {
	this.eSal = eSal;
}
@Override
public String toString() {
	return "Student [id=" + id + ", eid=" + eid + ", eName=" + eName + ", eSal=" + eSal + "]";
}

}
