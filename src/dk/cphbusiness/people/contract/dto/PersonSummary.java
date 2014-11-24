package dk.cphbusiness.people.contract.dto;

public class PersonSummary extends PersonIdentifier {
  private static final long serialVersionUID = 1L;
  private String name;
  
  public PersonSummary() { }
  
  public PersonSummary(String email, String name) {
    super(email);
    this.name = name;
    }

  public String getName() {
    return name;
    }
  
  }
