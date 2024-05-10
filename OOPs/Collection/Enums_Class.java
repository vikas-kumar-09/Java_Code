package OOPs.Collection;


// Enums : it a group of variable you can not change or modified
public class Enums_Class {
    enum Week {
       monday, tuesday, wednesday, thursday, friday,  satturday, sunday;
       //these are enums constants
       // these are only : public, static and finals
       // since its final you can create child enums
       // type is week
    }
    public static void main(String[] args) {
        Week week;
        week = Week.tuesday;

        // for(Week day : Week.values()){
        //     System.out.print(day + " ");
        // }
        System.out.println(week.ordinal());
    }
}
