//Introduction to java - UPCE
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWellcome to the subject : 'INTRODUCTION TO JAVA', which task would you like to join? (1,2,3....)\n");
        int decision = scan.nextInt();
        bucle(decision);
		
	}

    private static void bucle(int decision) {

        switch(decision){
            case 1 : System.out.println("\nYou choose the exercise: week01(): \n");
                    week01();
                    break;
            case 2 : System.out.println("\nYou choose the exercise: week02(): \n");
                    week02();
                    break;                    
        }

        System.out.println("\nWould you like to see another exercise? YES=1 NO=0\n");
        Scanner scan2 = new Scanner(System.in);
        int repitiendo = scan2.nextInt();
        if(repitiendo == 1){
            System.out.println("\nWhich exercise do you want to do? \n");
            int exercise = scan2.nextInt();
            bucle(exercise);
        }else{
            System.out.println("\n\n\nThank you for playing!! :) \n");
        }

    }

    private static void week02() {

        System.out.println("probando");
    }

    private static void week01() {

        //name
        System.out.println("\nMy name is Emma, i study at the university of Leon (Spain) and im studying computer engineering\n");
    }
	

}