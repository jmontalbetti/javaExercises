package TT3;

import Utils.StringUtils;

import java.time.Duration;
import java.time.LocalDateTime;

public class Time {
    private LocalDateTime start;
    private LocalDateTime stop;

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getStop() {
        return stop;
    }

    public void setStop(LocalDateTime stop) {
        this.stop = stop;
    }

    public String elapsedTime() {
        return getTime(this.start, this.stop);
    }

    private String getTime(LocalDateTime dob, LocalDateTime now) {
        LocalDateTime today = LocalDateTime.of(now.getYear(),
                now.getMonthValue(), now.getDayOfMonth(), dob.getHour(), dob.getMinute(), dob.getSecond());
        Duration duration = Duration.between(today, now);

        long seconds = duration.getSeconds();
        long hours = seconds / 3600;
        long minutes = ((seconds % 3600) / 60);
        long secs = (seconds % 60);
        StringBuilder result = new StringBuilder();
        result.append(StringUtils.lPad(String.valueOf(hours), '0', 2) + ":");
        result.append(StringUtils.lPad(String.valueOf(minutes), '0', 2) + ":");
        result.append(StringUtils.lPad(String.valueOf(secs), '0', 2) + ".");
        result.append(StringUtils.lPad(String.valueOf(duration.getNano() / 100000), '0', 3));
        return result.toString();
    }
    /*
    for (int i = 0; i < n; i++) {
        maxArray[i] = (int) (Math.random() * (n + 1));
    }
    */
}
