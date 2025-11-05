package com.tnsif.ifet.shop_owner.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShopOwner {
	
	@Id
	@Column(name="so_id")
	private int shopOwnerId;
	@Column(name="so_name")
	private String shopOwnerName;
	@Column(name="s0_gender")
	private char shopOwnerGender;
	@Column(name="shop_name")
	private String shopName;
	@Column(name="so_number")
	private long shopOwnerNumber;
	@Column(name="shop_location")
	private String shopLocation;
	@Column(name="shop_type")
	private String shopType; // Retailer/ wholesale

	public ShopOwner(int shopOwnerId, String shopOwnerName, String shopName, String shopType) {
		super();
		this.shopOwnerId = shopOwnerId;
		this.shopOwnerName = shopOwnerName;
		this.shopName = shopName;
		this.shopType = shopType;
	}

	public ShopOwner(int shopOwnerId, String shopOwnerName, char shopOwnerGender, String shopName, long shopOwnerNumber,
			String shopLocation, String shopType) {
		super();
		this.shopOwnerId = shopOwnerId;
		this.shopOwnerName = shopOwnerName;
		this.shopOwnerGender = shopOwnerGender;
		this.shopName = shopName;
		this.shopOwnerNumber = shopOwnerNumber;
		this.shopLocation = shopLocation;
		this.shopType = shopType;
	}

	public int getShopOwnerId() {
		return shopOwnerId;
	}

	public void setShopOwnerId(int shopOwnerId) {
		this.shopOwnerId = shopOwnerId;
	}

	public String getShopOwnerName() {
		return shopOwnerName;
	}

	public void setShopOwnerName(String shopOwnerName) {
		this.shopOwnerName = shopOwnerName;
	}

	public char getShopOwnerGender() {
		return shopOwnerGender;
	}

	public void setShopOwnerGender(char shopOwnerGender) {
		this.shopOwnerGender = shopOwnerGender;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public long getShopOwnerNumber() {
		return shopOwnerNumber;
	}

	public void setShopOwnerNumber(long shopOwnerNumber) {
		this.shopOwnerNumber = shopOwnerNumber;
	}

	public String getShopLocation() {
		return shopLocation;
	}

	public void setShopLocation(String shopLocation) {
		this.shopLocation = shopLocation;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	@Override
	public String toString() {
		return "ShopOwner [shopOwnerId=" + shopOwnerId + ", shopOwnerName=" + shopOwnerName + ", shopOwnerGender="
				+ shopOwnerGender + ", shopName=" + shopName + ", shopOwnerNumber=" + shopOwnerNumber
				+ ", shopLocation=" + shopLocation + ", shopType=" + shopType + "]";
	}
	
	
}
