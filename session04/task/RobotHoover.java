package session04.task;

public class RobotHoover {

    // in range 0-100
    private int stateOfCharge;

    // 0: tiled floor; 1: carpet; 2: parquet floor
    private int flooring;

    // TODO Aufgabe 5: moppingAllowed mithilfe eines switch-case Block implementieren
    boolean moppingAllowed() {
        // replace with your implementation
        return false;
    }
    
    void chargingAction() {
        if (stateOfCharge >= 90) {
            System.out.println("Stop charging");
        } else if (stateOfCharge >= 80) {
            System.out.println("Reduce charging power");
        } else if (stateOfCharge < 30) {
            if (stateOfCharge < 10) {
                System.out.println("Reduce charging power");
            }
            System.out.println("Start charging");
        } else {
            System.out.println("Wait");
        }
    }

    // TODO Aufgabe 6: übersetzen Sie die Methode chargingAction() in einen switch-case Block
    void chargingActionSwitch() {

    }

    public int getStateOfCharge() {
        return stateOfCharge;
    }

    public void setStateOfCharge(int stateOfCharge) {
        this.stateOfCharge = stateOfCharge;
    }

    public int getFlooring() {
        return flooring;
    }

    public void setFlooring(int flooring) {
        this.flooring = flooring;
    }
}
