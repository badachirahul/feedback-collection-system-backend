package com.fcs.serviceimpl;

import com.fcs.entity.FeedBack;
import com.fcs.repository.FeedBackRepository;
import com.fcs.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private FeedBackRepository feedBackRepository;

    @Override
    public List<FeedBack> getAllFeedBack() {
        return feedBackRepository.findAll();
    }
}
