package statisticker;

abstract class EmailAlert implements IAlerter {

  public boolean emailDeliverd;

  @Override
  public void check() {
    this.emailSent = true;
  }

}
