package com.miracle.bean;

import java.io.Serializable;

public class TurnipBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int vendorId;
	public int customerId;
	public int accountId;
	public int tierID;
	public int requirementId;
	public String requirementSkillSet;
	public String requirementName;
	public int projectId;
	public int noOfResources;
	public String customerName;
	public String vendorName;
	public String status;
	public String accountName;
	
	
	public int getCustomerId() {
		return customerId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getAccountId() {
		System.out.println("getAccountId"+accountId);
		return accountId;
	}

	public void setAccountId(int accountId) {
		
		this.accountId = accountId;
	}

	public int getTierID() {
		return tierID;
	}

	public void setTierID(int tierID) {
		this.tierID = tierID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	
	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public int getRequirementId() {
		return requirementId;
	}

	public String getRequirementSkillSet() {
		return requirementSkillSet;
	}

	public String getRequirementName() {
		return requirementName;
	}

	public int getProjectId() {
		return projectId;
	}

	public int getNoOfResources() {
		return noOfResources;
	}

	public void setRequirementId(int requirementId) {
		this.requirementId = requirementId;
	}

	public void setRequirementSkillSet(String requirementSkillSet) {
		this.requirementSkillSet = requirementSkillSet;
	}

	public void setRequirementName(String requirementName) {
		this.requirementName = requirementName;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}
	

}
