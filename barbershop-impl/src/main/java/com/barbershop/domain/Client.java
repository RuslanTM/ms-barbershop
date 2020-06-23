package com.barbershop.domain;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "clients")
@Data
public class Client {
  @Id
  @SequenceGenerator(name = "clients_id_sequence", sequenceName = "seq_client_id", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clients_id_sequence" )
  private Long id;
  @Column(name = "username")
  private String username;
  @Column(name = "password")
  private String password;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "middle_name")
  private String middleName;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "date_of_birth")
  private LocalDate dateOfBirth;
}
