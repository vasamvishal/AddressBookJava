package com.dummytesting.com;

import java.io.IOException;
import java.util.List;

interface AdressBookInterface {
     boolean addToAddressBook(String SrNo, String firstName, String lastName, String address, String city, String zip, String phoneNumber) throws IOException, AdressBookException;
     void editInformation(String SrNo, String OldValue, String NewValue) throws IOException, AdressBookException;
     void printFromJson(AdressBookPojo[] adressBookPojo1) throws AdressBookException;
    AdressBookPojo[] readFromJson(String path);
    void writeToJson(String SAMPLE_JSON_FILE_PATH1) throws IOException, AdressBookException;
}
