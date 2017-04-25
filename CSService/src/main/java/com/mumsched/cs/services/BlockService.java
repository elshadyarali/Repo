package com.mumsched.cs.services;

import java.util.List;

import com.mumsched.cs.domains.Block;
import com.mumsched.cs.domains.Entry;

public interface BlockService {
    void createNewBlock(Block block);
	Block getBlock(Long id);
	List<Block> getAllBlocks();
	void updateBlock(Block block);
	void deleteBlock(Long id);
	Entry getEntry(Long id);
}
