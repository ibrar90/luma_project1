Feature: homepage
  Background:
    Given User in LUMA customer login page

    Scenario:users adding an item to checkout box
      And users click on "Women" button from menu bar
      Then users click on jackets
      And user click on Juno Jacket
      And click on "M" box from size option
      And click on Green from Color box
      And put 1 for Qty box
      And click on "Add to Cart" button
      Then user should successfully add Juno jacket in shopping cart
      Then user click on Shopping cart

