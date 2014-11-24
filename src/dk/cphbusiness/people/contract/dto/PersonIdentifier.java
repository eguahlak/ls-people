package dk.cphbusiness.people.contract.dto;

import java.io.Serializable;

public class PersonIdentifier implements Serializable {
  private static final long serialVersionUID = 1L;
  private String email;
  
  public PersonIdentifier() { }
  
  public PersonIdentifier(String email) {
    this.email = email;
    }

  public String getEmail() {
    return email;
    }
  
  }
