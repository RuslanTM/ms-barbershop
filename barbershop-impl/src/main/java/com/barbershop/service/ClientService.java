package com.barbershop.service;

import com.barbershop.model.ClientDto;
import java.util.List;

public interface ClientService {
  Long create(ClientDto clientDto);

  ClientDto getById(Long id);

  List<ClientDto> getClients();

  void update(ClientDto clientDto);

  void remove(ClientDto clientDto);
}
