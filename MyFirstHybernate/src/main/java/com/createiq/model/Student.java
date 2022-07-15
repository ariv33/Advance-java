package com.createiq.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@ Table (name="std_tab")
public class Student {
	@Id
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="sfee")
	private double sfee;

		public Student() {
			super();
		}
		public Student(int sid,String sname,double sfee) {
			super();
			
			this.sid=sid;
			this.sname=sname;
		    this.sfee=sfee;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public double getSfee() {
			return sfee;
		}
		public void setSfee(double sfee) {
			this.sfee = sfee;
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + "]";
		}
		
	
	
}
