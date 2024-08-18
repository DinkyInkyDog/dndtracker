package com.dinkyinkydog.entity;

public class Health {
	private int maxHealth;
	private int currentHealth;
	
	
	
	public void heal(int points) {
		if(currentHealth + points > maxHealth) {
			setCurrentHealth(maxHealth);
		} else {
			setCurrentHealth(currentHealth + points);
		}
	}
	
	public void takeDamage(int points) {
		if(currentHealth - points < 0 ) {
			setCurrentHealth(0);
		} else {
			setCurrentHealth(currentHealth - points);
		}
	}
	
	public void fullHealth() {
		setCurrentHealth(maxHealth);
	}
	
	public void instantKill() {
		setCurrentHealth(0);
	}
	
	
	public Health() {
		
	}
	
	public Health(int maxHealth) {
		setMaxHealth(maxHealth);
		setCurrentHealth(maxHealth);
	}
	
	public Health(int maxHealth, int currentHealth) {
		setMaxHealth(maxHealth);
		setCurrentHealth(currentHealth);
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}
	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	public int getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}
	
	
	
}
