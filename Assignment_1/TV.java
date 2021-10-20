class Tv
{
    int channel;
    int lastChannel=120;
    int voluneLevel=0;
    boolean on=true;
    public Tv()
    {
        
    }
    public void turnOn()
    {
        if (on)
        {
           System.out.println("TV is ON");
        }
    }
    public void turnOff()
    {
        if (on==false)
        {
            System.out.println("TV is Off");
        }
    }
    public void setChannel(int newchannel)
    {
       System.out.println(newchannel=lastChannel+1);
    }
    public void setVolume(int newVolume)
    {
         System.out.println(volumeLevel++);
    }
    public void channelUp()
    {
         System.out.println(channel=channel+1);
    }
     public void channelDown()
    {
         System.out.println(channel=channel-1);
    }
    public void volumeUp()
    {
         System.out.println(volumeLevel++);
    }
     public void volumeDown()
    {
         System.out.println(volumeLevel--);
    }
}