package com.dinkyinkydog.entity;

public class DeathSaves {
	private int fail;
	private int succeed;
	private boolean playerdead;
	private boolean playerup;
	
	public DeathSaves() {
		reset();
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
	
	public void reset() {
		setFail(0);
		setSucceed(0);
		setPlayerdead(false);
		setPlayerup(false);
	}
	
	
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
}
