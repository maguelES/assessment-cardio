package com.appvalley.assessment.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.appvalley.assessment.service.CardioChallengeService;
import com.appvalley.assessment.vm.CardioChallengeVM;

@RestController
@RequestMapping("/api/challenges")
public class CardioChallengeController {
	
	private static final Logger log = LoggerFactory.getLogger(CardioChallengeController.class);

	private CardioChallengeService cardioChallengeService;

	public CardioChallengeController(CardioChallengeService cardioChallengeService) {
		this.cardioChallengeService = cardioChallengeService;
	}

	@GetMapping("/cardio")
	@ResponseBody
	public List<CardioChallengeVM> search(
			@RequestParam(name = "title", required = false) String title,
			@RequestParam(name = "challengeId", required = false) Integer challengeId) {
		log.info("Title : {}", title);
		log.info("Challenge ID : {}", challengeId);
		if(!StringUtils.hasText(title)) title = null;
		return cardioChallengeService.generateChallengeList(title, challengeId);
	}

}
