package statisticker;

import java.util.List;

public class Statistics 
{
    public static class Stats {
        public Float min,max,average;
    }
    public static Stats getStatistics(List<Float> numbers) {
       Stats s = new Stats();
       if(!numbers.isEmpty()) {
       s.min = Collections.min(numbers);
       s.max = Collections.max(numbers);
       Float sum = (float) 0;
       for (Float i : numbers) {
           sum+=i;
       }
       s.average = sum/(float)numbers.size();
       }
    return s;
        
        
    }
}
