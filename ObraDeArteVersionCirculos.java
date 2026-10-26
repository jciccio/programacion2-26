import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.JFrame;

public class ObraDeArteVersionCirculos {
  
  private static final int ANCHO = 800;
  private static final int ALTO = 800;
  private static final int MIN = 0;
  private static final int MAX = 6;
  private static final int SUBMATRIZ = 5;
  
  private int[][] dibujo = null;
  JFrame f = null;
  
  private BufferedImage imagen = null;
  
  public ObraDeArteVersionCirculos(){
    
    imagen = new BufferedImage(ANCHO,ALTO,BufferedImage.TYPE_INT_RGB);
    dibujo = new int[ANCHO][ALTO];
    System.out.println(Color.WHITE.getRGB());
    //dibujarCirculo(400,400, 200, (0*255 + 1*255*255 + 1*255*255), true);
    dibujarCirculosAleatorios(100, 200);
    //dibujarLinea(100, 200, 400, 500, 255 + 255*255 + 255*255*255);
    for(int i=0;i<ANCHO;i++){
      for(int j=0;j<ALTO;j++){
        imagen.setRGB(i, j, dibujo[i][j]);
      } //for
    } //for
    
    f = new JFrame("Mi obra de arte"){
      public void paint(java.awt.Graphics g){
        g.drawImage(imagen,0,0,null);
      } //paint
    }; //jframe
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(ANCHO,ALTO);
    f.repaint();
    f.setVisible(true);
  }// constructor
  
  public void dibujarLinea(int desdeX, int hastaX, int desdeY, int hastaY){
    for(int i = desdeX; i< hastaX; i++){
      for(int j = desdeY; j < hastaY; j++){
        dibujo[i][j] = 1;
      }      
    }
  }
  // x y y representan los puntos iniciales del ciculo
  // el radio para saber la dimension
  public void dibujarCirculo(int x, int y, int radio , int color , boolean rellenos){
    double x1, y1;
    for (double angulo = 0; angulo < 360; angulo += 0.01){
      x1 = radio * Math.cos(angulo * Math.PI / 180); 
      y1 = radio * Math.sin(angulo * Math.PI / 180);

      int posXFinal = (int) (x+ x1);
      int posYFinal = (int) (y+ y1);
      if(x + x1 < dibujo.length && 
        y + y1 < dibujo[0].length &&
        x+x1 >= 0 && y+y1 >=0){
        if(rellenos){
          dibujarLinea(x,y,posXFinal, posYFinal, color);
          dibujo[posXFinal][posYFinal] = 1929393;  
        }
        else{
          dibujo[posXFinal][posYFinal] = color;  
        } 
      }
    }
  }

  public void dibujarCirculosAleatorios(int cantidad, int tamMaximo){
    for(int i = 0 ; i < cantidad; i++){
      int tamMedios = tamMaximo / 2 + 1 ;
      int xPos = (int)(Math.random() * (ANCHO - tamMaximo) + tamMedios);
      int yPos = (int)(Math.random() * (ALTO - tamMaximo) + tamMedios);
      int color = (int) (Math.random() * (255 + 255*255 + 255*255*255));
      dibujarCirculo(xPos,yPos, tamMaximo/2, color, true);
    }
  }

  public void dibujarLinea(int fI, int cI, int fF, int cF, int color){
    int fInicialCopia = fI < fF ? fI : fF;
    fF = fI > fF ? fI : fF;
    fI =fInicialCopia;

    int cICopia = cI < cF ? cI : cF;
    cF = cI > cF ? cI : cF;
    cI = cICopia;


    for(int f = fI; f < fF ; f++){
      for(int c = cI; c < cF; c++){
        dibujo[f][c] = (color);
        
      }
    }

  }

  public static void main(String[] args){
    ObraDeArteVersionCirculos o = new ObraDeArteVersionCirculos();
  }
}