package com.daksh.curd_application.entities;
import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name="order_Items")
public class OrderItem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@Column
	private int quantity;
	private LocalDate orderDate;
	
	@ManyToOne
	@JoinColumn(name="customer_Id")
	private Customer customer;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne
	@JoinColumn(name="product_Id")
	private Product product;
}
