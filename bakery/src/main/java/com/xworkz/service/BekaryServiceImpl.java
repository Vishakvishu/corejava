package com.xworkz.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.BakeryDTO;
import com.xworkz.repositery.BakeryRepositery;

@Service
public class BekaryServiceImpl implements BekaryService {
	@Autowired
	private BakeryRepositery repositery;

	public BekaryServiceImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("Created  validating and saving");
		boolean saved = this.repositery.saved(dto);
		System.out.println("Saved in repo" + saved);
		return false;
	}

}