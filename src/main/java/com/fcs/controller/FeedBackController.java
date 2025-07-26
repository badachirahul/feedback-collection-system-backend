package com.fcs.controller;

import com.fcs.entity.FeedBack;
import com.fcs.service.FeedBackService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//This class handles HTTP requests related to feedbacks
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/feedbacks") //Base URL path for all feedback-related endpoints
public class FeedBackController {

    //Injecting the FeedBackService to handle business logic
    @Autowired
    private FeedBackService feedBackService;

    //Endpoint to handle POST requests for adding a new feedback
    @PostMapping
    public ResponseEntity<FeedBack> addFeedback(@Valid @RequestBody FeedBack feedBack) {
        //Call the service layer to save the feedback
        FeedBack fb = feedBackService.addFeedBack(feedBack);

        //Return the saved feedback with HTTP status Created(201)
        return new ResponseEntity<FeedBack>(fb, HttpStatus.CREATED);
    }

    @PutMapping("/{feedbackid}")
    public ResponseEntity<FeedBack> updateFeedbackReviewByFeedbackId(@Valid @RequestBody FeedBack feedBack, @PathVariable("feedbackid") int feedbackId) {
        //Call the service layer to save the feedback
        FeedBack fb = feedBackService.updateFeedbackReviewByFeedbackId(feedBack,feedbackId);

        //Return the saved feedback with HTTP status Created(201)
        return new ResponseEntity<FeedBack>(fb, HttpStatus.OK);
    }
}
