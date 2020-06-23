package com.barbershop.config;

import com.barbershop.domain.Client;
import com.barbershop.model.ClientDto;
import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;

public class MapperConfig implements OrikaMapperFactoryConfigurer {

  @Override
  public void configure(MapperFactory mapperFactory) {
    mapperFactory.classMap(ClientDto.class, Client.class)
        .byDefault()
        .register();
  }
}
