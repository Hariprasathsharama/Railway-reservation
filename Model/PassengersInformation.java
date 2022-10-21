package Model;

public class PassengersInformation {
    String name;
    byte age;
    String gender;
    String trainexpress;
    String berthPreference;
    int ticketNumber;
    int ticketCost;
    
    public PassengersInformation(String name, byte age, String gender, String trainexpress, String berthPreference,
            int ticketNumber, int ticketCost) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.trainexpress = trainexpress;
        this.berthPreference = berthPreference;
        this.ticketNumber = ticketNumber;
        this.ticketCost = ticketCost;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getTrainexpress() {
        return trainexpress;
    }
    public void setTrainexpress(String trainexpress) {
        this.trainexpress = trainexpress;
    }
    public String getBerthPreference() {
        return berthPreference;
    }
    public void setBerthPreference(String berthPreference) {
        this.berthPreference = berthPreference;
    }
    public int getTicketNumber() {
        return ticketNumber;
    }
    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    public int getTicketCost() {
        return ticketCost;
    }
    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }
    
}
