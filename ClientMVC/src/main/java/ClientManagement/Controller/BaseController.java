package ClientManagement.Controller;

import java.text.ParseException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import ClientManagement.Service.HomeService;

@Controller
public class BaseController {
	public ModelAndView mvShare = new ModelAndView();

	@Autowired
	HomeService homeService;

	@PostConstruct
	public ModelAndView init() throws ParseException {

		mvShare.addObject("countries", homeService.getAllCountries());
		mvShare.addObject("maritals", homeService.getAllMaritalStatus());
		mvShare.addObject("genders", homeService.getAllGenders());
		
		return mvShare;
	}
}
