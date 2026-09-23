package com.daksh.hibernate_demo.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "certificates")
public class Certificates{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
    private Student student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}