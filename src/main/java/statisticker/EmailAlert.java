package statisticker;

public class EmailAlert implements IAlerter {

  public boolean emailDeliverd;

  @Override
  public void check() {
    this.emailDeliverd = true;
  }

}
