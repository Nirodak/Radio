import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;
import static org.junit.jupiter.api.Assertions.*;

public class TestRadio {
    Radio rad = new Radio();
    @Test
    public void setOverMaxRadioStation() {

        rad.setCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setOverMinRadioStation() {

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setRadioStation() {

        rad.setCurrentRadioStation(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNextStation() {

        rad.setCurrentRadioStation(6);
        rad.next();

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setOverMaxNextStation() {

        rad.setCurrentRadioStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setOverMinPrevStation() {

        rad.setCurrentRadioStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStation() {

        rad.setCurrentRadioStation(9);
        rad.prev();
        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDownVolume() {

        rad.setCurrentVolume(10);
        rad.down();
        int expected = 9;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setOverMinDownVolume() {

        rad.setCurrentVolume(0);
        rad.down();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setIncreaseVolume() {

        rad.setCurrentVolume(2);
        rad.increase();
        int expected = 3;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setOverMaxIncreaseVolume() {

        rad.setCurrentVolume(10);
        rad.increase();
        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setOverMaxVolume() {

        rad.setCurrentVolume(12);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setOverMinVolume() {

        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void setVolume() {

        rad.setCurrentVolume(5);
        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
