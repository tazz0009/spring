package com.tazz009.jpa;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "Student")
@Table(name = "student", uniqueConstraints = {
		@UniqueConstraint(name = "student_email_unique", columnNames = "email") })
public class Student {

	@Id
	@SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
	@Column(name = "id", updatable = false)
	private Long id;
	@Column(name = "first_name", nullable = false, columnDefinition = "varchar(255)")
	private String firstName;
	@Column(name = "last_name", nullable = false, columnDefinition = "varchar(255)")
	private String lastName;
	@Column(name = "email", nullable = false, columnDefinition = "varchar(255)")
	private String email;
	@Column(name = "age", columnDefinition = "int(3)")
	private Integer age;
	@Column(name = "reg_date", nullable = false)
	private LocalDateTime regDate;
	@Column(name = "up_date", nullable = false)
	private LocalDateTime upDate;

	public Student() {
	}

	public Student(Long id, String firstName, String lastName, String email, Integer age, LocalDateTime regDate,
			LocalDateTime upDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.regDate = regDate;
		this.upDate = upDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public LocalDateTime getUpDate() {
		return upDate;
	}

	public void setUpDate(LocalDateTime upDate) {
		this.upDate = upDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + ", regDate=" + regDate + ", upDate=" + upDate + "]";
	}

}
