package com.daksh.curd_application.entities;
import jakarta.persistence.*;
import java.util.*;
@Entity
@Table(name="customers")
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String phone;
	@OneToMany(mappedBy = "customer",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
	private List<OrderItem> orders = new ArrayList<>();
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<OrderItem> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderItem> orders) {
		this.orders = orders;
	}
}
