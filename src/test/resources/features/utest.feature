
@stories
  Feature: user of the Utest.
    i want to create a new register to access as user


  @Scenario1:
    Scenario Outline: user created successfully
      Given  user in the home page
      When   user creates an account by filling in all the form data
        | firtName   | lastName | email |month   | day    |  year   |  password  |  confirmPassword   |
        |<firtName>  |<lastName>|<email>|<month> | <day>  | <year>  | <password> |  <confirmPassword> |


      Then   User sees her username created


    Examples:
      | firtName   | lastName |       email      |   month   |  day    |  year   |      password       |    confirmPassword   |
      | Cesar      |Martinez  |prueba6@gmail.com|    July   |  12     |  1997   | Estaesunaprueba-123 |  Estaesunaprueba-123 |
