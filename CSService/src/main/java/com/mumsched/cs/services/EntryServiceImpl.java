package com.mumsched.cs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumsched.cs.Repository.EntryDao;
import com.mumsched.cs.domains.Block;
import com.mumsched.cs.domains.Entry;
@Service
public class EntryServiceImpl  implements EntryService{
	   @Autowired
		EntryDao dao;
		@Override
		public void createNewEntry(Entry entry) {

	   dao.save(entry);
			
		}

		@Override
		public Entry getEntry(Long id) {

	        return  dao.findOne(id);


		}
		
		@Override
		public List<Block> getBlocks(Long id) {

	        return  dao.findOne(id).getBlockList();


		}
		
		

		@Override
		public List<Entry> getAllEntrys() {
			
			return dao.findAll();
		}

		@Override
		public void updateEntry(Entry entry) {
			
			dao.save(entry);
		}

		@Override
		public void deleteEntry(Long id) {
			
			dao.delete(id);
		}

}
