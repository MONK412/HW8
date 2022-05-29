package ru.netology.domain;

public class Radio {
    private int number;
    private int currentVolume;

    public void setNumber(int number) {
        if (number < 0) {
            return;
        }
        if (number > 9) {
            return;
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void nextNumber() {
        if (number < 9) {
            number = number + 1;
        }
        else {
            number = 0;
        }
    }

    public void prevNumber() {
        if (number > 0) {
            number = number - 1;
        }
        else {
            number = 9;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
