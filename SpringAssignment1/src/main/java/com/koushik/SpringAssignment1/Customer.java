package com.koushik.SpringAssignment1;

public class Customer 
{
	public int customerId;
	public String customerName;
	public long customerContact;
	public Address customerAddress;
	public Customer(int customerId, String customerName, long customerContact,
			Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + ", customerContact=" + customerContact
				+ ", customerAddress=" + customerAddress + "]";
	}
}
