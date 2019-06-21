package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {




    public static void playGame() {
        System.out.println("Привет, дружок! Сыграем в игру? На поле с 10 ячейкамии спрятан корабль. Ты должен угадать номер ячейки, чтобы ударить но нему.");

        ArrayList<Integer> ship = new ArrayList<>();

        int shipRandome = 1 + ((int) (Math.random() * 6));

        int shipPlace1 = shipRandome;
        int shipPlace2 = shipPlace1 + 1;
        int shipPlace3 = shipPlace1 + 2;

        ship.add(shipPlace1);
        ship.add(shipPlace2);
        ship.add(shipPlace3);


        //System.out.print(shipPlace1);
       // System.out.print(shipPlace2);
       // System.out.println(shipPlace3);

        String result = "Мимо:(";
        boolean alive = true;

        while (alive) {
            Scanner player = new Scanner(System.in);
            System.out.println("Введи номер ячейки, куда будешь бить:");
            int playerGuess = player.nextInt();

            int guessIndex = ship.indexOf(playerGuess);

            if (guessIndex >= 0) {
                ship.remove(guessIndex);

                if (ship.isEmpty()) {
                    result = "Ты убил их всех";
                } else {
                    result = "Попал!";
                }
            }

            if (result.equals("Ты убил их всех")) {
                alive = false;
            }
            System.out.println(result);
        }


    }


}
