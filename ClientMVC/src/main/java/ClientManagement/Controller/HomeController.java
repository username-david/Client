package ClientManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mvShare = new ModelAndView("index");
		return mvShare;
	}
}