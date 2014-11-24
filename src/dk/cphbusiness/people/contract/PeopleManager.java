package dk.cphbusiness.people.contract;

import dk.cphbusiness.people.contract.dto.PersonDetail;
import dk.cphbusiness.people.contract.dto.PersonIdentifier;
import dk.cphbusiness.people.contract.dto.PersonSummary;
import java.util.Collection;
import javax.ejb.Remote;

@Remote
public interface PeopleManager {
  Collection<PersonSummary> listPeople();
  PersonDetail findPerson(PersonIdentifier id);
  void savePerson(PersonDetail person);
  }
