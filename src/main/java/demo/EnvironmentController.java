package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EnvironmentController {

	@Value("${aaa}") 
	String thing = "nothing set";
	
	
	@RequestMapping("/env")
	public @ResponseBody String env() {
		return thing;
	}
}
