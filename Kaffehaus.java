//$PKGLINE
import processing.core.PApplet;

/**
 * Klasse Kaffehaus.
 * Beschreibung: Template einer Processing Klasse. Kopieren und "Kaffehaus" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffehaus extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(1200,800); //Fenstergröße 640 auf 400 px
    }        
    int s = 40;
    int[] abstände={10,20,30,20,10,20,30,20,10,20,30,20,10,20,30,20,10,20,30,20,10,20,30};
    public void parallelen()
    {  
        stroke(180);
        for (int i=0; i<20; i++)
        {
            line(0, i*s, 1200, i*s);
        } 
    }

    public void zeichneQuadrate(){
        fill(0);
        for(int j=0; j<18; j++){
            for(int i=0; i<18; i++){
                rect(abstände[j+0]+2*s*i,j*s,s,s);
                rect(abstände[j+1]+2*s*i,(j+1)*s,s,s);
                rect(abstände[j+2]+2*s*i,(j+2)*s,s,s);
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
        background(255);
        parallelen();
        zeichneQuadrate();
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
        PApplet.main(new String[] {Kaffehaus.class.getName() });
    }

}
