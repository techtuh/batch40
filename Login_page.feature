

@Smoke
Feature: Automationexercise login testing
  I want to use this template for my feature file

  @Smoke
  Scenario: Title of your scenario(As a user, I want to login with valid credentials, so that I can use the website)
    Given Open browser
    And pass the url
      | https://www.automationexercise.com |
      
    When click on login/signup button in the homepage
    And enter the email address in email field
      | rezwanislam857@gmail.com |
    And enter the password in password field
      | Boston2023 |
    And click on login button on the login page
    
    Then I validate the outcomes(Validate Login is successful)
    And check more outcomes
    
    @regression
    Scenario Outline: Title of your scenario(As a user, I want to login with valid credentials, so that I can use the website)
    Given Open browser
    And pass the url "<URL>"
     
      
    When click on login/signup button in the homepage
    And enter the email address in email field "<email>"
    
    And enter the password in password field "<password>"
      
    And click on login button on the login page
    
    Then I validate the outcomes(Validate Login is successful)
    And check more outcomes
    
    Examples: 
    
    |                URl                  |       email              |   password |
    
    | https://www.automationexercise.com  | rezwanislam857@gmail.com | Boston2023 |
    
    | https://www.automationexercise.com  | ahnaf.x.tahmid@gmail.com | passWord1! |
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

  