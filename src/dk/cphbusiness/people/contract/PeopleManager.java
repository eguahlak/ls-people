package dk.cphbusiness.people.contract;

import dk.cphbusiness.people.contract.dto.PersonDetail;
import dk.cphbusiness.people.contract.dto.PersonIdentifier;
import dk.cphbusiness.people.contract.dto.PersonSummary;
import java.util.Collection;
import javax.ejb.Remote;
/**
 * This is just plain stupid
 * @author anders
 */
@Remote
public interface PeopleManager {
  Collection<PersonSummary> listPeople();
  PersonDetail findPerson(PersonIdentifier id);
  void savePerson(PersonDetail person);
  }
