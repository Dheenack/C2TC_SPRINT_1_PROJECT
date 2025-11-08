package com.tnsif.ifet.shop_owner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.ifet.shop_owner.entity.ShopOwner;
import com.tnsif.ifet.shop_owner.service.ShopOwnerService;

import jakarta.persistence.NoResultException;

@RestController
public class ShopOwnerController {
		
	@Autowired
	private ShopOwnerService sos;
	
	@GetMapping("/")
	public String send() {
		return "hello, welcome to Dheena Krishna's Shop module";
	}
	@GetMapping("/shopownerservice")
	public List<ShopOwner> list(){
		return sos.listAll();
	}
	
	@PostMapping("/shopownerservice")
	public ResponseEntity<ShopOwner> add(@RequestBody ShopOwner so1) {
	    sos.save(so1);
	    return new ResponseEntity<>(so1, HttpStatus.CREATED);
	}

	
	@GetMapping("/shopownerservice/{id}")
	public ResponseEntity<ShopOwner> get(@PathVariable Integer id){
		try {
			ShopOwner so1 = sos.get(id);
			return new ResponseEntity<ShopOwner>(so1,HttpStatus.OK);
		}
		catch(NoResultException error) {
			return new ResponseEntity<ShopOwner>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/shopownerservice/{id}")
	public void delete(@PathVariable Integer id) {
		sos.delete(id);
	}
	
	@PutMapping("/shopownerservice/{id}")
	public ResponseEntity<ShopOwner> update(@PathVariable Integer id, @RequestBody ShopOwner so1){
		try {
			ShopOwner exist_so = sos.get(id);
			exist_so.setShopOwnerName(so1.getShopOwnerName());
			exist_so.setShopLocation(so1.getShopLocation());
			exist_so.setShopOwnerGender(so1.getShopOwnerGender());
			exist_so.setShopName(so1.getShopName());
			exist_so.setShopType(so1.getShopType());
			sos.update(exist_so);
			
			return new ResponseEntity<ShopOwner>(exist_so,HttpStatus.OK);
		}
		catch(NoResultException e) {
			return new ResponseEntity<ShopOwner>(HttpStatus.NOT_FOUND);
		}
	}
}
