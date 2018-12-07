package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        menu Menu = new menu();
        Scanner gh = new Scanner(System.in);
        int action = 0;

        do {

            System.out.println("To start game,press 2\nExit game,press 1");
            action = gh.nextInt();

            if (action == 2) {

                    Menu.Message();
                    Menu.MessageToAttack();
                    Menu.Result();
            }

            else if (action == 1) break;

            else if (action > 2||action<0) System.out.println("Incorrect");

        } while (action != 1);

    }
}
