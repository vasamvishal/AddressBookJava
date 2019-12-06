package com.dummytesting.com;

import com.google.gson.Gson;

import java.io.*;
import java.util.*;

public class AddressBook implements AdressBookInterface {
    private String filename;
    private String path;
    String pathname = "/home/user/Documents/jsonFiles/";
    AdressBookPojo[] adressBookPojo1;

    List list = new ArrayList();
    AdressBookPojo adressBookPojo = new AdressBookPojo();

    public AddressBook() {
    }

    public AddressBook(String filename) {
        this.filename = filename;
        this.path = pathname + filename + ".json";
    }

    @Override
    public boolean addToAddressBook(String SrNo, String firstName, String lastName, String address, String city, String zip, String phoneNumber) throws AdressBookException {

        System.out.println(this.path);
        openNewFileOfAdressBook(filename);
        System.out.println(path);
        adressBookPojo.setSrno(SrNo);
        adressBookPojo.setAddress(address);
        adressBookPojo.setFirstName(firstName);
        adressBookPojo.setCity(city);
        adressBookPojo.setLastName(lastName);
        adressBookPojo.setAddress(address);
        adressBookPojo.setPhoneNumber(phoneNumber);
        adressBookPojo.setZip(zip);
        AdressBookPojo[] adressBookPojo1 = readFromJson(path);
        list.add(adressBookPojo);
        System.out.println(list);
        return true;

    }

    @Override
    public void editInformation(String SrNo, String OldValue, String NewValue) throws AdressBookException {
        System.out.println(path);
        openNewFileOfAdressBook(filename);
        Boolean flag = false;
        AdressBookPojo[] adressBookPojo1 = readFromJson(path);
        printFromJson(adressBookPojo1);
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
        printFromJson(adressBookPojo1);
    }

    @Override
    public void printFromJson(AdressBookPojo[] adressBookPojo1) throws AdressBookException {
        for (int i = 0; i < adressBookPojo1.length; i++) {
            System.out.println(list.size());
            System.out.println(adressBookPojo1.length);
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
    public AdressBookPojo[] readFromJson(String path) {
        Gson gson = new Gson();
        BufferedReader br = null;
        {
            try {
                System.out.println(path);
                br = new BufferedReader(new FileReader(path));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(br);
            AdressBookPojo[] adressBookPojo1 = gson.fromJson(br, AdressBookPojo[].class);
            System.out.println();
            System.out.println(adressBookPojo1.length);
            for (int i = 0; i < adressBookPojo1.length; i++) {
                list.add(adressBookPojo1[i]);
            }
            System.out.println(list);
            return adressBookPojo1;
        }
    }

    @Override
    public void writeToJson(String SAMPLE_JSON_FILE_PATH1) throws AdressBookException {
        try {
            System.out.println(this.list);
            Gson gson = new Gson();
            String json = gson.toJson(this.list);
            FileWriter writer = new FileWriter(SAMPLE_JSON_FILE_PATH1);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            throw new AdressBookException("Please enter proper file", AdressBookException.ExceptionType.NO_SUCHFILE);
        }
    }

    public void deleteInformation(String SrNo) throws IOException, AdressBookException {
        System.out.println(SrNo);
        AdressBookPojo[] adressBookPojo1 = readFromJson(path);
        for (int i = 0; i < adressBookPojo1.length; i++) {
            String abc = adressBookPojo1[i].getSrno();
            System.out.println(adressBookPojo1[i].getAddress());
            if (!abc.equals(SrNo)) {
                list.add(adressBookPojo1[i]);
            }
        }
        System.out.println(list);
        printFromJson(adressBookPojo1);
    }

    public void sortInformationByLastName() throws AdressBookException {
        AdressBookPojo[] adressBookPojo1 = readFromJson(path);
        for (int i = 0; i < adressBookPojo1.length; i++) {
            list.add(adressBookPojo1[i]);
        }
        Comparator comparing = Comparator.comparing(AdressBookPojo::getLastName);
        list.sort(comparing);
        System.out.println(list);

    }

    public void sortInformationByZipCode() throws AdressBookException, IOException {
        AdressBookPojo[] adressBookPojo1 = readFromJson(path);
        for (int i = 0; i < adressBookPojo1.length; i++) {
            list.add(adressBookPojo1[i]);
        }
        Comparator comparing = Comparator.comparing(AdressBookPojo::getZip);
        list.sort(comparing);
        System.out.println(list);
        writeToJson(path);
        printFromJson(adressBookPojo1);
    }

    public void openNewFileOfAdressBook(String path) throws AdressBookException {
        try {
            String newFileName = pathname + path + ".json";
            File f = new File(newFileName);
            if (f.exists()) {
                System.out.println("File available");
            } else if (!f.exists()) {
                f.createNewFile();
                System.out.println("New File Created");
                System.out.println("1 for writing to file ");
                writeToJson(newFileName);
                System.out.println(list);
            }

        } catch (IOException e) {
            throw new AdressBookException("Please enter proper file", AdressBookException.ExceptionType.NO_SUCHFILE);
        }
    }
    public void existingFilesOfJson(){
        File tmpDir = new File(pathname);
        if(tmpDir.exists() == true)
        {
            String[] files = tmpDir.list();
            for (String file : files)
            {
                System.out.println(file);
            }
        }
        }
    public void openExistInFileFromJson(String fileName) throws AdressBookException {
        filename = pathname + filename + ".json";
        try {
            File file = new File(fileName);
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                if (br.readLine() != null) {
                    printFromJson(adressBookPojo1);
                    System.out.println();
                } else {
                    System.out.println("File is empty");
                }
                br.close();
            }
            if (!file.exists()) {
                System.out.println("file not empty");
            }
        } catch (IOException e) {
            throw new AdressBookException("Please enter proper file", AdressBookException.ExceptionType.NO_SUCHFILE);
        }
    }
}
