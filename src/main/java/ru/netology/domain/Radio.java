package ru.netology.domain;

public class Radio {
    private int currentStationNumber;
    private int currentVolume;

    public void nextStation() {
        if (currentStationNumber == 9) {
            currentStationNumber = 0;
        } else {
            currentStationNumber++;
        }
    }

    public void prevStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = 9;
        } else {
            currentStationNumber--;
        }
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > 9) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void plusVolume() {
        if (currentVolume != 10) {
            currentVolume++;
        }
    }

    public void minusVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
