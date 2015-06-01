package com.apress.repository;

import org.springframework.data.repository.CrudRepository;

import com.apress.domain.Option;

public interface OptionRepository extends CrudRepository<Option, Long> {

}
