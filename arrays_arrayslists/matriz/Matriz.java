package arrays_arrayslists.matriz;

public class Matriz {
    private float[][] matriz = new float[2][2];

    public Matriz(float n00,float n01, float n10, float n11){
        this.matriz[0][0]= n00;
        this.matriz[0][1]= n01;
        this.matriz[1][0]= n10;
        this.matriz[1][1]= n11;
    }

    public float determinante(){
        return ((this.matriz[0][0]*this.matriz[1][1])-(this.matriz[1][0]*this.matriz[0][1]));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<2;i++){
            for(int j = 0; j<2;j++){
                sb.append(String.format("Elemento[%d][%d]: %.2f\n",i+1,j+1,this.matriz[i][j]));
            }
        }
        return sb.toString();
    }
}
