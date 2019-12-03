package com.beans;

public class Form {
 String name ,lname,cnno,mailid,date,city;

public Form(String name, String lname, String cnno, String mailid, String date, String city) {
	super();
	this.name = name;
	this.lname = lname;
	this.cnno = cnno;
	this.mailid = mailid;
	this.date = date;
	this.city = city;
}

@Override
public String toString() {
	return "Form [name=" + name + ", lname=" + lname + ", cnno=" + cnno + ", mailid=" + mailid + ", date=" + date
			+ ", city=" + city + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getCnno() {
	return cnno;
}

public void setCnno(String cnno) {
	this.cnno = cnno;
}

public String getMailid() {
	return mailid;
}

public void setMailid(String mailid) {
	this.mailid = mailid;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Form() {
	super();
}
}
