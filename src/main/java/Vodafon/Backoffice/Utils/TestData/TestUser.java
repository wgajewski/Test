package Vodafon.Backoffice.Utils.TestData;

/**
 * Created by Grzegorz Gałuszka on 30.05.2017.
 */
public class TestUser {

    public static TestUser testUsersData = new TestUser("701234567", "testergg@test.test", "dupa", "el dupa", "buda", "1994/01/01", "lisica", "AB 123456", "11211", "buda", "pszeniczna", "utca", "4");


    private final String mobile;
    private final String email;
    private final String lastName;
    private final String firstName;
    private final String birthPlace;
    private final String DOB;
    private final String mothersMaidenName;
    private final String idNumber;
    private final String postcode;
    private final String town;
    private final String street;
    private final String streetType;
    private final String houseNo;


    public TestUser(String mobile, String email, String lastName, String firstName, String birthPlace, String DOB, String mothersMaidenName, String idNumber, String postcode, String town, String street, String streetType, String houseNo) {
        this.mobile = mobile;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthPlace = birthPlace;
        this.DOB = DOB;
        this.mothersMaidenName = mothersMaidenName;
        this.idNumber = idNumber;
        this.postcode = postcode;
        this.town = town;
        this.street = street;
        this.streetType = streetType;
        this.houseNo = houseNo;
    }
    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getDOB() {
        return DOB;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getTown() {
        return town;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetType() {
        return streetType;
    }

    public String getHouseNo() {
        return houseNo;
    }
}


