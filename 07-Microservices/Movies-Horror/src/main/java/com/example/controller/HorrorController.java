package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Horror;

/*
 * We can replace @Controller and @ResponseBody by fuuuu-sion-hah!=
 * 											@RestController!!!
 */

//@Controller
//@ResponseBody
@RestController
@RequestMapping(value="/horror")
public class HorrorController {
	
	List<Horror> list;
	public HorrorController(){
		list = new ArrayList<>();
		list.add(new Horror(1, "massaka", 4));
		list.add(new Horror(2, "QC", -1));
		list.add(new Horror(3, "bills", 3));
		list.add(new Horror(4, "panel-camel", 4));
	}

	@GetMapping(value="/getAll")
	public /*@ResponseBody*/ List<Horror> getAll(){
		return list;
	}
	@GetMapping(value="/title/{title}")
	public Horror getByTitle(@PathVariable("title") String title) {
		for(Horror h : list) {
			if(h.getTitle().equals(title)) {
				return h;
			}
		}
		return null;
	}
}
