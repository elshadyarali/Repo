package com.mumsched.cs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumsched.cs.Repository.BlockDao;
import com.mumsched.cs.domains.Block;
import com.mumsched.cs.domains.Entry;
@Service
public class BlockServiceImpl implements BlockService{
	 @Autowired
		BlockDao dao;
		@Override
		public void createNewBlock(Block block) {

	   dao.save(block);
			
		}

		@Override
		public Block getBlock(Long id) {

	        return  dao.findOne(id);


		}
		
		@Override
		public Entry getEntry(Long id) {

	        return  dao.findOne(id).getEntry();


		}

		@Override
		public List<Block> getAllBlocks() {
			
			return dao.findAll();
		}

		@Override
		public void updateBlock(Block block) {
			
			dao.save(block);
		}

		@Override
		public void deleteBlock(Long id) {
			
			dao.delete(id);
		}

		
	
}
