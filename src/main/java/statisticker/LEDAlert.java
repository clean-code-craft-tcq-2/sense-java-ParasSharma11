package statisticker;

public class LEDAlert implements IAlerter {

  public boolean ledWorks;

  @Override
  public void check() {
    this.ledGlows = true;

  }

}
