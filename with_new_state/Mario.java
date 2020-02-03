package with_new_state;

public class Mario {
  public int lifeCount;
  private IState state;

  private SmallMario smallMario;
  private SuperMario superMario;
  private FireMario fireMario;

  public Mario() {
    lifeCount = 3;

    smallMario = new SmallMario(this);
    superMario = new SuperMario(this);
    fireMario = new FireMario(this);

    state = smallMario;
  }

  public IState getState(String stateId) {
    switch (stateId) {
    case "smallMario":
      return smallMario;
    case "superMario":
      return superMario;
    case "fireMario":
      return fireMario;
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

  public void gotFireFlower() {
    state.gotFireFlower();
  }

  public void lostLife() {
    System.out.println("Lost Life!");
    lifeCount -= 1;
  }

  @Override
  public String toString() {
    return "Life: " + this.lifeCount + " - State: " + this.state + "\n";
  }

}
