 //$PKGLINE
import processing.core.PApplet;

/**
 * Klasse Wellen1.
 * Beschreibung: Template einer Processing Klasse. Kopieren und "Wellen1" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(440,240);
    }        
    
    public void kleineQuadrate(int x, int y, int l){
        fill(255);
        square(x, y, l);
    }
    
    public void Kreise(int xk, int reihe){
        if(reihe == 1){
            for(int k = 0; k<8; k++){
                for(int l = 0; l<2; l++){
                    fill((k%2)*255);
                    circle(k*50+xk, l*100+30, 10);
                    circle(k*50+xk, l*100+60, 10);
            }
        }
    }else{
                for(int j = 0; j<8; j++){
                    for(int i = 0; i<2; i++){
                        fill((j+1)%2*255);
                        circle(j*50+xk, i*100+30+50, 10);
                        circle(j*50+xk, i*100+60+50, 10);
                }
        }
    }
  }
  public void greenlines(){
        for(int i = 1; i<4; i++){
            stroke(0,255,0);
            line(20,i*50+19,420, i*50+19);
            line(20,i*50+20,420, i*50+20);
            line(20,i*50+21,420, i*50+21);
        }
    }
    public void zeichneQuadrate(){
        for(int h = 0; h<2; h++){
            for(int i = 0; i<4; i++){
                int a = 20;
                int x = 100*i+a;
                int y = 100*h+a;
                int l = 100;
                int l2 = 50;
                fill(0);
                square(x,y,l);
                for(int j = 0; j<2; j++){
                    kleineQuadrate(x+l2*j, y+l2*j, l2);
                    if(h == 0){
                        Kreise(a+10, 1);
                    }
                    else{
                        Kreise(a+40, 2);
                    }
            }
        }
    }
  }
    
    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255,100,0);
        zeichneQuadrate();
        greenlines();
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */ 
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen1.class.getName() });
    }

}
