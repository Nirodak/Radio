package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void increase() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            setCurrentVolume(currentVolume);
        } else {
            return;
        }
    }

    public void down() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume = currentVolume - 1;
            setCurrentVolume(currentVolume);

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

    public void next() {
        if (currentRadioStation < 9) {
            int nextRadioStation = currentRadioStation + 1;
            setCurrentRadioStation(nextRadioStation);
        } else {
            setCurrentRadioStation(0);
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            setCurrentRadioStation(9);
        } else {
            int prevRadioStation = currentRadioStation - 1;
            setCurrentRadioStation(prevRadioStation);
        }

    }
}
