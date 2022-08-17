import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;
import static org.junit.jupiter.api.Assertions.*;

public class TestRadio {
    @Test
    public void setOverMaxRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setOverMinRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNextStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(6);
        rad.next();

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setOverMaxNextStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setOverMinPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.prev();
        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDownVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.down();
        int expected = 9;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setOverMinDownVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.down();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(2);
        rad.increase();
        int expected = 3;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setOverMaxIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.increase();
        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setOverMaxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(12);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setOverMinVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void setVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
