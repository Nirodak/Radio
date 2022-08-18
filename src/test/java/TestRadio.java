import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class TestRadio {
    Radio rad = new Radio();

    @Test
    public void setOverMaxRadioStation() {

        rad.setCurrentRadioStation(rad.getMaxRadioStation() + 1);

        Assertions.assertEquals(rad.getMinRadioStation(), rad.getCurrentRadioStation());
    }

    @Test
    public void setOverMinRadioStation() {

        rad.setCurrentRadioStation(rad.getMinRadioStation()-1);

        Assertions.assertEquals(rad.getMinRadioStation(), rad.getCurrentRadioStation());

    }

    @Test
    public void setRadioStation() {

        rad.setCurrentRadioStation(5);

        Assertions.assertEquals(5, rad.getCurrentRadioStation());

    }

    @Test
    public void setNextStation() {

        rad.setCurrentRadioStation(6);
        rad.nextRadioStation();

        Assertions.assertEquals(7, rad.getCurrentRadioStation());

    }

    @Test
    public void setOverMaxNextStation() {

        rad.setCurrentRadioStation(rad.getMaxRadioStation());
        rad.nextRadioStation();

        Assertions.assertEquals(rad.getMinRadioStation(), rad.getCurrentRadioStation());

    }

    @Test
    public void setOverMinPrevStation() {

        rad.setCurrentRadioStation(rad.getMinRadioStation());
        rad.prevRadioStation();

        Assertions.assertEquals(rad.getMaxRadioStation(), rad.getCurrentRadioStation());
    }

    @Test
    public void setPrevStation() {

        rad.setCurrentRadioStation(7);
        rad.prevRadioStation();

        Assertions.assertEquals(6, rad.getCurrentRadioStation());
    }

    @Test
    public void setDownVolume() {

        rad.setCurrentVolume(10);
        rad.downVolume();

        Assertions.assertEquals(9, rad.getCurrentVolume());
    }

    @Test
    public void setOverMinDownVolume() {

        rad.setCurrentVolume(rad.getMinVolume());
        rad.downVolume();

        Assertions.assertEquals(rad.getMinVolume(), rad.getCurrentVolume());
    }

    @Test
    public void setIncreaseVolume() {

        rad.setCurrentVolume(2);
        rad.increaseVolume();

        Assertions.assertEquals(3, rad.getCurrentVolume());
    }

    @Test
    public void setOverMaxIncreaseVolume() {

        rad.setCurrentVolume(rad.getMaxVolume());
        rad.increaseVolume();

        Assertions.assertEquals(rad.getMaxVolume(), rad.getCurrentVolume());
    }

    @Test
    public void setOverMaxVolume() {

        rad.setCurrentVolume(rad.getMaxVolume()+1);


        Assertions.assertEquals(rad.getMinVolume(), rad.getCurrentVolume());

    }

    @Test
    public void setOverMinVolume() {

        rad.setCurrentVolume(rad.getMinVolume()-1);

        Assertions.assertEquals(rad.getMinVolume(), rad.getCurrentVolume());

    }

    @Test
    public void setVolume() {

        rad.setCurrentVolume(5);

        Assertions.assertEquals(5, rad.getCurrentVolume());
    }

    @Test
    public void setRadioStation30 (){

    Radio radio = new Radio(30);
    radio.setCurrentRadioStation(21);

    Assertions.assertEquals(21, radio.getCurrentRadioStation());
    };
    @Test
    public void setNextOverMaxRadioStation30(){

        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.nextRadioStation();

        Assertions.assertEquals(radio.getMinRadioStation(),radio.getCurrentRadioStation());
    }
    @Test
    public void setPrevOverMinRadioStation30(){

        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        radio.prevRadioStation();

        Assertions.assertEquals(radio.getMaxRadioStation(),radio.getCurrentRadioStation());
    }
}
