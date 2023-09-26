# EJB Timer Service

It's a very powerful mechanism to create different kind of schedule.

## Description

As we know, [Timer Service](https://docs.oracle.com/javaee/6/tutorial/doc/bnboy.html) can close task
for scheduling like monthly report generation, sever checking, birthday notification for customer
etc. Approach of the service is very similar
to [Unix cron utility](https://en.wikipedia.org/wiki/Cron). We can use the same parameters for
describing time period of schedule.

## Project

Generally, we can describe our schedule using declarative and programmatic approach. In our case,
it's declarative description using ```@Schedule``` annotation.

```java

package ejb.timer;

import jakarta.ejb.Schedule;
import jakarta.ejb.Stateless;
import java.util.Date;

@Stateless
public class StatisticsEJB {

  @Schedule(hour = "*", minute = "*/1")
  public void sendMinutesServerStatistics() {
    System.out.println("Your server is alive at: " + new Date());
  }
}
```

As example, we want to create schedule, which will be checked the server statistic we just add one
annotation and period description similar to cron utility.