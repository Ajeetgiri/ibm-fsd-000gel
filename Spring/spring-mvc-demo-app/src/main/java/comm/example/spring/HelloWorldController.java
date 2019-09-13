package comm.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET,name="/StudentForm")
	public String showView() {
		return "Form";
		
	}
	@RequestMapping(method = RequestMethod.POST,name="/displayDetail")
	public String ViewDetail() {
		return "Detail";
		
	}

}
