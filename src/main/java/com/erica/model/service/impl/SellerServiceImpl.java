package com.erica.model.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.erica.model.Seller;
import com.erica.model.dto.SellerDto;
import com.erica.model.service.SellerService;
import com.erica.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService {
	
	
	@Autowired
	SellerRepository repository;
	
	@Override
	public SellerDto save(Seller seller) {
		
		var sellerSaved = repository.save(seller);
		
		SellerDto sellerDto = new SellerDto();
		
		return sellerDto.transformToDtop(sellerSaved);
	}

	@Override
	public SellerDto get(Long id) throws Exception{
		
		Optional<Seller> seller = repository.findById(id);
		
		if(seller == null) {
			throw new NotFoundException();
		}
		
		SellerDto sellerDto = new SellerDto();
		
		return sellerDto.transformToDtop(seller.get());
	}

	@Override
	public SellerDto getSellerSellerAccount(String account) {
		
		var seller = repository.findBySellerAccount(account);
		
		SellerDto sellerDto = new SellerDto();
		
		return sellerDto.transformToDtop(seller);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<SellerDto> getAll() throws Exception{
		
		List<Seller> listSeller = repository.findAll();
		
		if(listSeller.isEmpty()) {
			throw new NotFoundException();
		}
		List<SellerDto> listReturn = new ArrayList<>();
		
		
		for (Seller seller : listSeller) {
			SellerDto dto = new SellerDto();
			
			listReturn.add(dto.transformToDtop(seller));
		}
		return listReturn;
	}
	
	
	
	

}
