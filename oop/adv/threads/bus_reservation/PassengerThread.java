package javase.oop.adv.threads.bus_reservation;

public class PassengerThread extends Thread{
    private int seatsNeeded;


    public PassengerThread(Runnable target, String name, int seatsNeeded) {
        super(target, name);
        this.seatsNeeded = seatsNeeded;
    }

    public void setSeatsNeeded(int seatsNeeded) {
        this.seatsNeeded = seatsNeeded;
    }

    public int getSeatsNeeded() {
        return seatsNeeded;
    }
}
