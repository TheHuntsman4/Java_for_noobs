import java.util.*;

public class _1{
    public static void main(String[] args) {
        Room room = new Room();
        room.setdata(101, "Standard 1", 300.0, true);
        room.displaydata();
    }
}


    public class Room{
        public int roomNo;
        public String roomaName;
        public double roomArea;
        public boolean hasAC;
         
        public void setdata(int roomNo, String roomaName, double roomArea, boolean hasAC){
            this.roomNo=roomNo;
            this.roomaName=roomaName;
            this.roomArea=roomArea;
            this.hasAC=hasAC;
        }

        public void display(){
            System.out.println(roomNo);
            System.out.println(roomName);
            System.out.println(roomArea);
            System.out.println(hasAC);
        }
    }