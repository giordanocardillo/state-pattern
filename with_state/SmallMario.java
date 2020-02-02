package with_state;

public class SmallMario implements IState {
  private Mario mario;

  public SmallMario(Mario mario) {
    this.mario = mario;
  }

  public void gotMushroom() {
    System.out.println("Got Mushroom!");
    mario.setState(mario.getState("superMario"));
  }

  public void metMonster() {
    System.out.println("Met Monster!");
    mario.setState(mario.getState("smallMario"));
    mario.lostLife();
  }

  public void breakWall() {
    System.out.println("Can't break wall!");
  }
}