package com.pradeip.curiosity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "tbl_profile")
public class Profile {

	@Id
	@Column(name = "CONNECTOR_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	@Size(min = 3, max = 50)
	@Column(name = "NAME", nullable = false)
	private String fName = null;
	@Column(name = "LNAME", nullable = false)
	private String lName = null;
	@Column(name = "PROFILENUMBER", nullable = false, unique = true)
	private Long profileNumber = null;

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(String fName, String lName, Long profileNumber) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.profileNumber = profileNumber;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Long getProfileNumber() {
		return profileNumber;
	}

	public void setProfileNumber(Long profileNumber) {
		this.profileNumber = profileNumber;
	}

	@Override
	public String toString() {
		return "Profile [fName=" + fName + ", lName=" + lName
				+ ", profileNumber=" + profileNumber + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
