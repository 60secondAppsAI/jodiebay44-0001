package com.jodiebay44.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.jodiebay44.domain.Feedback;
import com.jodiebay44.dto.FeedbackDTO;
import com.jodiebay44.dto.FeedbackSearchDTO;
import com.jodiebay44.dto.FeedbackPageDTO;
import com.jodiebay44.dto.FeedbackConvertCriteriaDTO;
import com.jodiebay44.service.GenericService;
import com.jodiebay44.dto.common.RequestDTO;
import com.jodiebay44.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface FeedbackService extends GenericService<Feedback, Integer> {

	List<Feedback> findAll();

	ResultDTO addFeedback(FeedbackDTO feedbackDTO, RequestDTO requestDTO);

	ResultDTO updateFeedback(FeedbackDTO feedbackDTO, RequestDTO requestDTO);

    Page<Feedback> getAllFeedbacks(Pageable pageable);

    Page<Feedback> getAllFeedbacks(Specification<Feedback> spec, Pageable pageable);

	ResponseEntity<FeedbackPageDTO> getFeedbacks(FeedbackSearchDTO feedbackSearchDTO);
	
	List<FeedbackDTO> convertFeedbacksToFeedbackDTOs(List<Feedback> feedbacks, FeedbackConvertCriteriaDTO convertCriteria);

	FeedbackDTO getFeedbackDTOById(Integer feedbackId);







}





