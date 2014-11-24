package dk.cphbusiness.people.contract.dto;

public class PersonDetail extends PersonIdentifier {
  private String firstName;
  private String LastName;
  private int age;

  public PersonDetail(String email, String firstName, String LastName, int age) {
    super(email);
    this.firstName = firstName;
    this.LastName = LastName;
    this.age = age;
    }

  public String getFirstName() {
    return firstName;
    }

  public String getLastName() {
    return LastName;
    }

  public int getAge() {
    return age;
    }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
    }

  public void setLastName(String LastName) {
    this.LastName = LastName;
    }

  public void setAge(int age) {
    this.age = age;
    }
  
  }
