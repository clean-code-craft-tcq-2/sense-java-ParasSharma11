package statisticker;

import java.util.Collections;
import java.util.List;

public class StatsChecker {

  float maxThreshold;
  IAlerter[] alertCheckers;

  public StatsChecker(final float maxThreshold, final IAlerter[] alertCheckers) {
    this.maxThreshold = maxThreshold;
    this.alertCheckers = alertCheckers;
  }

  public void checkAndAlert(final List<Float> numberList) {
    Float max = Collections.max(numberList);
    if (max > this.maxThreshold) {
      for (IAlerter alertChecker : this.alertCheckers) {
        alertChecker.check();
      }
    }
  }

}
