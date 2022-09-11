#Autor: Angie
@stories
  Feature: Register UTest Page HappyPath
    As a user, i need to register on the page UTest
  @scenario1:
  Scenario: Register on the page UTest
    Given than Angie needs join to the UTest community
    When she completes the registration form
    | firstName | lastName | mail | month | day | year | password |
    | Angie     | Gomez    | 615345@gmail.com| February| 19|1999| Ch0uc41r2022*|
    Then system displays a welcome message:
    | message |
    | Welcome to the world's largest community of freelance software testers! |