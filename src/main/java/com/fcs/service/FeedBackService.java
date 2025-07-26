package com.fcs.service;

import com.fcs.entity.FeedBack;

public interface FeedBackService {
    FeedBack addFeedBack(FeedBack feedBack);
    FeedBack updateFeedbackReviewByFeedbackId(FeedBack feedback, int feedbackId);
}
