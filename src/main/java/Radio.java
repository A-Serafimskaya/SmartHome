public class Radio {

    // работа с радиостанциями

    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

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

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    // работа с уровнем звука

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseCurrentVolumeBy1() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 100;
    }

    public void reduceCurrentVolumeBy1() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else currentVolume = 0;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }
}
