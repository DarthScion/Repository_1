package Cosmin;

import javax.swing.*;
import javax.swing.AbstractAction;

import java.awt.*;
import java.awt.event.*;
import java.awt.EventQueue;

import java.util.*;
import java.util.concurrent.*;
import java.util.Collection;
import java.util.Scanner;
import java.util.EventListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

import java.lang.*;
import java.lang.Exception;
import java.lang.Math.*;
import java.lang.String.*;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;


public class BankAccount
{/* public class BankAccount ---> Start */

 // Properties of the bank account itself
 private static int ID = 1000; // fiindca vreau ca acest ID sa fie unic pt fiecare cont, incrementat cu 1, deci apartine clasei, nu obiectului,

 private String accountNumber; // o combinatie de ID + random 2-digit no + first 2 numbers of SSN
 private static final String routingNumber = "000444";
 private String name;
 private String SSN;

 private double balance;


 //Constructor
 public BankAccount(String SSN, double initDeposit)
 {/* constructor 000 --- start */
  this.SSN = SSN;
  ID++;
  balance = initDeposit;
  System.out.println("Your bank account id is " + ID);
  System.out.println("Your initial deposit is " + balance);
  setAccountNumber();
 }/* constructor 000 --- end */

 private void setAccountNumber() // setare numar de cont
 {
  int random = ThreadLocalRandom.current().nextInt(1, 100 + 1);
  accountNumber = ID + "" + random + SSN.substring(0,2);
  System.out.println("Your account number is: " + accountNumber);
 }

 public void setName(String name)
 {
  this.name = name;
 }

 public String getName()
 {
  System.out.println(name);
  return this.name;
 }


 public void payBill(double ammount)
 {
 balance = balance - ammount;
  System.out.println("You just paid " + ammount);
  System.out.println("Your new balance is" + balance);
 }

public void makeDeposit(double ammount)
 {
 balance = balance + ammount;
 System.out.println("You just deposited " + ammount);
 System.out.println("Your new balance is" + balance);
 }



}/* public class BankAccount ---> End */
