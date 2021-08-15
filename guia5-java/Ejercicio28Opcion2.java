
package ejercicio28opcion2;

import java.util.Scanner;


public class Ejercicio28Opcion2 {


    public static void main(String[] args) {
        
        int[][] matriz = new int[10][10];  //la matriz de 10 x 10
        int[][] miniMatriz = new int[3][3];   //la matriz de 3 x 3
        int fila,columna;
        
        Scanner leer = new Scanner(System.in);
        boolean coincide = false;
        
        // Relleno matriz de 10 x 10 y la imprimo
        for(int i = 0; i<10;i++){  //para recorrer las filas
            
            for(int j=0;j<10;j++){   //para recorrer las columnas
                matriz[i][j]=(int)((Math.random()*98)+1);  //Asigno un numero al azar entre 0 y 99
                
                if(matriz[i][j]<10){
                   System.out.print("[" + matriz[i][j] + " ]");  
                }else{
                    System.out.print("[" + matriz[i][j] + "]");
                }
            }
            
            System.out.println("");
        }
        
        // Relleno matriz de 3 x 3 
        for(int i = 0; i<3;i++){  //para recorrer la fila
            for(int j=0;j<3;j++){   //para recorrer la columna
                miniMatriz[i][j]=leer.nextInt();
            }
        }
        
        //Imprimo matriz de 3 x 3 
        for(int i = 0; i<3;i++){  //para recorrer la fila
            for(int j=0;j<3;j++){  //para recorrer la columna
                
                if(miniMatriz[i][j]<10){
                   System.out.print("[" + miniMatriz[i][j] + " ]");  
                }else{
                    System.out.print("[" + miniMatriz[i][j] + "]");
                }
            }
            System.out.println("");
        }
        
        //Empieza Validacion
        
        for(int i=0; i<10; i++){  //para recorrer la fila
            for(int j=0; j<10;j++){   //para recorrer la columna
                
                if( matriz[i][j] == miniMatriz[0][0] ){
                    
                    coincide=true;
                    
                    for(int k=0; k<3; k++){  //para recorrer la fila
                        for(int l=0;l<3;l++){  //para recorrer la columna
                            if( matriz[k+i][l+j]!= miniMatriz[k][l] ){
                                coincide=false;
                            }
                        }
                    }
                    
                }
                
                if( coincide ) {
                        System.out.println("La miniMatriz se encuentra dentro de la Matriz");
                        System.out.println("Fila: " + i+1 +" | Columna: " + j+1);
                        i=10;
                        j=10;
            }
        }
        
    }
        
        if( !coincide ) {
            System.out.println("La miniMatriz no se encuentra dentro de la matriz");
        }
    
    }
    
}
