package ClientManagement.Controller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ClientManagement.Dto.ClientDto;
import ClientManagement.Entity.Client;
import ClientManagement.Service.ClientService;
import ClientManagement.Service.ValidationService;

@Controller
public class ClientController extends BaseController {

	@Autowired
	ClientService clientService;
	@Autowired
	ClientDto clientDto;

	@RequestMapping(value = { "/addClientRequest" }, method = RequestMethod.GET)
	public ModelAndView addClient() {

		mvShare.addObject("client", new Client());

		mvShare.setViewName("/client/clientAddingForm");
		return mvShare;
	}

	@RequestMapping(value = "/addClientRequest", method = RequestMethod.POST)
	public String addClient(HttpServletRequest request, HttpSession session, @ModelAttribute Client client)
			throws ParseException {

		int count = 0;
		int isUsedID = clientService.isIDNumberSaved(client.getIdentityNumber());
		int isFutureDate = ValidationService.isFutureDate(client.getDateOfBirth());

		if (ValidationService.isAbleToAdd(isFutureDate, isUsedID) == true) {
			count = clientService.addClient(client);
		}
		session.setAttribute("count", count);
		session.setAttribute("isFututeDate", isFutureDate);
		session.setAttribute("isUsedID", isUsedID);

		return "redirect:/addClientRequest";
	}

//	@RequestMapping(value = "/modifyClientRequest", method = RequestMethod.GET)
//	public ModelAndView modifyClient() throws ParseException {
//
//		mvShare.setViewName("/client/clientModifyingForm");
//		return mvShare;
//	}
	
	@RequestMapping(value = "/modifyClientRequest", method = RequestMethod.GET)
	public ModelAndView modifyClient() throws ParseException {
		
		mvShare.setViewName("/client/clientModifyingForm");
		return mvShare;
	}
	
	@RequestMapping(value = "/modifyClientRequest", method = RequestMethod.POST)
	public ModelAndView modifyClient(@RequestParam("") String clientId, @ModelAttribute Client client) throws ParseException {

		mvShare.setViewName("/client/clientModifyingForm");
		Client clientToEdit = clientService.findClientById(clientId);
		mvShare.addObject("client", clientToEdit);
		return mvShare;
	}

//	@RequestMapping(value = "/modifyClientRequest", method = RequestMethod.POST)
//	public String EditCart(HttpServletRequest request, HttpSession session, @PathVariable String clientId) {
//		Client client = (Client) session.getAttribute("client");
//		if (client == null) {
//			return null;
//		}
//		clientService.updateClient(clientId);
//		return "redirect:/modifyClientRequest";
//	}

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
		}
		return mvShare;
	}

}
