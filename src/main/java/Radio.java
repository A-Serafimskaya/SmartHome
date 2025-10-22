public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void switchRadioStationNext(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 9) {
            currentRadioStation = newCurrentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void switchRadioStationPrev(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 0) {
            currentRadioStation = newCurrentRadioStation - 1;
        }
        if (newCurrentRadioStation == 0) {
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

    public void increaseCurrentVolumeBy1(int newCurrentVolume) {
        if (0 <= newCurrentVolume && newCurrentVolume < 100) {
            currentVolume = newCurrentVolume + 1;
        } else {
            currentVolume = 0;
        }
    }

    public void reduceCurrentVolumeBy1(int newCurrentVolume) {
        if (0 < newCurrentVolume && newCurrentVolume <= 100) {
            currentVolume = newCurrentVolume - 1;
        } else {
            currentVolume = 0;
        }
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
