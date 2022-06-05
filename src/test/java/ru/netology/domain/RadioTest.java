package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/minmaxnumber.csv"})
    void findMinMaxCurrentNumberDefault(int currentNumber, int expected) {
        Radio rad = new Radio();
        rad.setCurrentNumber(currentNumber);
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/minmaxnumber1.csv"})
    void findMinMaxCurrentNumberNotDefault(int currentNumber, int expected) {
        Radio rad = new Radio(30);
        rad.setCurrentNumber(currentNumber);
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/nextnumber.csv"})
    void nextCurrentNumberDefault(int currentNumber, int expected) {
        Radio rad = new Radio();
        rad.setCurrentNumber(currentNumber);
        rad.nextCurrentNumber();
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/nextnumber1.csv"})
    void nextCurrentNumberNotDefault(int currentNumber, int expected) {
        Radio rad = new Radio(30);
        rad.setCurrentNumber(currentNumber);
        rad.nextCurrentNumber();
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/prevnumber.csv"})
    void prevCurrentNumberDefault(int currentNumber, int expected) {
        Radio rad = new Radio();
        rad.setCurrentNumber(currentNumber);
        rad.prevCurrentNumber();
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/prevnumber1.csv"})
    void prevCurrentNumberNotDefault(int currentNumber, int expected) {
        Radio rad = new Radio(30);
        rad.setCurrentNumber(currentNumber);
        rad.prevCurrentNumber();
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/minmaxvolume.csv"})
    void findMinMaxVolumeDefault(int currentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(currentVolume);
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/minmaxvolume.csv"})
    void findMinMaxVolumeNotDefault(int currentVolume, int expected) {
        Radio rad = new Radio(30);
        rad.setCurrentVolume(currentVolume);
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/increasevolume.csv"})
    void increseVolumeDefault(int currentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(currentVolume);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/increasevolume.csv"})
    void increseVolumeNotDefault(int currentVolume, int expected) {
        Radio rad = new Radio(30);
        rad.setCurrentVolume(currentVolume);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/turndownvolume.csv"})
    void turnDownVolumeDefoult(int currentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(currentVolume);
        rad.turnDownVolume();
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/turndownvolume.csv"})
    void turnDownVolumeNotDefoult(int currentVolume, int expected) {
        Radio rad = new Radio(30);
        rad.setCurrentVolume(currentVolume);
        rad.turnDownVolume();
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
