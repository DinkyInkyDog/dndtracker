package com.dinkyinkydog.entity;

import java.util.HashSet;
import java.util.Set;

import com.dinkyinkydog.entity.Character.Classes;

public class Magic {
	Set<SpellSlot> level1 = new HashSet<>();
	
	
	
	public Magic(int level, Classes _class) {
		
	}
	
	
	public class SpellSlot {
		private int level;
		private boolean active;
	}
}
