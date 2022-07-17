package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentStationNumber;
    private int currentVolume;
    private int numberOfStations = 10;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void nextStation() {
        if (currentStationNumber == numberOfStations - 1) {
            currentStationNumber = 0;
        } else {
            currentStationNumber++;
        }
    }

    public void prevStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = numberOfStations - 1;
        } else {
            currentStationNumber--;
        }
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > numberOfStations - 1) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public void plusVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        }
    }

    public void minusVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }
}