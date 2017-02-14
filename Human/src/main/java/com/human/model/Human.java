package com.human.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Human")

// Model of human + validation 
public class Human {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Size(min=3, max=50)
	@Column(name = "name", nullable = false)
	private String name;
    
	@NotNull
    @Column(name = "age")
	private int age;
    
    @NotEmpty
    @Column(name = "surname")
	private String surname;
    
	// setters and getters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", age=" + age + ", surname=" + surname + "]";
	}	
}
