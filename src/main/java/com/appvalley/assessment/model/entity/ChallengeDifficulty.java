package com.appvalley.assessment.model.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ChallengeDifficulty implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@OneToMany(mappedBy = "challengeDifficulty", cascade = CascadeType.ALL)
	private Set<CardioChallenge> cardioChallenge;
	
	public ChallengeDifficulty() {
		super();
	}
	
	public ChallengeDifficulty(Integer challengeId) {
		super();
		this.id = challengeId;
	}

	public ChallengeDifficulty(Integer id, String name, Set<CardioChallenge> cardioChallenge) {
		super();
		this.id = id;
		this.name = name;
		this.cardioChallenge = cardioChallenge;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<CardioChallenge> getCardioChallenge() {
		return cardioChallenge;
	}

	public void setCardioChallenge(Set<CardioChallenge> cardioChallenge) {
		this.cardioChallenge = cardioChallenge;
	}
	
	
	
}
