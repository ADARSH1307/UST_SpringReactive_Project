package com.ust.Spring_Reactive.repository;

import com.ust.Spring_Reactive.dto.Tripdto;
import com.ust.Spring_Reactive.entity.Trip;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface Triprepo extends ReactiveMongoRepository<Trip,String> {

}
