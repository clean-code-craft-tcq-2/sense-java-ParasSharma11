package statisticker;

public class LEDAlert implements IAlerter {

  public boolean ledGlows;

  @Override
  public void check() {
    this.ledGlows = true;

  }

}
