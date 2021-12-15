package com.company.parser_utils;

import com.company.interfaces.IHMInterface;

import java.util.Scanner;

public class IHM implements IHMInterface {
    private Scanner sc;

    public IHM(){
        sc = new Scanner(System.in);
    }

    public String read() {
        return sc.nextLine();
    }

    @Override
    public void write(String message) {
        System.out.println(message);
    }

    public void closeIHM(){
        sc.close();
    }
}
