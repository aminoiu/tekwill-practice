//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author aminoiu
 * @since 4/8/2022
 */
public class PersonRepository {
    List<Person> personList = new ArrayList<>();

    PersonRepository() {
        personList.add(new Person("Company1", "fName1", "IName1", 1));
        personList.add(new Person("Company2", "fName2", "IName2", 2));
        personList.add(new Person("Company3", "fName3", "IName3", 3));
        personList.add(new Person("Company4", "fName4", "IName4", 4));
        personList.add(new Person("Company5", "fName5", "IName5", 5));
    }

    public Person save(Person person) {
        person.setPersonId(getFreeId());
        personList.add(person);
        return person;
    }

    public boolean deleteById(int personId) {
        return personList.remove(getPersonById(personId));
    }

    public Optional<Person> getPersonById(int personId) {
       /* Person foundPerson = null;
        for (Person person : personList) {
            if (person.getPersonId() == personId) {
                foundPerson = person;
            }
        }
        if (foundPerson != null) {
            return foundPerson;
        } else {
            throw new PersonNotFoundException("Person with id[" + personId + "] not found!");
        }*/

        return personList.stream().filter(person -> person.getPersonId() == personId).findFirst();
    }

    private int getFreeId() {
        return personList.stream().reduce((p1, p2) -> p1.getPersonId() > p2.getPersonId() ? p1 : p2).get().getPersonId() + 1;
    }

    public List<Person> searchByCompanyName(String companyName){
        return personList.stream().filter( p -> p.getCompanyName().equals(companyName)).collect(Collectors.toList());
    }
}
