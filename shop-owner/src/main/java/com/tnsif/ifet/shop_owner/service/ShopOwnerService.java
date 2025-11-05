package com.tnsif.ifet.shop_owner.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.ifet.shop_owner.entity.ShopOwner;
import com.tnsif.ifet.shop_owner.repository.ShopOwnerRepository;

@Service
public class ShopOwnerService {

	@Autowired
	private ShopOwnerRepository repo;
	
	public List<ShopOwner> listAll(){
		return repo.findAll();
	}
	
	public void save(ShopOwner so) {
		repo.save(so);
	}
	
	public ShopOwner get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer cid) {
		repo.deleteById(cid);
	}
	
	public void update(ShopOwner so) {
		repo.save(so);
	}
}
