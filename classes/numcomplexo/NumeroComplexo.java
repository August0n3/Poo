package classes.numcomplexo;

public class NumeroComplexo {
    private int parteComplexa;
    private int parteReal;

    NumeroComplexo() {
        this.parteComplexa = 0;
        this.parteReal = 0;
    }

    NumeroComplexo(int parteReal) {
        this.parteComplexa = 0;
        this.parteReal = parteReal;
    }
    
    
    NumeroComplexo(int parteComplexa, int parteReal) {
        this.parteComplexa = parteComplexa;
        this.parteReal = parteReal;
    }

    public String toString() {
        if (this.parteComplexa ==0 ){
            return (""+this.parteReal);
        }else{
            if (this.parteReal ==0 ){
                return (this.parteComplexa+"i");
            }else if (this.parteReal >0 ){
                return (this.parteComplexa+"i+"+this.parteReal);
            }else{
                return (this.parteComplexa+"i"+this.parteReal);
            }
        }
    }
}