//Introduction to java - UPCE
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWellcome to the subject : 'INTRODUCTION TO JAVA', which task would you like to join? (1,2,3....)\n");
        int decision = scan.nextInt();
        bucle(decision);
        scan.close();
		
	}





    //METODO PARA ELEGIR EL EJERCICIO QUE QUEREMOS REALIZAR 

    private static void bucle(int decision) {

        switch(decision){
            case 1 : System.out.println("\nYou choosed the exercise: week01(): \n");
                    week01();
                    break;
            case 2 : System.out.println("\nYou choosed the exercise: week02(): \n");
                    week02();
                    break;  
            case 3 : System.out.println("\nYou choosed the exercise: week03(): \n");
                    week03();
                    break;
            case 4: System.out.println("\nYou choosed the exercise: week04(): \n");
                    week04();
                    break;
            case 5: System.out.println("\nYou choosed the exercise: week05(): \n");
                    week05();
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

    //EJERCICIO DE LA QUINTA SEMANA

    private static void week05() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHow many cars do you want to sort?"); 
        int tamanio = scan.nextInt();

        String[][] nuevo = new String[tamanio][2];
        int contador = 1;

        System.out.println("\n\nNAMES OF THE CARS: ");
        for(int i=0;i<tamanio;i++){
            System.out.println("\n\nName of the "+contador+" car:");
            nuevo[i][0] = scan.next();
            contador++;
        }

        contador = 1;

        System.out.println("\n\nMILEAGES OF THE CARS: ");
        for(int i=0;i<tamanio;i++){
            System.out.println("\nMileage of the "+contador+" car:");
            nuevo[i][1] = scan.next();
            contador++;
        }

        int auxiliar1 = 0;
        int auxiliar2 = 0;
        String aux ;
 
        System.out.println("\nCARS SORTED IN DESCENDING ORDER ACORDING TO THEIR MILEAGES: \n");
        for(int i=0;i<tamanio-1;i++){
            for(int j=0;j<tamanio-1-i;j++){
                auxiliar1 = Integer.parseInt(nuevo[j][1]);
                auxiliar2 = Integer.parseInt(nuevo[j+1][1]);
                if(auxiliar1 < auxiliar2){
                   aux = nuevo[j][1];
                   nuevo[j][1] = nuevo[j+1][1];
                   nuevo[j+1][1] = aux;
                }
                
            }
        }

        for(int i=0;i<tamanio;i++){
            for(int j=0;j<2;j++){
                System.out.println(" "+nuevo[i][j]+" ");
            }
            System.out.println();

        }
        

    }

    //EJERCICIO DE LA CUARTA SEMANA

    

    private static void week04(){
        Scanner scan5 = new Scanner(System.in);
        System.out.println("\nPlease, introduce the number of rows for the FIRST matrix: ");
        int rows = scan5.nextInt();
        System.out.println("\nPlease, introduce the number of columns for the FIRST matrix: ");
        int columns = scan5.nextInt();
        int [][] matriz1 = new int[rows][columns];

        //creation of the matrix1
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("\nNumber for the "+i+j+" position" );
                matriz1[i][j] = scan5.nextInt();
            }
        }

        System.out.println("\nPlease, introduce the number of rows for the SECOND matrix: ");
        int rows2 = scan5.nextInt();
        System.out.println("\nPlease, introduce the number of columns for the SECOND matrix: ");
        int columns2 = scan5.nextInt();
        int [][] matriz2 = new int[rows][columns];

        if(columns!=columns2 && rows!=rows2){
            System.out.println("\nERROR, THE COLUMNS AND ROWS NEEDS TO BE THE SAME FOR MAKING THE SUM!!");
            week04();

        }else{

        //creation of the matrix2
        for(int i=0;i<rows2;i++){
            for(int j=0;j<columns2;j++){
                System.out.println("\nNumber for the "+i+j+" position" );
                matriz2[i][j] = scan5.nextInt();
            }
        }

        suma(matriz1,rows,columns,matriz2,rows2,columns2);
    }

    }
    
    private static void suma(int[][] matriz1, int rows, int columns, int[][] matriz2, int rows2, int columns2) {
        System.out.println("\nFIRST MATRIX ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nSECOND MATRIX ");
        for(int i=0;i<rows2;i++){
            for(int j=0;j<columns2;j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        }

        int[][]suma = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        //SUMA
        System.out.println("\nSUM MATRIX ");
        for(int i=0;i<rows2;i++){
            for(int j=0;j<columns2;j++){
                System.out.print(suma[i][j]+" ");
            }
            System.out.println();
        }
    }





    //EJERCICIO DE LA TERCERA SEMANA

    private static void week03() {
        Scanner scan4 = new Scanner(System.in);
        System.out.println("\nPlease, introduce the dimension of the array: ");
        int dimension = scan4.nextInt();
        int[] array1 = new int[dimension];
        System.out.println("\nPlease, introduce the numbers of the array, press the enter button after each number: \n");
        for(int i=0;i<dimension;i++){
            array1[i] = scan4.nextInt();
        }
       ascendente(array1,dimension);

    }

    private static void ascendente(int[] array1, int dimension) {
       int aux = 0;

       
       for(int i=0;i<dimension-1;i++){
           for(int j=0;j<dimension-1-i;j++){
           if(array1[j]>array1[j+1]){
               aux = array1[j];
               array1[j] = array1[j+1];
               array1[j+1] = aux;
           }
           }           

       }
      
        System.out.println("\nThe array sorted <<<<< : ");
        for(int i=0;i<dimension;i++){
            System.out.print(" "+ array1[i]+ " ");
        }
            System.out.println();


         for(int i=0;i<dimension-1;i++){
            for(int j=0;j<dimension-1-i;j++){
                if(array1[j]<array1[j+1]){
                    aux = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = aux;
                }
                }           
     
            }

            System.out.println("\nThe array sorted >>>>> : ");
            for(int i=0;i<dimension;i++){
                System.out.print(" "+ array1[i]+ " ");
            }
                System.out.println();

        }

        
        


    //EJERCICIO DE LA SEGUNDA SEMANA 


    private static void week02() {

        System.out.println("\nPlease, choose the start number of the multiplication table: \n");
        Scanner scan = new Scanner(System.in);
        int numero1 = scan.nextInt();
        System.out.println("\nPlease, choose the end number of the multiplication table: \n");
        int numero2 = scan.nextInt();
        System.out.println();

        for(int i=numero1;i<numero2;i++){
            System.out.print("--------");
        }
        System.out.println();

        for(int i=numero1;i<=numero2;i++){
            if(i==numero1){
                System.out.printf("       ");
            }
            System.out.printf("%6d",i);
        }
        System.out.println();
        
        for(int i=numero1;i<numero2;i++){
            System.out.print("--------");
        }
        System.out.println();

        if(numero1<numero2){
            
             for(int i=numero1;i<=numero2;i++){
                System.out.printf("%6d|",i);
                    for(int j=numero1;j<=numero2;j++){
                      System.out.printf("%6d",i*j);
                   }
                  System.out.println();
            }
            
        
        }else{
            System.out.println("\nERROR. The start number MUST be smaller that the end number, restarting the game....\n");
            week02();
        }



    }


    //EJERCICIO DE LA PRIMERA SEMANA

    private static void week01() {

        //name
        System.out.println("\nMy name is Emma, i study at the university of Leon (Spain) and im studying computer engineering\n");
    }
	

}