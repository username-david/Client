package ClientManagement.Controller;

import javax.annotation.PostConstruct;

import org.springframework.web.servlet.ModelAndView;

public class BaseController {
public ModelAndView mvShare = new ModelAndView();
	
	@PostConstruct
	public ModelAndView init() {
		return mvShare;
	}
}
