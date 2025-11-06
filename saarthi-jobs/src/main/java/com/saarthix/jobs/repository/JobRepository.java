package com.saarthix.jobs.repository;

import com.saarthix.jobs.model.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<Job, String> {
}
