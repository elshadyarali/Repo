package com.mumsched.cs.services;

import java.util.List;

import com.mumsched.cs.domains.Block;
import com.mumsched.cs.domains.Entry;

public interface EntryService {
	 void createNewEntry(Entry entry);
		Entry getEntry(Long id);
		List<Entry> getAllEntrys();
		void updateEntry(Entry entry);
		void deleteEntry(Long id);
		 List<Block> getBlocks(Long id);
}
