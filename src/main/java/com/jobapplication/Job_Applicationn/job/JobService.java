package com.jobapplication.Job_Applicationn.job;

import java.util.List;

public interface JobService
{
    List<Job>findAll();
    void createJob(Job job);
}
