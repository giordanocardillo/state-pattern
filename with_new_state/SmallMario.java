package with_new_state;

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
    mario.lostLife();
  }

  public void breakWall() {
    System.out.println("Can't break wall!");
  }

  public void gotFireFlower() {
    System.out.println("Got Fire flower!");
    mario.setState(mario.getState("fireMario"));
  }

  @Override
  public String toString(){
    return "SmallMario";
  }
}

