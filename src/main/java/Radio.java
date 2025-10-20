public class Radio {

    public int currentRadioStation;

//    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

//    public int getCurrentVolume() {
//        return currentVolume;
//    }

    public void switchRadioStationNext() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void switchRadioStationPrev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;

        }
    }

//    public void increaseVolumeNext() {
//        if (currentVolume < 100) {
//            currentVolume = currentVolume + 1;
//        }
//        else currentVolume = 100;
//        }
//    }
//
//    public void reduceVolumeNext() {
//        if (currentVolume > 0) {
//            currentVolume = currentVolume - 1;
//        }
//        if (currentVolume = 0) {
//            currentVolume = 0;
//        }
//    }

//    public void setCurrentVolume(int newCurrentVolume) {
//        if (newCurrentVolume < 0) {
//            return;
//        }
//        if (newCurrentVolume > 100) {
//            return;
//        }
//        currentVolume = newCurrentVolume;
//    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


}
