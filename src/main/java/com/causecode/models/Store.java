package com.causecode.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.causecode.utils.Audited;


@Entity
@Table(name="stores")
public class Store implements Audited{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id = null;
	private String name;
	private String owner;
	private String type;
	private String address;
	private Date createdDate;
	private Date updatedDate;
	private Boolean status = true; 
	
	private Double latitude;
	private Double longitude;
	
	
	public Store(){
		
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}




	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", owner=" + owner + ", type=" + type + ", address=" + address
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", status=" + status + ", latitude="
				+ latitude + ", longitude=" + longitude + "]";
	}

	public Store(Long id, String name, String owner, String type, String address, Date createdDate, Date updatedDate,
			Boolean status, Double latitude, Double longitude) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.address = address;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.status = status;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Date getUpdatedDate() {
		return this.updatedDate;
	}


	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public Double getLatitude() {
		return latitude;
	}


	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}


	public Double getLongitude() {
		return longitude;
	}


	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	
	
	
	
	
}
