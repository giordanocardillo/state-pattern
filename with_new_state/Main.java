package with_new_state;

public class Main {

  public static void main(String[] args) {
    Mario mario = new Mario();

    System.out.println("\n\n");
    System.out.println(mario);

    System.out.println("Encountered a wall...");
    mario.breakWall();
    System.out.println(mario);

    System.out.println("Encountered a mushroom...");
    mario.gotMushroom();
    System.out.println(mario);

    System.out.println("Encountered a wall...");
    mario.breakWall();
    System.out.println(mario);

    System.out.println("Encountered an enemy...");
    mario.metMonster();
    System.out.println(mario);

    System.out.println("Encountered an enemy...");
    mario.metMonster();
    System.out.println(mario);

    System.out.println("Encountered a FireFlower...");
    mario.gotFireFlower();
    System.out.println(mario);

    System.out.println("Encountered an enemy...");
    mario.metMonster();
    System.out.println(mario);

    System.out.println("Encountered a wall...");
    mario.breakWall();
    System.out.println(mario);

    System.out.println("Encountered an enemy...");
    mario.metMonster();
    System.out.println(mario);

  }
}