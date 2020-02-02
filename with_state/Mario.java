package with_state;

public class Mario {
  public int lifeCount;
  private IState state;

  private SmallMario smallMario;
  private SuperMario superMario;

  public Mario() {
    lifeCount = 3;

    smallMario = new SmallMario(this);
    superMario = new SuperMario(this);

    state = smallMario;
  }

  public IState getState(String stateId) {
    switch (stateId) {
    case "smallMario":
      return smallMario;
    case "superMario":
      return superMario;
    default:
      return null;
    }
  }

  public void setState(IState state) {
    this.state = state;
  }

  public void gotMushroom() {
    state.gotMushroom();
  }

  public void metMonster() {
    state.metMonster();
  }

  public void breakWall() {
    state.breakWall();
  }

  public void lostLife() {
    System.out.println("Lost Life!");
    lifeCount -= 1;
  }

}
