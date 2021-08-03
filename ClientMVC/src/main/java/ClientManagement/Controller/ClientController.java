package ClientManagement.Controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ClientManagement.Dao.CountryDao;
import ClientManagement.Dao.GenderDao;
import ClientManagement.Dao.MaritalDao;
import ClientManagement.Dto.ClientDto;
import ClientManagement.Entity.Client;
import ClientManagement.Service.ClientService;
import ClientManagement.Util.DateValidation;

@Controller
public class ClientController extends BaseController {

	@Autowired
	private GenderDao genderDao;
	@Autowired
	private CountryDao countryDao;
	@Autowired
	private MaritalDao maritalDao;
	@Autowired
	ClientService clientService;
	@Autowired
	ClientDto clientDto;

	@RequestMapping(value = { "/addClientRequest", "/modifyClientRequest" }, method = RequestMethod.GET)
	public ModelAndView addClient() {
		List<Client> clientList = clientService.getAll();
		mvShare.addObject("clients", clientService.getAll());
		mvShare.addObject("countries", countryDao.getAll());
		mvShare.addObject("maritals", maritalDao.getAll());
		mvShare.addObject("genders", genderDao.getAll());
		mvShare.addObject("client", new Client());

		mvShare.setViewName("/client/clientAddingForm");
		return mvShare;
	}

	@RequestMapping(value = "/addClientRequest", method = RequestMethod.POST)
	public ModelAndView addClient(@ModelAttribute Client client) throws ParseException {
		
//		int checkDate = DateValidation.compareWithCurrentDate(client.getDateOfBirth());
		int count = clientService.addClient(client);
		mvShare.addObject("count", count);
		mvShare.setViewName("index");

		return mvShare;
	}

	@RequestMapping(value = "/modifyClientRequest", method = RequestMethod.POST)
	public ModelAndView modifyClient(@ModelAttribute Client client) throws ParseException {

		int count = clientService.addClient(client);
		if (count > 0) {
			mvShare.addObject("clientModifyingStatus", "Client modified successfully");
		} else {
			mvShare.addObject("clientModifyingStatus", "Client modified failed");
		}

		mvShare.setViewName("/client/clientAddingForm");
		return mvShare;
	}

	@RequestMapping(value = { "/inquireClientRequest" }, method = RequestMethod.GET)
	public ModelAndView inquireClient() {

		mvShare.setViewName("/client/inquiryForm");
		return mvShare;
	}

	@RequestMapping(value = "/inquireClientRequest", method = RequestMethod.POST)
	public ModelAndView inquireClient(@RequestParam("") String clientId) {

		mvShare = new ModelAndView("/client/inquiryForm");

		Client client = clientService.findClientById(clientId);
		mvShare.addObject("clientId", clientId);

		if (client != null) {
			clientDto = clientService.castToClientDto(client);
			mvShare.addObject("clientDto", clientDto);
		} else {
			return mvShare;
		}

		return mvShare;
	}
}
