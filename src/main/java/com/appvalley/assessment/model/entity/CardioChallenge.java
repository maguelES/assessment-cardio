package com.appvalley.assessment.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CardioChallenge implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String title;

	private Integer calorieBurnt;

	private Integer challengePoint;

	@ManyToOne
	@JoinColumn
	private ChallengeDifficulty challengeDifficulty;
	
	public CardioChallenge() {}

	public CardioChallenge(Integer id, String title, Integer calorieBurnt, Integer challengePoint) {
		super();
		this.id = id;
		this.title = title;
		this.calorieBurnt = calorieBurnt;
		this.challengePoint = challengePoint;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public ChallengeDifficulty getChallengeDifficulty() {
		return challengeDifficulty;
	}

	public void setChallengeDifficulty(ChallengeDifficulty challengeDifficulty) {
		this.challengeDifficulty = challengeDifficulty;
	}

}
