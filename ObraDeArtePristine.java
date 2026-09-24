import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.JFrame;

public class ObraDeArtePristine {
  
  private static final int ANCHO = 1200;
  private static final int ALTO = 900;
  private static final int MIN = 2;
  private static final int MAX = 6;
  private static final int SUBMATRIZ = 100;
  
  private int[][] dibujo = null;
  
  JFrame f = null;
  
  private BufferedImage imagen = null;
  
  public ObraDeArtePristine(){
    
    imagen = new BufferedImage(ANCHO,ALTO,BufferedImage.TYPE_INT_RGB);
    
    getDibujo();

    for(int i=0;i<ANCHO;i++){
      for(int j=0;j<ALTO;j++){
        
        switch (dibujo[i][j]) {
          case 0:
            imagen.setRGB(i, j, Color.WHITE.getRGB());
            break;
          case 1:
            imagen.setRGB(i, j, Color.BLACK.getRGB());
            break;
          case 2:
            imagen.setRGB(i, j, Color.RED.getRGB());
            break;
          case 3:
            imagen.setRGB(i, j, Color.BLUE.getRGB());
            break;
          case 4:
            imagen.setRGB(i, j, Color.YELLOW.getRGB());
            break;
          default:
            imagen.setRGB(i, j, Color.GREEN.getRGB());
        } //switch
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
  
  public void getDibujo(){
    dibujo = new int[ANCHO][ALTO];
    int aleatorio = 0;
    for(int i=0 ; i<ANCHO; i+=SUBMATRIZ){
      
        aleatorio = MIN + (int)(Math.random() * (MAX - MIN));
        for (int k = 0; k < SUBMATRIZ; k++) {
          for (int m = 0; m < ALTO; m++) {
            dibujo[k+i][m] = aleatorio; 
          }
        }
    }
  } //getdibujo
  
  public static void main(String[] args){
    ObraDeArtePristine o = new ObraDeArtePristine();
  }
}