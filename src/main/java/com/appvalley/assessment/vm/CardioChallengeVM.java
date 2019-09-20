package com.appvalley.assessment.vm;

import com.appvalley.assessment.model.entity.CardioChallenge;

public class CardioChallengeVM {

	private String title;
	private Integer calorieBurnt;
	private Integer challengePoint;

	private Integer diffcultyId;
	private String difficulty;

	// No args constructor
	public CardioChallengeVM() {
	}

	public CardioChallengeVM(CardioChallenge cc) {
		super();
		this.title = cc.getTitle();
		this.calorieBurnt = cc.getCalorieBurnt();
		this.challengePoint = cc.getChallengePoint();
		this.diffcultyId = cc.getChallengeDifficulty().getId();
		this.difficulty = cc.getChallengeDifficulty().getName();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCalorieBurnt() {
		return calorieBurnt;
	}

	public void setCalorieBurnt(Integer calorieBurnt) {
		this.calorieBurnt = calorieBurnt;
	}

	public Integer getChallengePoint() {
		return challengePoint;
	}

	public void setChallengePoint(Integer challengePoint) {
		this.challengePoint = challengePoint;
	}

	public Integer getDiffcultyId() {
		return diffcultyId;
	}

	public void setDiffcultyId(Integer diffcultyId) {
		this.diffcultyId = diffcultyId;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

}
