class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    // Default constructor
    public Clock() {
        hours = 12;
        minutes = 0;
        seconds = 0;
    }

    // Constructor with hours, minutes, and seconds
    public Clock(int hours, int minutes, int seconds) {
        setClock(hours, minutes, seconds);
    }

    // Constructor with seconds since midnight
    public Clock(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }

    // Set the clock using seconds since midnight
    public void setClock(int secondsSinceMidnight) {
        hours = secondsSinceMidnight / 3600;
        minutes = (secondsSinceMidnight % 3600) / 60;
        seconds = (secondsSinceMidnight % 3600) % 60;
    }

    // Set the clock using hours, minutes, and seconds
    public void setClock(int hours, int minutes, int seconds) {
        if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59 && seconds >= 0 && seconds <= 59) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            System.out.println("Invalid time values!");
        }
    }

    // Get the hours value
    public int getHours() {
        return hours;
    }

    // Get the minutes value
    public int getMinutes() {
        return minutes;
    }

    // Get the seconds value
    public int getSeconds() {
        return seconds;
    }

    // Set the hours value
    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            System.out.println("Invalid hours value!");
        }
    }

    // Set the minutes value
    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("Invalid minutes value!");
        }
    }

    // Set the seconds value
    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            System.out.println("Invalid seconds value!");
        }
    }

    // Increment the time by one second
    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours++;
                if (hours >= 24) {
                    hours = 0;
                }
            }
        }
    }

    // Add the time represented by another Clock object
    public void addClock(Clock clock) {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        int additionalSeconds = clock.hours * 3600 + clock.minutes * 60 + clock.seconds;
        totalSeconds += additionalSeconds;
        setClock(totalSeconds);
    }

    // Get the string representation of the Clock object
    public String getStringFormat() {
        String hourString = String.format("%02d", hours);
        String minuteString = String.format("%02d", minutes);
        String secondString = String.format("%02d", seconds);
        return "(" + hourString + ":" + minuteString + ":" + secondString + ")";
    }

    // Decrement the time by one second
    public void tickDown() {
        seconds--;
        if (seconds < 0) {
            seconds = 59;
            minutes--;
            if (minutes < 0) {
                minutes = 59;
                hours--;
                if (hours < 0) {
                    hours = 23;
                }
            }
        }
    }

    // Subtract the time represented by another Clock object
    public Clock subtractClock(Clock clock) {
        int totalSeconds1 = hours * 3600 + minutes * 60 + seconds;
        int totalSeconds2 = clock.hours * 3600 + clock.minutes * 60 + clock.seconds;
        int difference = totalSeconds1 - totalSeconds2;
        return new Clock(difference);
    }
}

public class clock {
    public static void main(String[] args) {
        // Create a default Clock object
        Clock clock1 = new Clock();
        System.out.println("Clock 1: " + clock1.getStringFormat());

        // Create a Clock object with hours, minutes, and seconds
        Clock clock2 = new Clock(9, 30, 45);
        System.out.println("Clock 2: " + clock2.getStringFormat());

        // Create a Clock object with seconds since midnight
        Clock clock3 = new Clock(37213);
        System.out.println("Clock 3: " + clock3.getStringFormat());

        // Set the clock using hours, minutes, and seconds
        clock1.setClock(14, 20, 0);
        System.out.println("Updated Clock 1: " + clock1.getStringFormat());

        // Set the clock using seconds since midnight
        clock2.setClock(73245);
        System.out.println("Updated Clock 2: " + clock2.getStringFormat());

        // Get the hours, minutes, and seconds  
        System.out.println("Hours: " + clock3.getHours());
        System.out.println("Minutes: " + clock3.getMinutes());
        System.out.println("Seconds: " + clock3.getSeconds());

        // Increment the clock by one second
        clock1.tick();
        System.out.println("After tick: " + clock1.getStringFormat());

        // Add the time represented by another Clock object
        Clock clock4 = new Clock(2, 30, 10);
        clock2.addClock(clock4);
        System.out.println("After adding Clock 4: " + clock2.getStringFormat());

        // Decrement the clock by one second
        clock3.tickDown();
        System.out.println("After tick down: " + clock3.getStringFormat());

        // Subtract the time represented by another Clock object
        Clock clock5 = new Clock(1, 30, 0);
        Clock difference = clock4.subtractClock(clock5);
        System.out.println("Difference: " + difference.getStringFormat());
    }
}


    