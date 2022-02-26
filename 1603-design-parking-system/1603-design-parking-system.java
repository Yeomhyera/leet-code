class ParkingSystem {
    int[] park = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        park[0] = big;
        park[1] = medium;
        park[2] = small;
    }
    public boolean addCar(int carType) {
        if (carType == 1) {
            if (park[0] > 0) {
                park[0]--;
                return true;
            } else {
                return false;
            }
        } else if (carType == 2) {
            if (park[1] > 0) {
                park[1]--;
                return true;
            } else {
                return false;
            }
        } else {
            if (park[2] > 0) {
                park[2]--;
                return true;
            } else {
                return false;
            }
        }
    }
}