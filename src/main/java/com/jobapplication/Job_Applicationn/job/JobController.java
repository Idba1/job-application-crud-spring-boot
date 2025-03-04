package com.jobapplication.Job_Applicationn.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class JobController {
    //    private List<Job> jobs = new ArrayList<>();
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findAll() {
        return jobService.findAll();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return "job added successfully!";
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable Long id) {
        Job job = jobService.getJobById(id);
        if (job != null) {
            return job;
        }
        return new Job(1L, "Test Job", "Test Job", "50005", "4545", "Paris");
    }
}