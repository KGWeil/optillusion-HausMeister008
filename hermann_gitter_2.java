//$PKGLINE
import processing.core.PApplet;

/**
 * Klasse hermann_gitter_1.
 * Beschreibung: Template einer Processing Klasse. Kopieren und "hermann_gitter_1" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class hermann_gitter_2 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(410,410);
    }        
    public int s=50;
    public int a=10;    
    public void quadrate(){
        fill(0);
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                rect(j*s + j*a,i*s + i*a,s,s);
            }
        }
    }
    public void kreise(){
        fill(255);
        stroke(255);
        for(int j=1; j<7; j++){
            for(int i=1; i<7; i++){
                ellipse(i*(s+a)-5,j*(s+a)-5, a,a);
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
        background(0, 248, 252);
        quadrate();
        kreise();
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
        PApplet.main(new String[] {hermann_gitter_2.class.getName() });
    }

}
