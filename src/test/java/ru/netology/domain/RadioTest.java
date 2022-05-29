package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdataMinMaxNumber.csv"})
    void findMinMaxNumber(int number, int expected) {
        Radio rad = new Radio();
        rad.setNumber(number);
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdataNextNumber.csv"})
    void nextNumber(int number, int expected) {
        Radio rad = new Radio();
        rad.setNumber(number);
        rad.nextNumber();
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdataPrevNumber.csv"})
    void prevNumber(int number, int expected) {
        Radio rad = new Radio();
        rad.setNumber(number);
        rad.prevNumber();
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdataMinMaxVolume.csv"})
    void findMinMaxVolume(int currentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(currentVolume);
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdataIncreaseVolume.csv"})
    void increseVolume(int currentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(currentVolume);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdataTurnDownVolume.csv"})
    void turnDownVolume(int currentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(currentVolume);
        rad.turnDownVolume();
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
