package com.appvalley.assessment.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.appvalley.assessment.model.entity.CardioChallenge;
import com.appvalley.assessment.model.entity.ChallengeDifficulty;
import com.appvalley.assessment.model.entity.repository.CardioChallengeRepository;
import com.appvalley.assessment.vm.CardioChallengeVM;

@Service
public class CardioChallengeService {

	private final CardioChallengeRepository cardioChallengeRepository;

	public CardioChallengeService(CardioChallengeRepository cardioChallengeRepository) {
		super();
		this.cardioChallengeRepository = cardioChallengeRepository;
	}

	public List<CardioChallengeVM> generateChallengeList(String title, Integer challengeId) {
		CardioChallenge cc = new CardioChallenge();
		cc.setTitle(title);
		cc.setChallengeDifficulty(new ChallengeDifficulty(challengeId));
		
		ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("title", match -> match.contains());
		Example<CardioChallenge> example = Example.of(cc, matcher);
		
		List<CardioChallenge> ccs = cardioChallengeRepository.findAll(example);
		return ccs.stream().map(challenge -> {
			return new CardioChallengeVM(challenge);
		}).collect(Collectors.toList());
	}
}
