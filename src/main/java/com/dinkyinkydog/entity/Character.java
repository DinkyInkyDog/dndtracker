package com.dinkyinkydog.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Character {
	public enum Classes {
		DRUID, CLERIC, BARD, BARBARIAN, FIGHTER, PALADIN, ROGUE, MONK, RANGER, SORCERER, WARLOCK, WIZARD, UNDEFINED
	}
	
	private int maxHealth;
	private int savedCurrentHealth;
	private String _class;
	
	public Classes get_class() {
		switch(_class) {
		case "druid":
			return Classes.DRUID;
			
		case "cleric":
			return Classes.CLERIC;
			
		case "barbarian":
			return Classes.BARBARIAN;
			
		case "bard":
			return Classes.BARD;
			
		case "fighter":
			return Classes.FIGHTER;
			
		case "paladin":
			return Classes.PALADIN;
			
		case "rogue":
			return Classes.ROGUE;
			
		case "monk":
			return Classes.MONK;
			
		case "ranger":
			return Classes.RANGER;
			
		case "sorcerer":
			return Classes.SORCERER;
			
		case "warlock":
			return Classes.WARLOCK;
			
		case "wizard":
			return Classes.WIZARD;
			
		default:
			return Classes.UNDEFINED;
		}
	}

	
}
