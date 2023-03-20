package com.springmvcdemo;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="is Required")
	@Size(min=1,message="is Required")
	private String LastName;
	
	@Min(value=0,message="Value must be greater than or equal to zero")
	@Max(value=10,message="Value must be less than or equal to ten")
	private int freePasses;
	
	@Pattern(regexp="^[a-zA-z0-9] {5}", message="only 5 chars/digits allowed")
	private String postalCode;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
