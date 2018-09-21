package musicpack;

public class PopSong
{
    //properties
    private float length ;
    public String key ;
    private int tempo ;
    public String[] form ;
    protected String[] ensemble ;

    //constructor
    public PopSong(float length, String key, int tempo, String[] form, String[] ensemble)
    {
        this.length = length ;
        this.key = key ;
        this.tempo = tempo ;
        this.form = form ;
        this.ensemble = ensemble ;
    }

    //"default" constructor
    public PopSong()
    {
        this.length = 2.25F ;
        this.key = "G" ;
        this.tempo = 90 ;
        this.form = new String[]{"verse", "chorus", "verse", "bridge", "chorus"} ;
        this.ensemble = new String[]{"vox", "guitar", "bass", "drums"} ;
    }

    //setters n getters
    public float getLength()
    {
        return length;
    }
    public void setLength(float songLength)
    {
        length = songLength ;
    }
    public int getTempo()
    {
        return tempo ;
    }
    public void setTempo(int songTemp)
    {
        tempo = songTemp ;
    }

    //methods
    public float lengthOfSong()
    {
        return form.length * 64 / tempo ;
    }

    private static boolean songIsBasicAsFuck(String key, int tempo)
    {
        if(key.equals("G") && tempo==90) return true ;
        else return false ;
    }

    public void songReview(String name)
    {
        System.out.println("It is " + PopSong.songIsBasicAsFuck(key, tempo) + " that " + name + " is basic as fuck.");
    }
}