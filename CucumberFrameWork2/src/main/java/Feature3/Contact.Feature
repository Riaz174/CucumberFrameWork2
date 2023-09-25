Feature: Contact us form

  @Runs
  Scenario Outline: 
    Varify if user clicks on contact us link the form displays and confirm the message when user click register button after entering the valid data

    Given Already opened the protrainingtech.com
    When user click on contact us link
    Then user able to see the contact us form
    When user enters values for first name "<First Name>"
    And user enters value for last name "<Last Name>"
    And user enters value for email "<Email>"
    And user enters value for phone "<Phone>"
    And user clicks on register button
    Then user should see confirmation message

    Examples: 
      | First Name | Last Name | Email                     | Phone      |
      | Nadeem     | Shahbaz   | protrainingtech@gmail.com | 7036167240 |
