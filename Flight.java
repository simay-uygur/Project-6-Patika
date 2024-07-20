public class Flight {
    
    private int id;
    private Airport startFlight;
    private Airport endFlight;
    private int hourTakeOff;
    private int hourLanding;
    private MainPilot mainPilot;
    private CoPilot coPilot;

    public void takeOff(){
        System.out.println("The flight is taking off");
    }
    public void land(){
        System.out.println("The flight is landing");
    }
    public void fly(){
        System.out.println("The flight is flying");
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Airport getStartFlight() {
        return startFlight;
    }
    public void setStartFlight(Airport startFlight) {
        this.startFlight = startFlight;
    }
    public Airport getEndFlight() {
        return endFlight;
    }
    public void setEndFlight(Airport endFlight) {
        this.endFlight = endFlight;
    }
    public int getHourTakeOff() {
        return hourTakeOff;
    }
    public void setHourTakeOff(int hourTakeOff) {
        this.hourTakeOff = hourTakeOff;
    }
    public int getHourLanding() {
        return hourLanding;
    }
    public void setHourLanding(int hourLanding) {
        this.hourLanding = hourLanding;
    }
    public MainPilot getMainPilot() {
        return mainPilot;
    }
    public void setMainPilot(MainPilot mainPilot) {
        this.mainPilot = mainPilot;
    }
    public CoPilot getCoPilot() {
        return coPilot;
    }
    public void setCoPilot(CoPilot coPilot) {
        this.coPilot = coPilot;
    }





}
