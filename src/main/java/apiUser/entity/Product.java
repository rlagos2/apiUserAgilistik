package apiUser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@Column(name = "id")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@GeneratedValue( strategy = GenerationType.IDENTITY,generator = "uuid" )
	private String id;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "size")
	private String size;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "principalImage")
	private String principalImage;
	
	@Column(name = "otherImage")
	private String otherImage;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPrincipalImage() {
		return principalImage;
	}

	public void setPrincipalImage(String principalImage) {
		this.principalImage = principalImage;
	}

	public String getOtherImage() {
		return otherImage;
	}

	public void setOtherImage(String otherImage) {
		this.otherImage = otherImage;
	}

}
