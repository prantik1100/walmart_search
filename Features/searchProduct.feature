Feature: searching product
Scenario Outline: searching product on walmart

Given i m on the walmart homepage

When i enter the "<product_name>" in the search box 
And i click search button

Then i can see the result succesfully 
Examples:
|product_name |
| shirts |
| pants |
