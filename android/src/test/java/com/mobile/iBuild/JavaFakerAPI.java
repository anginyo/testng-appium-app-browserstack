package com.mobile.iBuild;


import com.github.javafaker.Faker;

public class JavaFakerAPI {

    Faker faker = new Faker();

    public String getPhoneNumber() {
        String phoneNumber = faker.numerify("72172####");
        return phoneNumber;
    }
    public String getCountryName() {
        String countryName = faker.letterify("Kenya");
        return countryName;
    }
    public String getFeatureToggle() {
        String featureToggle = faker.numerify("1");
        return featureToggle;
    }

    public String getFirstName() {
        String firstName = faker.name().firstName();
        return firstName;
    }
    public String getSurname() {
        String surname = faker.name().lastName();
        return surname;
    }
    public String getEmail() {
        String email = faker.internet().emailAddress();
        return email;
    }
    public String getCompanyName() {
        String companyName = faker.company().name();
        return companyName;
    }
    public String getRegId() {
        String businessRegId = faker.numerify("QA-####");
        return businessRegId;
    }
    public String getProjectName() {
        String projectName = faker.numerify("QA - Project - 20### ");
        return projectName;
    }
    public String getProjectDesc() {
        String projectDesc = faker.letterify("QA - ????? ????? ????? ???? ");
        return projectDesc;
    }
    public String getHouseSize() {
        String houseSize = faker.numerify("2###");
        return houseSize;
    }

}
