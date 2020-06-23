package com.barbershop.service.impl;

import com.barbershop.domain.Client;
import com.barbershop.model.ClientDto;
import com.barbershop.repository.ClientRepository;
import com.barbershop.service.ClientService;

import java.util.List;
import lombok.RequiredArgsConstructor;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

  private final ClientRepository clientRepository;
  private final MapperFacade mapperFacade;

  @Override
  public Long create(ClientDto clientDto) {
    Client client = mapperFacade.map(clientDto, Client.class);
    Client savedClient = clientRepository.save(client);
    return savedClient.getId();
  }

  @Override
  public ClientDto getById(Long id) {
    Client client = clientRepository.findById(id).orElse(null);
    return mapperFacade.map(client, ClientDto.class);
  }

  @Override
  public List<ClientDto> getClients() {
    return mapperFacade.mapAsList(clientRepository.findAll(), ClientDto.class);
  }

  @Override
  public void update(ClientDto clientDto) {
    clientRepository.save(mapperFacade.map(clientDto, Client.class));
  }

  @Override
  public void remove(ClientDto clientDto) {
    clientRepository.delete(mapperFacade.map(clientDto, Client.class));
  }
}
