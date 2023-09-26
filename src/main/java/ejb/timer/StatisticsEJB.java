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

  @Schedule(hour = "*", minute = "*/5")
  public void sendServerReportEachFiveMinute() {
    System.out.println("Server report was sent at: " + new Date());
  }
}