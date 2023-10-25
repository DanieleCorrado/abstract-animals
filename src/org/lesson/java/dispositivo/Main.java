package org.lesson.java.dispositivo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Che dispositivo vuoi creare? 1 = dvd 2 = playstation ");
        String tipoDispositivo = scanner.nextLine();

        Creator creator = new Creator();
        Device dispositivo;

    switch (tipoDispositivo) {
        case "1", "2":
            dispositivo = creator.create(tipoDispositivo);
            dispositivo.play();
            dispositivo.stop();
            break;
        default:
            System.out.println("Scelta non valida!");
            break;
    }

    }
}
