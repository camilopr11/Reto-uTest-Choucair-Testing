#Autor : Camilo Andres Pastrana Rivas
@stories
Feature: uTest website register
  As a user, I want to register on uTest website
  @scenario1
  Scenario: User registration on uTest website
    Given than Camilo wants to register on uTest website
    When he fills all required personal information
    | strFirstName | strLastName | strEmail | strBirthMonth | strBirthDay | strBirthYear | strCity | strZip | strCountry |
    | Camilo       | Pastrana    | camilop.rivas@gmail.com | March | 4   | 2000         | Medellín | 050032 | Colombia   |
    Then he completes the registration process successfully