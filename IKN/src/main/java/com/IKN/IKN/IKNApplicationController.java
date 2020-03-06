package com.IKN.IKN;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Controller
@EnableAutoConfiguration
public class IKNApplicationController
{
	@RequestMapping("/")
	//@ResponseBody
	public String index()
	{
		return "hello";
	}
}