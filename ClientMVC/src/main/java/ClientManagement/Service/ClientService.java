package ClientManagement.Service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClientManagement.Dao.ClientDao;
import ClientManagement.Dto.ClientDto;
import ClientManagement.Entity.Client;

@Service
public class ClientService {

	@Autowired
	ClientDao clientDao;
	@Autowired
	ClientDto clientDto;

	public List<Client> getAll() {
		return clientDao.getAll();
	}

	public int addClient(Client client) throws ParseException {
		return clientDao.addClient(client);
	}

	public int isIDNumberSaved(String idNumber) throws ParseException {
		return clientDao.isIDNumberSaved(idNumber);
	}

	public Client findClientById(String clientId) {
		return clientDao.findClientById(clientId);
	}

	public ClientDto castToClientDto(Client client) {
		return clientDto.castToClientDto(client);
	}

	public void updateClient(String clientId) {
		clientDao.updateClient(clientId);
	}
}