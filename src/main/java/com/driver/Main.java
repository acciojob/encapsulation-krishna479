package com.driver;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
     RWOnly obj = new RWOnly();
       // obj.name ="jits";
        // name has private access in com.driver.RWOnly
        obj.setName("jits");
        System.out.println(obj.getName());

    }
}