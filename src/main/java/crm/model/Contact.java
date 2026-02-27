package crm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Contact {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  public Long id;
  public String firstName;
  public String lastName;
  public String email;

  public Contact() {}

  public Contact(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }
}