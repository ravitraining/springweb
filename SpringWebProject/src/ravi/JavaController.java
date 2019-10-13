package ravi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class JavaController {
@RequestMapping("/java4s")
public ModelAndView helloWorld()
{
	String message="Hello RAvi How Ar your lavde lagle";
	return new ModelAndView("welcomePage","welcomeMessage",message);
}
}
