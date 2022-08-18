package ru.netology.radio;

public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation = minRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int size) {
        this.maxRadioStation = this.minRadioStation + size;

    }

    public Radio() {
        maxRadioStation = minRadioStation + 9;
        maxVolume = minVolume + 100;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            setCurrentVolume(currentVolume);
        } else {
            return;
        }
    }

    public void downVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume = currentVolume - 1;
            setCurrentVolume(currentVolume);

        }
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            int nextRadioStation = currentRadioStation + 1;
            setCurrentRadioStation(nextRadioStation);
        } else {
            setCurrentRadioStation(minRadioStation);
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            setCurrentRadioStation(getMaxRadioStation());
        } else {
            int prevRadioStation = currentRadioStation - 1;
            setCurrentRadioStation(prevRadioStation);
        }

    }
}
