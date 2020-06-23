package com.barbershop.controller;

import com.barbershop.model.ClientDto;
import java.util.List;

public interface ClientController {
  Long create(ClientDto clientDto);

  ClientDto get(Long id);

  List<ClientDto> getAll();

  void update(ClientDto clientDto);

  void delete(ClientDto clientDto);
}
