/**
 * Created by Olivi on 07-02-2017.
 */
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    LocalDate date;
    LocalDateTime dateTime;

    String weekday = "week"; //hverdag
    String saturday = "sat"; //lørdag
    String sunday = "sun";


    Double normSalary = 115.32; //Grundløn
    Double eveSalary = 25.20; //Bonus på hverdag efter 18.00
    Double satBonus = 44.75; //Bonus om lørdagen efter 15.00
    Double sunBonus = 50.60; //Bonus om søndagen

    Double yourSalary;

    Double afterTax;

    public static void main(String[] args) {

        FIL.udregnLoen;
    }

    public void udregnLoen() {
        for (HVER LINJE I FILEN){
            if (this.date.equals("week")) { //HVIS DAGEN ER EN HVERDAGEN

                yourSalary += yourHours * normSalary;

                while (dateTime.isAfter(KLOKKEN 18.00)){ //timer før kl. 18.00
                    yourSalary += yourHours * eveSalary
                }
            } else if (this.dateTime.equals("sat")) {

                yourSalary += yourHours * normSalary;

                while (dateTime.isAfter(KLOKKEN 15.00)){
                    yourSalary += yourHours * satBonus;
                }
            } else {

                yourSalary += ((yourHours * normSalary) + (yourHours * sunBonus));
            }

            System.out.println("Dette er din estimerede løn før skat: " + yourSalary);

            afterTax = (yourSalary - (yourSalary / 100 * 37));

            System.out.println("Dette er din estimerede løn efter skat: " + afterTax);
        }
    }
}
