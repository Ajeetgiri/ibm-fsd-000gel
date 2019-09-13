package comm.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	
	@GetMapping("/")
	public String ViewForm(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "sForm";
		
	}
	@PostMapping("/processForm")
	public String ProcessPage(@ModelAttribute("student")Student student,Model model) {
		model.addAttribute("student",student);
		
		return "detail";
	}
}
