package org.example;

public class Address {
    //fields
    //   1. `int streetNo`
    //   2. `String street`
    //   3. `String city`
    //   4. `Province province`  // enum, contains abbriviations of all provinces in Canada
    //   5. `String postalCode`  // len of 6

    //Methods
    /*1. helper method `static boolean isPostalCodeValid(String postalCode)` to checks if a postcode is valid or not. The length of a postal code can only be `6`.
          1. the postcode must follow the format: `CDCDCD`, where `C` is a character, while `D` is a digit, such as `A1B2C3`.
          2. Note: this method is a static method, which means it requires a parameter of `postalCode` instead of using the field `postalCode`,
     the reason of this is because this method should be called in the constructor and setter, before assigning the input `postalCode` to the field `postalCode`,
      only valid `postalCode` will be assigned to fields.
     */

    //   2. All argument Constructor, in which the method `isPostalCodeValid()` will first be called to check if the parameter `postalCode` is valid or not,
    //   if it is valid, then set all fields, while postal code with all character uppercase to the field, else set everything as `null`.

    //   3. toString

    //   4. equals

    //   5. getter for every field

    //   6. setter for every field
}
