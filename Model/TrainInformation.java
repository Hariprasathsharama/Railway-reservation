package Model;


public class TrainInformation {
    private int trainNo;
    private String departure;
    private String arrival;
    private int upperberthSeat;
    private int lowerberthSeat;
    private int middleberthSeat;
    private int racberthSeat;
    private int waitingList;
    private int upperberthCost;
    private int lowerberthCost;
    private int middleberthCost;
    private int racberthCost;
    private int waitingListCost;
    


        
    public TrainInformation() {

    }
    
    public TrainInformation(int trainNo, String departure, String arrival, int upperberthSeat, int lowerberthSeat,
            int middleberthSeat, int racberthSeat, int waitingList, int upperberthCost, int lowerberthCost,
            int middleberthCost, int racberthCost, int waitingListCost) {
        this.trainNo = trainNo;
        this.departure = departure;
        this.arrival = arrival;
        this.upperberthSeat = upperberthSeat;
        this.lowerberthSeat = lowerberthSeat;
        this.middleberthSeat = middleberthSeat;
        this.racberthSeat = racberthSeat;
        this.waitingList = waitingList;
        this.upperberthCost = upperberthCost;
        this.lowerberthCost = lowerberthCost;
        this.middleberthCost = middleberthCost;
        this.racberthCost = racberthCost;
        this.waitingListCost = waitingListCost;
    }

    public int getTrainNo() {
        return trainNo;
    }
    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }
   
    public int getupperberthSeat() {
        return upperberthSeat;
    }
    public void setupperberthSeat(int upperberthSeat) {
        this.upperberthSeat = upperberthSeat;
    }
    public int getlowerberthSeat() {
        return lowerberthSeat;
    }
    public void setlowerberthSeat(int lowerberthSeat) {
        this.lowerberthSeat = lowerberthSeat;
    }
    public int getmiddleberthSeat() {
        return middleberthSeat;
    }
    public void setmiddleberthSeat(int middleberthSeat) {
        this.middleberthSeat = middleberthSeat;
    }
    public int getracberthSeat() {
        return racberthSeat;
    }
    public void setracberthSeat(int racberthSeat) {
        this.racberthSeat = racberthSeat;
    }
    public int getWaitingList() {
        return waitingList;
    }
    public void setWaitingList(int waitingList) {
        this.waitingList = waitingList;
    }
    public String getDeparture() {
        return departure;
    }
    public void setDeparture(String departure) {
        this.departure = departure;
    }
    public String getArrival() {
        return arrival;
    }
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public int getUpperberthSeat() {
        return upperberthSeat;
    }

    public void setUpperberthSeat(int upperberthSeat) {
        this.upperberthSeat = upperberthSeat;
    }

    public int getLowerberthSeat() {
        return lowerberthSeat;
    }

    public void setLowerberthSeat(int lowerberthSeat) {
        this.lowerberthSeat = lowerberthSeat;
    }

    public int getMiddleberthSeat() {
        return middleberthSeat;
    }

    public void setMiddleberthSeat(int middleberthSeat) {
        this.middleberthSeat = middleberthSeat;
    }

    public int getRacberthSeat() {
        return racberthSeat;
    }

    public void setRacberthSeat(int racberthSeat) {
        this.racberthSeat = racberthSeat;
    }

    public int getUpperberthCost() {
        return upperberthCost;
    }

    public void setUpperberthCost(int upperberthCost) {
        this.upperberthCost = upperberthCost;
    }

    public int getLowerberthCost() {
        return lowerberthCost;
    }

    public void setLowerberthCost(int lowerberthCost) {
        this.lowerberthCost = lowerberthCost;
    }

    public int getMiddleberthCost() {
        return middleberthCost;
    }

    public void setMiddleberthCost(int middleberthCost) {
        this.middleberthCost = middleberthCost;
    }

    public int getRacberthCost() {
        return racberthCost;
    }

    public void setRacberthCost(int racberthCost) {
        this.racberthCost = racberthCost;
    }

    public int getWaitingListCost() {
        return waitingListCost;
    }

    public void setWaitingListCost(int waitingListCost) {
        this.waitingListCost = waitingListCost;
    }

    
}