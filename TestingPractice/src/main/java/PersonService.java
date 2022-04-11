//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

import java.util.List;

/**
 * @author aminoiu
 * @since 4/8/2022
 */
public interface PersonService {
    boolean deleteById(Integer personId);

    Person findById(Integer personId);

    Person save(Person user);

    List<Person> searchByCompanyName(String companyName);
}
