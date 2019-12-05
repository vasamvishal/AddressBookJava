package com.dummytesting.com;

import com.dummytesting.com.AdressBookInterface;
import com.google.gson.Gson;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBook implements AdressBookInterface {
    public String SAMPLE_JSON_FILE_PATH = "/home/user/Documents/adressBook.json";
    AdressBookPojo adressBookPojo = new AdressBookPojo();
    Gson gson = new Gson();
    BufferedReader br;

    {
        try {
            br = new BufferedReader(new FileReader("/home/user/Documents/adressBook.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    AdressBookPojo[] adressBookPojo1 = gson.fromJson(br, AdressBookPojo[].class);

    List list = new ArrayList();


    @Override
    public void createNewAdressBook(String SrNo,String firstName, String lastName, String address, String city, String zip, String phoneNumber) throws IOException {
        adressBookPojo.setSrno(SrNo);
        adressBookPojo.setAddress(address);
        adressBookPojo.setFirstName(firstName);
        adressBookPojo.setCity(city);
        adressBookPojo.setLastName(lastName);
        adressBookPojo.setAddress(address);
        adressBookPojo.setPhoneNumber(phoneNumber);
        adressBookPojo.setZip(zip);
        readFromJson();
        list.add(adressBookPojo);

        writeToJson(list);
        //editInformation();

    }

    public void editInformation(String SrNo,String OldValue, String NewValue) throws FileNotFoundException {
        Boolean flag = false;
        readFromJson();
        printFromJson();
        System.out.println("enter options to edit");
        for (int i = 0; i < adressBookPojo1.length; i++) {
            if(adressBookPojo1[i].getSrno().equals(SrNo))
            {
            if (adressBookPojo1[i].getFirstName().equals(OldValue)) {
                adressBookPojo1[i].setFirstName(NewValue);
                flag = true;
            }
            if (adressBookPojo1[i].getLastName().equals(OldValue)) {
                adressBookPojo1[i].setLastName(NewValue);
                flag = true;
            }
            if (adressBookPojo1[i].getAddress().equals(OldValue)) {
                adressBookPojo1[i].setAddress(NewValue);
                flag = true;
            }
            if (adressBookPojo1[i].getZip().equals(OldValue)) {
                adressBookPojo1[i].setZip(NewValue);
                flag = true;
            }
            if (adressBookPojo1[i].getPhoneNumber().equals(OldValue)) {
                adressBookPojo1[i].setPhoneNumber(NewValue);
                flag = true;
            }
            if (flag == true) {
                list.add(adressBookPojo1[i]);
            }
            if (flag == false) {
                System.out.println("Enter proper OLD Value");
            }
        }
        }
            printFromJson();


    }

    private void printFromJson() {
        for(int i=0;i<list.size();i++)
        {
            System.out.println("SRnO            "+list.get(i));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("SrNo        "+adressBookPojo1[i].getSrno());
            System.out.println("firstname   "+adressBookPojo1[i].getFirstName());
            System.out.println("lastName    "+adressBookPojo1[i].getLastName());
            System.out.println("Adress      "+adressBookPojo1[i].getAddress());
            System.out.println("Phonenumber "+adressBookPojo1[i].getPhoneNumber());
            System.out.println("Zip         "+adressBookPojo1[i].getZip());
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
    }

    private void readFromJson() {

        for (int i = 0; i < adressBookPojo1.length; i++) {
            list.add(adressBookPojo1[i]);
        }

    }

    private void writeToJson(List list) throws IOException {
        System.out.println(this.list);
        Gson gson = new Gson();
        String json = gson.toJson(this.list);
        FileWriter writer = new FileWriter(SAMPLE_JSON_FILE_PATH);
        writer.write(json);
        writer.close();
    }

    public void deleteInformation(String SrNo) throws IOException {
        System.out.println(Integer.parseInt(SrNo));
        for(int i=0;i<adressBookPojo1.length;i++)
        {
            if(i != Integer.parseInt(SrNo))
            {
              list.add(adressBookPojo1[i]);
            }

        }
        System.out.println(list);
        writeToJson(list);
        printFromJson();

    }
}
