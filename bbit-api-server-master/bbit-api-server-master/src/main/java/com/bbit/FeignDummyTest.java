//package com.bbit;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class FeignDummyTest implements CommandLineRunner {
//
//    private final UniversityFeignClient feignClient;
//
//    public FeignDummyTest(UniversityFeignClient feignClient) {
//        this.feignClient = feignClient;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        feignClient.getAllJobs().forEach(job -> {
//            System.out.println(job.getTitle());
//        });
//    }
//}
