package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Romance;

@RestController
@RequestMapping(value="/romance")
public class RomanceController {

	@GetMapping(value="/getAll")
	public List<Romance> getAll(){
		List<Romance> list = new ArrayList<>();
		list.add(new Romance(1, "something with a frog", true));
		list.add(new Romance(2, "Robert&Shortcuts", true));
		list.add(new Romance(3, "Loving Spring", false));
		list.add(new Romance(4, "There's a spring in my boot", true));
		return list;
	}
}
