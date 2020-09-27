
public class MatrizA {
    
    int suma[][];
    int resta[][];
    int mult[][];
    int matriza[][];
    int matrizb[][];
    
    public MatrizA(){
        matriza=new int[3][3];
        matriza[0][0]=1;
        matriza[0][1]=1;
        matriza[0][2]=1;
        matriza[1][0]=1;
        matriza[1][1]=1;
        matriza[1][2]=1;
        matriza[2][0]=1;
        matriza[2][1]=1;
        matriza[2][2]=1; 
        
        matrizb=new int[3][3];
        matrizb[0][0]=1;
        matrizb[0][1]=1;
        matrizb[0][2]=1;
        matrizb[1][0]=1;
        matrizb[1][1]=1;
        matrizb[1][2]=1;
        matrizb[2][0]=1;
        matrizb[2][1]=1;
        matrizb[2][2]=1;
    }
    
    public int[][] SumaMatriz(){
        suma=new int[3][3];
        
        for (int i=0;i<=3;i++){
            for (int j=0;j<=3;j++){
                suma[i][j]=matriza[i][j] + matrizb[i][j];
            }
        }
        
        return suma;
    }
    
    public int[][] RestaMatriz(){
        resta=new int[3][3];
        
        for (int i=0;i<=3;i++){
            for (int j=0;j<=3;j++){
                resta[i][j]=matriza[i][j] - matrizb[i][j];
            }
        }
        
        return resta;
    }
    
    public int[][] MultMatriz(){
        mult=new int[3][3];
        
        for (int i=0;i<=3;i++){
            for (int j=0;j<=3;j++){
                mult[i][j]=matriza[i][j] * matrizb[i][j];
            }
        }
        
        return mult;
    }
    
    public void MostrarMatriz(){
        System.out.println("Matriz A: ");
        for (int i=0;i<=3;i++){
            
            for (int j=0;j<=3;j++){
                System.out.println(matriza[i][j]);
            }
        }
        
        System.out.println("\nMatriz B: ");
        for (int i=0;i<=3;i++){
            
            for (int j=0;j<=3;j++){
                System.out.println(matrizb[i][j]);
            }
        }
        
        System.out.println("\nMatriz de suma: ");
        for (int i=0;i<=3;i++){
            System.out.println("\n");
            for (int j=0;j<=3;j++){
                System.out.println(suma[i][j]);
            }
        }
        
        System.out.println("\nMatriz de resta: ");
        for (int i=0;i<=3;i++){
            System.out.println("\n");
            for (int j=0;j<=3;j++){
                System.out.println(resta[i][j]);
            }
        }
        
        System.out.println("Matriz de multiplicacion: ");
        for (int i=0;i<=3;i++){
            System.out.println("\n");
            for (int j=0;j<=3;j++){
                System.out.println(mult[i][j]);
            }
        }
    }
}
