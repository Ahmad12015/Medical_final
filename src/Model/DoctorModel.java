package Model;

import java.util.List;
import java.util.Observable;

public class DoctorModel extends Observable{
    private List<Doctor> credit;

    public List<Doctor> getCredits() {
        return credit;
    }

    public void setCredits(List<Doctor> credit) {
        this.credit = credit;
        setChanged();
        notifyObservers();
    }
    
}
