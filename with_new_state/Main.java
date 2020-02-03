package with_new_state;

public class Main {

  public static void main(String[] args) {
    Mario mario = new Mario();

    System.out.println("\n\n");
    System.out.println(mario);

    System.out.println("Encountered a Wall!");
    mario.breakWall();
    System.out.println(mario);

    mario.gotMushroom();
    System.out.println(mario);

    System.out.println("Encountered a Wall!");
    mario.breakWall();
    System.out.println(mario);

    mario.metMonster();
    System.out.println(mario);

    mario.metMonster();
    System.out.println(mario);

    mario.gotFireFlower();
    System.out.println(mario);

    mario.metMonster();
    System.out.println(mario);

    System.out.println("Encountered a Wall!");
    System.out.println(mario);
    mario.breakWall();

    mario.metMonster();
    System.out.println(mario);

  }
}