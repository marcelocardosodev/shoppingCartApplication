package com.erica.model.service;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.erica.model.Seller;
import com.erica.model.dto.SellerDto;

public interface SellerService {

	public SellerDto save(Seller seller);
	
	public SellerDto get(Long id) throws Exception;
	
	public SellerDto getSellerSellerAccount(String account);
	
	public List< SellerDto> getAll() throws Exception;
	
	public void deleteById(Long id);
}
