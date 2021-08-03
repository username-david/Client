package ClientManagement.Controller;

import java.sql.SQLException;

import javax.naming.NamingException;

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

	@RequestMapping(value = { "/clientAdding" }, method = RequestMethod.GET)
	public ModelAndView inquireClient() throws NamingException, SQLException {
		
//		clientDao.updateClient();
//		clientDao.addClient();
		return mvShare;
	}
}
