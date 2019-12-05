package com.dummytesting.com;

import com.google.gson.Gson;

import java.io.*;
import java.util.*;

public class AddressBook implements AdressBookInterface {
    
//        public String SAMPLE_JSON_FILE_PATH = "/home/user/Documents/adressBook.json";
//        String pathname = "/home/user/Documents/";
//        Gson gson = new Gson();
//        BufferedReader br;
//        {
//            try {
//                br = new BufferedReader(new FileReader("/home/user/Documents/adressBook.json"));
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//        AdressBookPojo[] adressBookPojo1 = gson.fromJson(br, AdressBookPojo[].class); 
            List list = new ArrayList();
            String pathname = "/home/user/Documents/";
            String SAMPLE_JSON_FILE_PATH = "/home/user/Documents/adressBook.json";
    
    AdressBookPojo adressBookPojo = new AdressBookPojo();
    @Override
    public void createNewAdressBook(String SrNo, String firstName, String lastName, String address, String city, String zip, String phoneNumber) throws IOException {
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
    }

    @Override
    public void editInformation(String SrNo, String OldValue, String NewValue) {
        Boolean flag = false;
        AdressBookPojo[] adressBookPojo1 = readFromJson();
        printFromJson();
        System.out.println("enter options to edit");
        for (int i = 0; i < adressBookPojo1.length; i++) {
            if (adressBookPojo1[i].getSrno().equals(SrNo)) {
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

    @Override
    public void printFromJson() {
        AdressBookPojo[] adressBookPojo1 = readFromJson();
        for (int i = 0; i < list.size(); i++) {

            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("SrNo        " + adressBookPojo1[i].getSrno());
            System.out.println("firstname   " + adressBookPojo1[i].getFirstName());
            System.out.println("lastName    " + adressBookPojo1[i].getLastName());
            System.out.println("Adress      " + adressBookPojo1[i].getAddress());
            System.out.println("Phonenumber " + adressBookPojo1[i].getPhoneNumber());
            System.out.println("Zip         " + adressBookPojo1[i].getZip());
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
    }

    @Override
    public AdressBookPojo[] readFromJson() {
        Gson gson = new Gson();
        BufferedReader br = null;
        {
            try {
                br = new BufferedReader(new FileReader("/home/user/Documents/adressBook.json"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            AdressBookPojo[] adressBookPojo1 = gson.fromJson(br, AdressBookPojo[].class);
            List list = new ArrayList();
            for (int i = 0; i < adressBookPojo1.length; i++) {
                list.add(adressBookPojo1[i]);
            }
            return adressBookPojo1;
        }
    }

    @Override
    public void writeToJson(List list) throws IOException {
        System.out.println(this.list);
        Gson gson = new Gson();
        String json = gson.toJson(this.list);
        FileWriter writer = new FileWriter(SAMPLE_JSON_FILE_PATH);
        writer.write(json);
        writer.close();
    }

    @Override
    public void writeToJson1(List list, String SAMPLE_JSON_FILE_PATH1) throws IOException {
        System.out.println(this.list);
        Gson gson = new Gson();
        String json = gson.toJson(this.list);
        FileWriter writer = new FileWriter(SAMPLE_JSON_FILE_PATH1);
        writer.write(json);
        writer.close();
    }

    public void deleteInformation(String SrNo) throws IOException {
        System.out.println(SrNo);
        AdressBookPojo[] adressBookPojo1 = readFromJson();
        for (int i = 0; i < adressBookPojo1.length; i++) {
            String abc = adressBookPojo1[i].getSrno();
            System.out.println(adressBookPojo1[i].getAddress());
            if (!abc.equals(SrNo)) {
                list.add(adressBookPojo1[i]);
            }
        }
        System.out.println(list);
        writeToJson(list);
        printFromJson();
    }

    public void sortInformation() throws IOException {
        AdressBookPojo[] adressBookPojo1= readFromJson();
        for (int i = 0; i < adressBookPojo1.length; i++) {
            list.add(adressBookPojo1[i]);
        }
        Comparator comparing = Comparator.comparing(AdressBookPojo::getLastName);
        list.sort(comparing);
        System.out.println(list);
        writeToJson(list);
    }

    public void sortInformationByZipCode() throws IOException {
        AdressBookPojo[] adressBookPojo1 = readFromJson();
        for (int i = 0; i < adressBookPojo1.length; i++) {
            list.add(adressBookPojo1[i]);
        }
        Comparator comparing = Comparator.comparing(AdressBookPojo::getZip);
        list.sort(comparing);
        System.out.println(list);
        writeToJson(list);
    }

    public void openNewFileOfAdressBook(String filename) throws IOException {
        String path = pathname + filename + ".json";
        File f = new File(path);
        if (f.exists()) {
            System.out.println("File available");
        } else if (!f.exists()) {
            f.createNewFile();
            writeToJson1(list, path);
            System.out.println(list);
        }
    }

    public void openExistInFileFromJson(String fileName) throws IOException {
        String path = pathname + fileName + ".json";
        File file = new File(path);
        if (file.exists()) {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            if (br.readLine() != null) {
                printFromJson();
                System.out.println();
            } else {
                System.out.println("File is empty");
            }
            br.close();
        }
    }
}
