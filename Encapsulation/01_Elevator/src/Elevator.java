public class Elevator {
    private int currentFloor = 1;
    private int minFloor = 0;
    private int maxFloor = 0;

    private void print(int currentFloor) {
        System.out.println(" Текущий этаж - " + currentFloor + "");
    }

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    private void moveDown(int currentFloor) {
        this.currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        print(currentFloor);
    }

    private void moveUp(int currentFloor) {
        this.currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        print(currentFloor);
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Введен неверный этаж ");
            return;
        }
        if (floor == currentFloor) {
            return;
        }

        if (currentFloor > floor) {
            while (currentFloor > floor) {
                moveDown(currentFloor);
            }
        }
        if (currentFloor < floor) {
            while (currentFloor < floor) {
                moveUp(currentFloor);
            }
        }
        print(currentFloor);
        getCurrentFloor();
    }

    public int getCurrentFloor() {
        return currentFloor;

    }
}
