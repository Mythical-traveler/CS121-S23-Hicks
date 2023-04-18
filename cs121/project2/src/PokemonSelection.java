

import java.util.Scanner;

public class PokemonSelection extends Pokemon {
    static Scanner console = new Scanner(System.in);

    public static Pokemon createPokemon() {
        System.out.println("Enter Pokemon Name: ");
        String name = console.nextLine();
        System.out.println("Enter Hit Points: ");
        int hp = console.nextInt();
        console.nextLine();
        System.out.println("Enter Pokemon Move: ");
        String move= console.nextLine();
        System.out.println("Enter Move Power: ");
        int mp = console.nextInt();
        System.out.println("Enter Attack Speed: ");
        int as = console.nextInt();
        console.nextLine();
        Pokemon poke = new Pokemon();
        poke.Poke(name,move,hp,mp,as);
        return poke;
    }

    public static void assignPokemon()
    {
        System.out.println("Enter Amount of Players: ");
        int playerCount = console.nextInt();
        console.nextLine();
        Pokemon[] pokeArray = new Pokemon[playerCount];
        for (int i = 0; i < playerCount; i++)
        {
            System.out.println("Player " + (i + 1) + ": Select a Pokemon and enter its stats.");
            pokeArray[i] = createPokemon();
            System.out.println("Player " + (i + 1) + ":");
            pokeArray[i].displayPokemonStats();
        }
        console.close();
    }
}