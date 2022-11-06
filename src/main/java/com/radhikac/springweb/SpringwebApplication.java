package com.radhikac.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebApplication.class, args);
		String baseurl = "%s/vmc/api/operator/%s";
        String url = String.format(baseurl, "stg-int","vrt/rollout");
        System.out.println(url);
	}

}
