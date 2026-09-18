package Application;

import Gestion.Client;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(
                "Jean", "Yves", LocalDate.of(1995, 6, 6),
                "rue raoul rufeu",
                "jean@mail.com",
"+677899977990"
        );



    }
}
