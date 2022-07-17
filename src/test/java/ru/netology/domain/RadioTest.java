package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/dataCurrentStation.csv")
    void setCurrentStationNumberTest(int input, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(input);
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataCurrentStationWithSpecificNumOfStations.csv")
    void setCurrentStationNumberTestWithSpecificNumOfStations(int numberOfStations, int input, int expected) {
        Radio radio = new Radio (numberOfStations);

        radio.setCurrentStationNumber(input);
        int actual = radio.getCurrentStationNumber();

        assertEquals (expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataNextStation.csv")
    void nextStationTest(int input, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(input);
        radio.nextStation();
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataNextStationWithSpecificNumOfStations.csv")
    void nextStationTestWithSpecificNumOfStations(int numberOfStations, int input, int expected) {
        Radio radio = new Radio(numberOfStations);

        radio.setCurrentStationNumber(input);
        radio.nextStation();
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @CsvFileSource(resources = "/dataPrevStation.csv")
    void prevStationTest(int input, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(input);
        radio.prevStation();
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataPrevStationWithSpecificNumOfStations.csv")
    void prevStationTestWithSpecificNumOfStations(int numberOfStations, int input, int expected) {
        Radio radio = new Radio(numberOfStations);

        radio.setCurrentStationNumber(input);
        radio.prevStation();
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void plusMinusVolumeTest() {
        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentVolume());
        for (int newVolume = 1; newVolume <= 100; newVolume++) {
            radio.plusVolume();
            int actual = radio.getCurrentVolume();
            assertEquals(newVolume, actual);
        }
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
        for (int newVolume = 99; newVolume >= 0; newVolume--) {
            radio.minusVolume();
            int actual = radio.getCurrentVolume();
            assertEquals(newVolume, actual);
        }
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}