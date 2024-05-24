package com.FinalCodeGravityProject.dataLayer;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
	@Table(name="Employee")
	public class UserEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "employeeId")
	    Long employee_id;
			
		@Column(name="firstName", nullable=false) 
		String first_name;
		
		@Column(name="lastName", nullable=false)
		String last_name;
		
		@Column(name = "dateOfBirth", nullable=false)
	     Date date_of_birth;
	    
	    @Column(name = "last4ssn", nullable=false, length =4, unique=true)
	    String last_4_ssn;
	    
	    public User() {
	    }

	    public User(String firstName, String lastName, Date dateOfBirth, String last4Ssn) {
	        this.firstName = first_name;
	        this.lastName = last_name;
	        this.dateOfBirth = date_of_birth;
	        this.last4Ssn = last_4_ssn;
	    }

	    public Long getEmployeeId() {
			return employeeId;
		}

        public void setEmployeeId(Long employeeId) {
			this.employeeId = employeeId;
		}

        public String getFirstName() {
			return firstName;
		}

        public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

        public String getLastName() {
			return lastName;
		}

        public void setLastName(String lastName) {
			this.lastName = lastName;
		}

        public Date getDateOfBirth() {
			return dateOfBirth;
		}


        public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}


        public String getLast4Ssn() {
			return last4Ssn;
		}

        public void setLast4Ssn(String last4Ssn) {
			this.last4Ssn = last4Ssn;
		}



		
}