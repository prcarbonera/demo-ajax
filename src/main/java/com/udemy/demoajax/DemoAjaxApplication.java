package com.udemy.demoajax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.udemy.demoajax.domain.SocialMetaTag;
import com.udemy.demoajax.service.SocialMetaTagService;

@SpringBootApplication
public class DemoAjaxApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoAjaxApplication.class, args);
	}

	@Autowired
	SocialMetaTagService service;
	
	@Override
	public void run(String... args) throws Exception {
//		String url = "https://pt.aliexpress.com/item/32658267340.html?spm=a2g01.12617084.fdpcl001.1.437dIxFVIxFVPx&gps-id=5547572&scm=1007.19201.130907.0&scm_id=1007.19201.130907.0&scm-url=1007.19201.130907.0&pvid=ba0ab730-4740-4283-a763-a13858757abb";
//		String url = "https://www.udemy.com/course/the-story-course/";
//		SocialMetaTag tag = service.getSocialMetaTagByUrl(url);
//		System.out.println(tag);
		
	}

}
