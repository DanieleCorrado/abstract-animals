package org.lesson.java.dispositivo;

public class Creator {

    public Device create(String tipoDispositivo) {
        if (tipoDispositivo.equals("1")) {
            return new Dvd();
        } else {
            return new Playstation();
        }
    }

}
