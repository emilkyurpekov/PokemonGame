package PokemonGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pokemon p1 = new Pokemon();
        p1.name = scanner.nextLine();
        p1.attackPoints = Integer.parseInt(scanner.nextLine());
        p1.level = Integer.parseInt(scanner.nextLine());
        p1.health =  Integer.parseInt(scanner.nextLine());
        Pokemon p2 = new Pokemon();
        p1.name = scanner.nextLine();
        p1.attackPoints = Integer.parseInt(scanner.nextLine());
        p1.level = Integer.parseInt(scanner.nextLine());
        p1.health =  Integer.parseInt(scanner.nextLine());
    }
}
