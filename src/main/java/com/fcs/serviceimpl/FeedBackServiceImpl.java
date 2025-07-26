package com.fcs.serviceimpl;

import com.fcs.entity.FeedBack;
import com.fcs.repository.FeedBackRepository;
import com.fcs.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedBackServiceImpl implements FeedBackService {

    @Autowired
    private FeedBackRepository feedBackRepository;

    @Override
    public FeedBack addFeedBack(FeedBack feedBack) {
        return feedBackRepository.save(feedBack);
    }

    @Override
    public FeedBack updateFeedbackReviewByFeedbackId(FeedBack feedback, int feedbackId) {
        FeedBack feedback1 = feedBackRepository.findById(feedbackId).get();
        feedback1.setReviewed(true);
        return feedBackRepository.save(feedback1);
    }
}
