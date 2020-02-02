package no_state;

public class MarioWithEnum {
  private enum State {
    MARIO, SUPER_MARIO
  }

  private State state;
  private int lifeCount;

  public MarioWithEnum() {
    state = State.MARIO;
    lifeCount = 3;
  }

  public void breakWall() {
    if (state == State.MARIO) {
      System.out.println("Can't break wall!");
    } else if (state == State.SUPER_MARIO) {
      System.out.println("Wall broken!");
    }
  }

  public void gotMushroom() {
    System.out.println("Got Mushroom!");
    if (state == State.MARIO) {
      state = State.SUPER_MARIO;
    }
  }

  public void metMonster() {
    System.out.println("Met monster!");
    if (state == State.MARIO) {
      lifeCount -= 1;
    } else {
      state = State.MARIO;
    }
  }

}
