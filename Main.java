import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        // Make the Grass pokemon's.
        Grass bulbasaur = new Grass("grass", "Bulbasaur", 3, 3, 3, 0, 3, 4, 4, 0.7f, 6.9f);
        Grass ivysaur = new Grass("grass", "Ivysaur", 4, 4, 4, 0, 4, 5, 5, 1.0f, 13.0f);
        Grass venusaur = new Grass("grass", "Venusaur", 4, 4, 4, 0, 4, 5, 5, 1.0f, 13.0f);
        Grass oddish = new Grass("grass", "Oddish", 2, 3, 3, 0, 4, 5, 4, 0.5f, 5.4f);

        // Make the fire pokemon's
        Fire charmeleon = new Fire("fire", "Charmeleon", 5, 4, 4, 0, 4, 5, 4, 1.1f, 19.0f);
        Fire charizard = new Fire("fire", "Charizard", 6, 5, 5, 0, 5, 7, 5, 1.7f, 90.5f);
        Fire charmander = new Fire("fire", "Charmander", 4, 4, 3, 0, 3, 4, 3, 0.6f, 8.5f);
        Fire vulpix = new Fire("fire", "Vulpix", 4, 3, 3, 0, 3, 3, 4, 0.6f, 9.9f);

        // Make the water pokemon's
        Water squirtle = new Water("water", "Squirtle", 3, 3, 3, 0, 4, 3, 4, 0.5f, 9.0f);
        Water wartortle = new Water("water", "Wartortle", 4, 4, 4, 0, 5, 4, 5, 1.0f, 22.5f);
        Water blastoise = new Water("water", "Blastoise", 5, 5, 5, 0, 6, 5, 7, 1.6f, 85.5f);
        Water golduck = new Water("water", "Golduck", 5, 5, 5, 0, 5, 6, 5, 1.7f, 76.6f);


        //Make the electric pokemon's
        Electric electrike = new Electric("electric", "Electrike", 4, 3, 3, 0, 3, 4, 3, 0.6f, 15.2f);
        Electric magneton = new Electric("electric", "Magneton", 5, 4, 3, 0, 6, 8, 5, 1.0f, 60.0f);
        Electric electivire = new Electric("electric", "Electivire", 5, 5, 5, 0, 6, 5, 7, 1.0f, 85.5f);
        Electric pikachu = new Electric("electric", "Pikachu", 6, 4, 3, 0, 3, 3, 3, 0.4f, 6.0f);

        ArrayList<Grass> grasspokemon = new ArrayList<>();
        grasspokemon.add(bulbasaur);
        grasspokemon.add(ivysaur);
        grasspokemon.add(venusaur);
        grasspokemon.add(oddish);

        ArrayList<Fire> firepokemon = new ArrayList<>();
        firepokemon.add(charmeleon);
        firepokemon.add(charizard);
        firepokemon.add(charmander);
        firepokemon.add(vulpix);

        ArrayList<Water> waterpokemon = new ArrayList<>();
        waterpokemon.add(squirtle);
        waterpokemon.add(wartortle);
        waterpokemon.add(blastoise);
        waterpokemon.add(golduck);

        ArrayList<Electric> electricpokemon = new ArrayList<>();
        electricpokemon.add(electrike);
        electricpokemon.add(magneton);
        electricpokemon.add(electivire);
        electricpokemon.add(pikachu);


            for (Grass y : grasspokemon) {
                y.setArray();
            }
            for (Fire y : firepokemon) {
                y.setArray();
            }
            for (Water y : waterpokemon) {
                y.setArray();
            }
            for (Electric y : electricpokemon) {
                y.setArray();
            }

    }
}
