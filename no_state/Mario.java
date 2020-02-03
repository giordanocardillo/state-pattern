package no_state;

public class Mario {
  private int state;
  private int lifeCount;

  public Mario() {
    state = 0;
    lifeCount = 3;
  }

  public void breakWall() {
    if (state == 0) {
      System.out.println("Can't break wall!");
    } else if (state == 1) {
      System.out.println("Wall broken!");
    }
  }

  public void gotMushroom() {
    System.out.println("Got Mushroom!");
    if (state == 0) {
      state = 1;
    }
  }

  public void metMonster() {
    System.out.println("Met monster!");
    if (state == 0) {
      lifeCount -= 1;
    } else {
      state = 0;
    }
  }

}
