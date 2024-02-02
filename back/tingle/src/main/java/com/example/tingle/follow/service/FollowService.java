package com.example.tingle.follow.service;

import com.example.tingle.follow.dto.request.FollowReadRequest;
import com.example.tingle.follow.entity.FollowEntity;
import com.example.tingle.star.dto.request.ReadStarRequest;

import java.util.ArrayList;

public interface FollowService {

    ArrayList<FollowReadRequest> getFollowList(Long userId) throws Exception;

    FollowEntity insertFollow(Long userId, Long starId) throws Exception;

    boolean deleteFollow(Long userId, Long starId) throws Exception;

    ReadStarRequest getFollow(Long starId);
}
