//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

import java.util.List;

/**
 * @author aminoiu
 * @since 4/8/2022
 */
public class PersonServiceImpl implements PersonService {
    PersonRepository personRepository;

    public PersonServiceImpl() {
        personRepository = new PersonRepository();
    }

    @Override
    public boolean deleteById(Integer personId) {
        return personRepository.deleteById(personId);
    }

    @Override
    public Person findById(Integer personId) {
        return personRepository.getPersonById(personId).orElseThrow(() -> new PersonNotFoundException("Person with id[" + personId + "] not found!"));
    }

    @Override
    public Person save(Person user) {
        return personRepository.save(user);
    }

    @Override
    public List<Person> searchByCompanyName(String companyName) {
        return personRepository.searchByCompanyName(companyName);
    }
}
