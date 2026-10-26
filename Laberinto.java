import javax.swing.*;

public class Laberinto {
  
  private char [][] laberinto;
  
  public Laberinto (){
    char [][] laberinto = {
      {'x','x','x','x','x','x','x','x','x','x'},
      {'x',' ',' ',' ',' ','x',' ','x','x','x'},
      {'x',' ','x','x','x','x',' ','x','x','x'},
      {'x',' ','x',' ','x','x',' ',' ',' ','x'},
      {'x',' ',' ',' ','x','x',' ','x',' ','x'},
      {'x',' ','x','x','x',' ',' ','x',' ','x'},
      {'x',' ','x',' ',' ',' ','x','x','Q','x'},
      {'x',' ','x',' ','x','x','x',' ','x','x'},
      {'x','R',' ',' ',' ','x',' ',' ','x','x'},
      {'x','x','x','x','x','x','x','x','x','x'}  
    };
    this.laberinto = laberinto;
  }
  
  public void imprimirLaberinto (){
    String contenido = "";
    for (int i = 0; i < 10 ; i++){
      for ( int j = 0 ; j< 10; j++){
        contenido += this.laberinto[i][j]+"\t";
        System.out.print(this.laberinto[i][j] );
      }
      contenido += "\n";
      System.out.println();
    }
    //JOptionPane.showMessageDialog(null,contenido);
    System.out.println();
    System.out.println();
    System.out.println();
  }
  
  public boolean buscarQueso (int coordF, int coordC){
    int [] movC = { 0, 1, 0,-1};// Col
    int [] movF = {-1, 0, 1, 0};// Filas
    boolean retorno = false;

    if (coordF <this.laberinto.length && 
        coordC < this.laberinto[0].length && 
        coordF >= 0 && coordC >=0){

      if (laberinto[coordF][coordC] == ' ' || 
          laberinto[coordF][coordC] == 'R'){ // Marque el camino
        
        if( laberinto[coordF][coordC] == 'R'){
          laberinto[coordF][coordC] = 'r';
        }

        if (laberinto[coordF][coordC] == ' ')
          this.laberinto[coordF][coordC] = '.';

        int i = 0;
        while (i < 4 && !retorno){
          imprimirLaberinto ();
          retorno = this.buscarQueso (coordF+movF[i],coordC+movC[i]);
          i++;
        }
        if (!retorno && this.laberinto[coordF][coordC] !='R'){
          this.laberinto[coordF][coordC] = ' ';
        }
      }
      else{//termina
        if (laberinto[coordF][coordC] == 'Q'){
          retorno = true;
        }
      }
    }
    return retorno; 
  }
  
  public static void main (String argv[])
  {
    Laberinto l = new Laberinto ();
    Boolean resultado = l.buscarQueso(8,1);
    System.out.println(resultado);
    l.imprimirLaberinto();
  }
}