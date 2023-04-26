Feature: FD Calculator
Scenario: Verify FD Amount for valid Inputs
Given user is on home page
When user enters FDAmount,FDPeriod
And user Selects item from FD_Period
And user enters FD_Interest
And user Select item from FD_CompoundingInt
And Clicks on FD Maturity Amount button 
Then SUT displays FDAmount and FDInterest
And Close AUT
 