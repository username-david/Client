package ClientManagement.Util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ClientManagement.Entity.Client;
import ClientManagement.Service.ClientService;

public class IDValidation {

	@Autowired
	public static ClientService clientService;
	
	
	
	public static int checkIDNumber(String idNumber) {

		List<Client> clientList = clientService.getAll();

		Client client = clientList.stream().filter(t -> idNumber.equals(t.getClientID())).findAny().orElse(null);

		return client == null ? 0 : 1;
	}

	public static void main(String... args) {
		List<Client> clientList = clientService.getAll();
		int i = checkIDNumber("vt");
		int it = checkIDNumber("Cn000012");
		System.out.println("Hi");
	}
}
