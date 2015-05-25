package com.apress.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.apress.domain.Poll;

public interface PollRepository extends PagingAndSortingRepository<Poll, Long> {

}
