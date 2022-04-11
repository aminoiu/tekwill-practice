//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author aminoiu
 * @since 4/8/2022
 */
public class PersonServiceImplTest {
    private PersonService personService;
    private Person person;

    @BeforeEach
    public void setup() {
        personService = new PersonServiceImpl();
        person = new Person();
        person.setfName("Mary");
        person.setlName("Harry");
        person.setCompanyName("test");
    }

    @Test
    void save_personWithoutId_setPersonId() {
        person = personService.save(person);
        Assertions.assertNotEquals(0, person.getPersonId());
    }

    @Test
    void save_personObject_personObjectsEquals() {
        Person resultedPerson = personService.save(person);
        Assertions.assertEquals(person, resultedPerson);
    }

    @Test
    void findById_sameObject_equals() {
        personService.save(person);
        Person person1 = personService.findById(person.getPersonId());
        Assertions.assertEquals(person, person1);
    }

    @Test
    void findById_nonExistPerson_throwException() {
        Assertions.assertThrows(PersonNotFoundException.class, () -> personService.findById(50), "User not found exception()");
    }

    @Test
    void searchByCompanyName_notFound_returnEmpty() {
        List<Person> personList = personService.searchByCompanyName("Test");
        Assertions.assertTrue(personList.isEmpty());
    }


}
