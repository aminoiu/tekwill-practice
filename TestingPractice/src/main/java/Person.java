//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

/**
 * @author aminoiu
 * @since 4/8/2022
 */
public class Person {
    private String companyName;
    private String fName;
    private String lName;
    private int personId;

    public Person() {
    }
    
    public Person(String companyName, String fName, String lName, int personId) {
        this.companyName = companyName;
        this.fName = fName;
        this.lName = lName;
        this.personId = personId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
