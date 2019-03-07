package ClassAndObject;

public class TV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(10);
        tv1.channelUp();
        tv1.setVolume(2);
        tv1.volumeUp();
        System.out.println("channel "+tv1.channel+" volume "+tv1.volumeLevel);

    }
int channel ;
    int volumeLevel ;
    boolean on ;
    public TV(){
        this.channel=1;
        this.volumeLevel=1;
        this.on= false;
    }
    public void turnOn() {
        this.on = true;
    }
    public void turnOff(){
        this.on = false;
    }
    public void setChannel(int newChannel){
        if(newChannel>=1 && newChannel<=120) {
            this.channel = newChannel;
        }
        }
      public   void setVolume(int newVolumeLevel){
        if (newVolumeLevel>=1 && newVolumeLevel<=7){
            this.volumeLevel= newVolumeLevel;
        }
    }
    public void channelUp(){
        if(this.on && this.channel<120){
            this.channel++;
        }
    }
    public void channelDown() {
        if(this.on && this.channel>1){
            this.channel--;
        }
    }
    public void volumeUp(){
        if (this.on && this.volumeLevel<7 ){
            this.volumeLevel++;
        }
    }
    public void volumeDown(){
        if (this.on && this.volumeLevel>1){
            this.volumeLevel--;
        }
    }
}
