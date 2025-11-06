package com.saarthix.jobs.controller;

import com.saarthix.jobs.model.Job;
import com.saarthix.jobs.repository.JobRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobRepository repo;

    public JobController(JobRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return repo.findAll();
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return repo.save(job);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable String id) {
        repo.deleteById(id);
    }
}
