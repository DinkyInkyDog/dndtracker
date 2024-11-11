package com.dinkyinkydog.entity;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JavaScript;

@JavaScript("./scripts/progress-bar-script.js")
@CssImport("./styles/myStyle.css")
public class Health {
	private int maxHealth;
	private int currentHealth;
	
	private int fail;
	private int succeed;
	private boolean playerdead;
	private boolean playerup;
	private boolean downed;
	
	
	public void heal(int points) {
		if(currentHealth + points > maxHealth) {
			setCurrentHealth(maxHealth);
			System.out.println("current health is now max: " + maxHealth);
			//UI.getCurrent().getPage().executeJs("setProgressHealth($0)", health.getCurrentHealth());
		} else {
			setCurrentHealth(currentHealth + points);
			System.out.println("current health is now " + currentHealth);
		}
	}
	
	public void takeDamage(int points) {
		if(currentHealth - points < 0 ) {
			setCurrentHealth(0);
		} else {
			setCurrentHealth(currentHealth - points);
		}
		
		if(currentHealth == 0) {
			setDowned(true);
		}
		
	}
	
	public void fullHealth() {
		setCurrentHealth(maxHealth);
	}
	
	public void instantKill() {
		setCurrentHealth(0);
	}
	
	
	public void fail() {
		setFail(fail + 1);
		if(fail >= 3) {
			setPlayerdead(true);
		}
	}
	
	public void succeed() {
		setSucceed(succeed + 1);
		if(succeed >= 3) {
			setPlayerup(true);
		}
	}
	
	public void resetDeathSave() {
		setFail(0);
		setSucceed(0);
		setPlayerdead(false);
		setPlayerup(false);
		setDowned(false);
	}
	
	
	public Health() {
		resetDeathSave();
	}

	public Health(int maxHealth) {
		setMaxHealth(maxHealth);
		setCurrentHealth(maxHealth);
		resetDeathSave();
	}

	public Health(int maxHealth, int currentHealth) {
		setMaxHealth(maxHealth);
		setCurrentHealth(currentHealth);
		resetDeathSave();
	}

	
	
	//--------------------getters and setters------------------------------
	public int getFail() {
		return fail;
	}
	public void setFail(int fail) {
		this.fail = fail;
	}
	public int getSucceed() {
		return succeed;
	}
	public void setSucceed(int succeed) {
		this.succeed = succeed;
	}

	public boolean isPlayerdead() {
		return playerdead;
	}

	public void setPlayerdead(boolean playerdead) {
		this.playerdead = playerdead;
	}

	public boolean isPlayerup() {
		return playerup;
	}

	public void setPlayerup(boolean playerup) {
		this.playerup = playerup;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
		UI.getCurrent().getPage().executeJs("setPlayerMaxHealth($0)", maxHealth);
		System.out.println("");
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
		UI.getCurrent().getPage().executeJs("setProgressHealth($0)", currentHealth);
	}

	public boolean isDowned() {
		return downed;
	}

	public void setDowned(boolean downed) {
		this.downed = downed;
	}
	
}
