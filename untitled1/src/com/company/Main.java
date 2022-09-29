package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User a = new User();
        String[] arr = a.User();
        Connection con = new Connection();
        //con.Connection(); //массив переменных от connection

    }

    public String[] User(){
        Scanner in = new Scanner(System.in); //запуск ввода



        System.out.print("Insert user name: ");
        String username = in.next();

        System.out.print("Insert password: ");
        String password = in.next();

        String jdbcURL = "jdbc:postgresql://46.229.214.241:5432/postgres";

        String arr[] = new String[]{ username, password  };
        return arr;
    }
}
