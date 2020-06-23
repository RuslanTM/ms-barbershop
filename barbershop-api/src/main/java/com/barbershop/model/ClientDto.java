package com.barbershop.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDto {
  private Long id;
  private String username;
  private String password;
  private String firstName;
  private String middleName;
  private String lastName;
  private LocalDate dateOfBirth;
}
