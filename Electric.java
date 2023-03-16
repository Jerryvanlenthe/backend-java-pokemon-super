import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Electric extends Pokemon {
    private int speed;
    private int attack;
    ;

    int hp;
    int xp;
    int defense;
    int specialAttack;
    int specialDefense;
    float height;
    float weight;

    // Constructor

    public Electric(String type, String name, int speed, int attack, int hp, int xp, int defense, int specialAttack, int specialDefense, float height, float weight) {
        super(type, name);
        this.speed = speed;
        this.hp = hp;
        this.xp = xp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.height = height;
        this.weight = weight;
    }

    //Getters
    public int getSpeed() {
        return this.speed;
    }

    public int getAttack() {
        return this.attack;
    }

    //Setters
    public void setSpeed(int Speed) {
        this.speed = speed;
    }

    public void setAttack(int Attack) {
        this.attack = attack;
    }

    @Override
    void setArray() {
        System.out.println("\n");
        System.out.println("\t \t \t \t \t " + this.getName().toUpperCase() + " is a " + this.getType() + " Pokemon");
        System.out.println("\t \t \t \t \t ------------------------------");
        System.out.println("\t \t \t \t \t | Speed             |   " + getSpeed() + "    |");
        System.out.println("\t \t \t \t \t | Health Points     |   " + this.hp + "    |");
        System.out.println("\t \t \t \t \t | Experience points |   " + this.xp + "    |");
        System.out.println("\t \t \t \t \t | Defense           |   " + this.defense + "    |");
        System.out.println("\t \t \t \t \t | Special Attack    |   " + this.specialAttack + "    |");
        System.out.println("\t \t \t \t \t | Special Defence   |   " + this.specialDefense + "    |");
        System.out.println("\t \t \t \t \t | Height :          |   " + this.height + "  |");
        System.out.println("\t \t \t \t \t | Weight :          |   " + this.weight + "  |");
        System.out.println("\t \t \t \t \t ------------------------------");

        try {
            String path = "src\\" + this.getName() + ".txt";
            File pokemonAscii = new File(path);
            Scanner myReader = new Scanner(pokemonAscii);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
