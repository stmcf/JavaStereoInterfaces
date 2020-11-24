public class Stereo implements IConnect {

    private String name;
    private Radio radio;
    private CDPlayer cdPlayer;
    private Device device;
    private int volume;

    public Stereo(String name, Radio radio, CDPlayer cdPlayer){
        this.name = name;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.volume = 0;
    }

    public int getVolume(){
        return this.volume;
    }

    public void changeVolume(int changeLevel) {
            this.volume += changeLevel;
            if (this.volume < 0){
                this.volume = 0;
            }
    }
    @Override
    public String connect(Device device) {
        return "Connected to " +device;
    }
}
