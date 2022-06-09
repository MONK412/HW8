package ru.netology.domain;

public class Radio {
    private int currentNumber;
    private int minCurrentNumber;
    private int numberOfStations;
    private int maxCurrentNumber = 9;
    private int currentVolume;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        int maxCurrentNumber = numberOfStations - 1;
        this.maxCurrentNumber = maxCurrentNumber;
    }

    public Radio() {
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < minCurrentNumber) {
            return;
        }
        if (currentNumber > maxCurrentNumber) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void nextCurrentNumber() {
        if (currentNumber < maxCurrentNumber) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = 0;
        }
    }

    public void prevCurrentNumber() {
        if (currentNumber > minCurrentNumber) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = maxCurrentNumber;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
