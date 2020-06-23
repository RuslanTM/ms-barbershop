package com.barbershop.controller.impl;

import com.barbershop.controller.ClientController;
import com.barbershop.model.ClientDto;
import com.barbershop.service.ClientService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientControllerImpl implements ClientController {

  private final ClientService clientService;

  @Override
  @PostMapping
  public Long create(@RequestBody ClientDto clientDto) {
    return clientService.create(clientDto);
  }

  @Override
  @GetMapping("/{id}")
  public ClientDto get(@PathVariable Long id) {
    return clientService.getById(id);
  }

  @Override
  @GetMapping
  public List<ClientDto> getAll() {
    return clientService.getClients();
  }

  @Override
  @PutMapping
  public void update(@RequestBody ClientDto clientDto) {
    clientService.update(clientDto);
  }

  @Override
  @DeleteMapping
  public void delete(@RequestBody ClientDto clientDto) {
    clientService.remove(clientDto);
  }
}
