package with_new_state;

public class SuperMario implements IState {
  private Mario mario;

  public SuperMario(Mario mario) {
    this.mario = mario;
  }

  public void gotMushroom() {
    System.out.println("Got Mushroom!");
  }

  public void metMonster() {
    System.out.println("Met Monster!");
    mario.setState(mario.getState("smallMario"));
  }

  public void breakWall() {
    System.out.println("Wall broken!");
  }

  public void gotFireFlower() {
    System.out.println("Got Fire flower!");
    mario.setState(mario.getState("fireMario"));
  }
}
