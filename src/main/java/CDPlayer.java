public class CDPlayer extends Component {

    private int CDCapacity;
    private int cdsInPlayer;

    public CDPlayer(String make, String model, int CDCapacity) {
        super(make, model);
        this.CDCapacity = CDCapacity;
        cdsInPlayer = 0;
    }

    public void addCD(int numberOfCDsToAdd) {
        if (this.cdsInPlayer < this.CDCapacity) {
            this.cdsInPlayer += numberOfCDsToAdd;
        }
    }

    public int getNumberOfCDs(){
        return this.cdsInPlayer;
    }
}
