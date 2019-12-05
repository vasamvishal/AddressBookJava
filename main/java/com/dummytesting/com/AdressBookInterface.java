package com.dummytesting.com;

import java.io.IOException;

interface AdressBookInterface {
     void createNewAdressBook(String SrNo,String firstName,String lastName,String address,String city,String zip,String phoneNumber) throws IOException;
}
