package org.lesson.java.dispositivo;

public class Creator {

    // Metodi
    public Device create(String tipoDispositivo) {
        if (tipoDispositivo.equals("1")) {
            return new Dvd();
        } else {
            return new Playstation();
        }
    }

}
