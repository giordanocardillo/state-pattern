package with_new_state;

public class FireMario implements IState {
  private Mario mario;

  public FireMario(Mario mario) {
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
  }

}
