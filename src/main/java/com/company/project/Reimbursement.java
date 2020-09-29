package com.company.project;

public class Reimbursement {
	
	private int reimbid;
	private String username,reimtype,submitted,resolved,description,status;
	private double amount;
	public int getReimbid() {
		return reimbid;
	}
	public void setReimbid(int reimbid) {
		this.reimbid = reimbid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getReimtype() {
		return reimtype;
	}
	public void setReimtype(String reimtype) {
		this.reimtype = reimtype;
	}
	public String getSubmitted() {
		return submitted;
	}
	public void setSubmitted(String submitted) {
		this.submitted = submitted;
	}
	public String getResolved() {
		return resolved;
	}
	public void setResolved(String resolved) {
		this.resolved = resolved;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Reimbursement [reimbid=" + reimbid + ", username=" + username + ", reimtype=" + reimtype
				+ ", submitted=" + submitted + ", resolved=" + resolved + ", description=" + description + ", status="
				+ status + ", amount=" + amount + "]";
	}
	
	public Reimbursement(int reimbid, String username, String reimtype, String submitted, String resolved,
			String description, String status, double amount) {
		super();
		this.reimbid = reimbid;
		this.username = username;
		this.reimtype = reimtype;
		this.submitted = submitted;
		this.resolved = resolved;
		this.description = description;
		this.status = status;
		this.amount = amount;
	}
	
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
