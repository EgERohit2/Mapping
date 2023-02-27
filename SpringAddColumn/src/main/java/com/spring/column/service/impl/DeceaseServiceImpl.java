package com.spring.column.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.spring.column.entities.Decease;
import com.spring.column.repository.DeceaseRepository;
import com.spring.column.service.DeceaseService;

@Service
public class DeceaseServiceImpl implements DeceaseService {

	@Autowired
	private DeceaseRepository deceaseRepository;

	@Override
	public List<Decease> getAll() {
		// TODO Auto-generated method stub
		return deceaseRepository.findAll();
	}

	@Override
	public Decease postData(Decease decease) {
		// TODO Auto-generated method stub
		Decease decease2 = new Decease();
		decease2.setName(decease.getName());
		decease2.setSymptoms(decease.getSymptoms());
		// decease2.setAddColumn(new HashSet<>(decease.getAddColumn()));
		return this.deceaseRepository.save(decease2);
	}

	@Override
	public void updateData(Decease decease, int id) {
		// TODO Auto-generated method stub
		Decease d = deceaseRepository.findById(id).orElseThrow();
		d.setName(decease.getName());
		d.setSymptoms(decease.getSymptoms());
		this.deceaseRepository.save(d);

	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		this.deceaseRepository.deleteById(id);

	}

	@Override
	public Decease getById(int id) {
		// TODO Auto-generated method stub
		return this.deceaseRepository.findById(id).orElseThrow();
	}

	@Override
	public List<Decease> getAllPagination(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(pageNumber -1, pageSize);
		Page page = deceaseRepository.findAll(pageable);
		return page.getContent();
	}

}
