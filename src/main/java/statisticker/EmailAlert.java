package statisticker;

abstract class EmailAlert implements IAlerter {

  public boolean emailSent;

  @Override
  public void check() {
    this.emailSent = true;
  }

}
