package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	long pid;
	String pname;
	String pdetails;
	String ptxnno;
	String pstatus;
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdetails() {
		return pdetails;
	}
	public void setPdetails(String pdetails) {
		this.pdetails = pdetails;
	}
	public String getPtxnno() {
		return ptxnno;
	}
	public void setPtxnno(String ptxnno) {
		this.ptxnno = ptxnno;
	}
	public String getPstatus() {
		return pstatus;
	}
	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdetails=" + pdetails + ", ptxnno=" + ptxnno
				+ ", pstatus=" + pstatus + "]";
	}
	public Product(long pid, String pname, String pdetails, String ptxnno, String pstatus) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdetails = pdetails;
		this.ptxnno = ptxnno;
		this.pstatus = pstatus;
	}
	public Product() {
		super();
	}
	
	

}
