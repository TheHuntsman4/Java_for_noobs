
class Clock{
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(){
        hours=12;
        minutes=0;
        seconds=0;
    }

    public Clock(int hours, int minutes, int seconds){
        setClock(hours, minutes, seconds);
    }
    
    public Clock(int Byminutes){
        setClock(Byminutes);
    }

    //Getter Methods
    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }
    public int seconds(){
        return seconds;
    }


    //Setter Methods
    public void setClock(int hours, int minutes, int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }

    public void setClock(int seconds){
        this.hours=(seconds/3600);
        this.minutes=(seconds%3600)/60;
        this.seconds=(seconds%3600)%60;
    }

        //Setter Methods for individual
        public void setHours(int hours){
            if(hours>=0 && hours<=23){
                this.hours=hours;
            }
        }

        public void setMinutes(int minutes){
            if(minutes>=0 & minutes<=59){
                this.minutes=minutes;
            }
        }

        public void setSeconds(int seconds){
            if(seconds>=0 && seconds<=59){
                this.seconds=seconds;
            }
        }

        //Ticker function

        public void Tick(){
            if(this.seconds>=0 && this.seconds<=59){
                this.seconds+=1;
            }
            
        }

        //String Representation
        public String getStringFormat(){
            String hoursString= String.format("%02d",hours);
            String minutesString= String.format("%02d",minutes);
            String secondsString= String.format("%02d",seconds);
            return(hoursString+":"+minutesString+":"+secondsString);
        }
}

public class clock1{
    public static void main(String[] args){
        Clock clock1 = new Clock();
        clock1.Tick();
        System.out.println(clock1.getStringFormat()); 
    }

}