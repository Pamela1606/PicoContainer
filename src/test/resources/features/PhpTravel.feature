# Login feature review the behavior in thie feature
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page

  #Option Tours
  @CNT
  Scenario: Tours Page display
    And click on tours menu
    And go to the tours page
    And click on add button on Tours page
    And select "Enabled" Status on Add Tours page
    And fill "Bolivia" Name field on Add Tours page
    And fill "2" Quantity Adults field on Add Tours page
    And fill "260" Price Adults field on Add Tours page
    And select "3" Stars on Add Tours page
    And fill "3" Total Days field on Add Tours page
    And fill "2" Total Nights field on Add Tours page
    And select "Adventure" Tour Type on Add Tours page
    And select "Yes" Feature on Add Tours page
    And select "bol" Location 1 on Add Tours page
    And click On Submit on Add Tours page
    And close Session on Dashboard page

  @ENT
  Scenario: Tours Page display and edit an element
    And click on tours menu
    And go to the tours page
    And click on Edit on Tours page to a Tours selected
    And click to tab 'General' on Tours Edit selected
    And update data form of 'general tab' in edit Tours page
      | Status      | Tour Name  | Quantity |
      | Disabled    | Mexico     | 4        |
    Then Verify that the "CHANGES SAVED!" message is displayed on Tours page
    And close Session on Dashboard page

  @DNT
  Scenario: Tours Page display and delete an element
    And click on tours menu
    And go to the tours page
    And click to 'delete option' on the registry first on Tours on dashboard page
    And click to 'ok button' of the 'pop-up window' on the Tours page
    Then Verify that 'Tours Name' was deleted of the Tours  into dashboard page
    And close Session on Dashboard page

  @CNA
  Scenario: Tours Page display and create a new AddNew
    And click on tours menu
    And go to the Add New page
    And select "Enabled" Status on Add New page
    And fill "Brazil" Name field on Add New page
    And fill "2" Quantity Adults field on Add New page
    And fill "660" Price Adults field on Add New page
    And select "3" Stars on Add New page
    And fill "3" Total Days field on Add New page
    And fill "2" Total Nights field on Add New page
    And select "Adventure" Tour Type on Add New page
    And select "Yes" Feature on Add New page
    And select "sao" Location 1 on Add New page
    And click On Submit on Add New page
    And close Session on Dashboard page

  @CNE
  Scenario: create a new Extra
    And click on tours menu
    And go to the Extras page
    And click on add button on Extras page
    And fill "Cochabamba" Name field on Add Extras page
    And fill "Yes" Status field on Add Extras page
    And fill "250" Price field on Add Extras page
    And click button Save and Return on Add Extras page
    And close Session on Dashboard page

  @VNE
  Scenario: Search the new Extra
    And click on tours menu
    And go to the Extras page
    And click on Search button on Extras page
    And fill element to search "Cochabamba" Search field on Extras page
    And select by field "Name" on Extras page
    And click on GO button on Extras page
    And choose the element to select on Extras page
    And click on icon inspect element selected on Extras page
    And close Session on Dashboard page

  @ENE
  Scenario: edit the new Extra
    And click on tours menu
    And go to the Extras page
    And click on Search button on Extras page
    And fill element to search "Cochabamba" Search field on Extras page
    And select by field "Name" on Extras page
    And click on GO button on Extras page
    And choose the element to select on Extras page
    And click on icon edit element selected on Extras page
    And edit with "Tarija" Name field on Edit Extras page
    And edit select "No" Status field on Edit Extras page
    And edit with "320" Price field on Edit Extras page
    And click button Save and Return on Edit Extras page
    And close Session on Dashboard page

  @DNE
  Scenario: Delete the new Extra
    And click on tours menu
    And go to the Extras page
    And click on Search button on Extras page
    And fill element to search "Tarija" Search field on Extras page
    And select by field "Name" on Extras page
    And click on GO button on Extras page
    And choose the element to select on Extras page
    And click on icon delete element selected on Extras page
    And press on the Enter key to delete the chosen element on Extras page
    And close Session on Dashboard page


