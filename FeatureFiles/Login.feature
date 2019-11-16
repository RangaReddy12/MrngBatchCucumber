Feature: This feature will contain Login page tests 
@tag1
	Scenario: Login Functionality Validation
    When I open OrangeHRMS URL on chromebrowser
    And I enter username in usernameField and password in password field
     When I click Login Button
    Then I Should see Welcome Link on Home Page
    When I close the browser
    @scenariowithDatatable
    Scenario Outline: Login Functionality Validation
    When I open OrangeHRMS URL on "<Browser>"
    And I enter "<UserName>" in usernameField
    And I enter "<Password>" in passwordField
    When I click Login Button
    Then I Should check dash in url
    When I close the browser
    Examples:
    |Browser|UserName|Password|
    |ChromeBrowser|Admin|admin123|
    |FirefoxBrowser|Admin|Qedge123!@#|
    |ChromeBrowser|Admin|admin123|
    |FirefoxBrowser|Admin|Qedge123!@#|
    |ChromeBrowser|Admin|Qedge123!@#|
    
    
    
    
    
    
    
    
    
    
    
    