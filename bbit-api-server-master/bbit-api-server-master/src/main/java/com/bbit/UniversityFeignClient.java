//package com.bbit;
//
//import com.bbit.models.Job;
//import org.springframework.cloud.netflix.feign.FeignClient;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.util.List;
//
//@FeignClient(name = "testing" , url = "https://www.fuzu.com/api/")
//public interface UniversityFeignClient {
//    @RequestMapping(method = RequestMethod.GET, value = "/all_jobs_ordered")
//    List<Job> getAllJobs();
//}
