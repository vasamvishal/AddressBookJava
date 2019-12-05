package com.dummytesting.com;

import java.io.IOException;
import java.util.List;

interface AdressBookInterface {
     void createNewAdressBook(String SrNo,String firstName,String lastName,String address,String city,String zip,String phoneNumber) throws IOException;
     void editInformation(String SrNo, String OldValue, String NewValue);
      void printFromJson();
     AdressBookPojo[] readFromJson();
     void writeToJson(List list) throws IOException;
     void writeToJson1(List list,String SAMPLE_JSON_FILE_PATH1) throws IOException;
}
