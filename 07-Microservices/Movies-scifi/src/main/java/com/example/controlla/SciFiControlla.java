package com.example.controlla;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Horror;
import com.example.model.SciFi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/scifi")
public class SciFiControlla {
	
	private RestTemplate rest = new RestTemplate();
	
	List<SciFi> list;

	public SciFiControlla() {
		list = new ArrayList<>();
		list.add(new SciFi(1, "Promethius in SPACE!!!", true));
		list.add(new SciFi(2, "panel-camel", false));
		list.add(
				new SciFi(3, "I clicked I am a Robot on the captcha," + " now I live life not knowing who I am", true));
		list.add(new SciFi(4, "Fifty Shades of Dark corners as a child", false));
	}

	@GetMapping(value = "/getAll")
	public List<SciFi> getAll() {
		return list;
	}
	@GetMapping(value="getid/{id}")
	@HystrixCommand(fallbackMethod="fakeHorror")
	public SciFi getMovie(@PathVariable("id") int id) {
		SciFi movie=new SciFi();
		for(SciFi s : list) {
			if(s.getId()==id)
				movie=s;
		}
		Horror h =rest.getForObject("http://localhost:8765/horror-stuff/horror/title/"+movie.getTitle(),
				Horror.class);
		if(h==null) {
			return movie;
		} else {
			SciFi movie2 = new SciFi(movie.getId(), movie.getTitle(), movie.isCheap());
			movie2.setTitle(movie.getTitle()+" is also a horror movie");
			return movie2;
		}
	}
	public SciFi fakeHorror(int id) {
		return list.get(id-1);
	}
	
}
