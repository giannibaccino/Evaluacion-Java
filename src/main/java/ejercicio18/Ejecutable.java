package ejercicio18;

import java.util.ArrayList;

public class Ejecutable {
    public static void main(String[] args) {
        ArrayList<Serie> series = new ArrayList<>(5);
        ArrayList<Videojuego> videojuegos = new ArrayList<>(5);

        series.add(new Serie());
        series.add(new Serie());
        series.add(new Serie());
        series.add(new Serie("El Bandidio", "Eduardo Morin"));
        series.add(new Serie("La Escuela", 9, "suspenso", "Manuela Guiron"));

        videojuegos.add(new Videojuego());
        videojuegos.add(new Videojuego());
        videojuegos.add(new Videojuego());
        videojuegos.add(new Videojuego("The Witcher", 65));
        videojuegos.add(new Videojuego("Crash Bandido", 15, "aventura", "Kiko Games"));

        series.get(2).entregar();
        series.get(3).entregar();
        series.get(4).entregar();

        videojuegos.get(2).entregar();
        videojuegos.get(3).entregar();
        videojuegos.get(4).entregar();

        int vjentregados = 0;
        int sentregadas = 0;
        Serie maxtemp = series.get(0);
        Videojuego maxhoras = videojuegos.get(0);

        for(Videojuego elemento : videojuegos) {
            if (maxhoras.compreTo(elemento) > 0)
                maxhoras = elemento;

            if (elemento.isEntregado())
                vjentregados++;
        }

        for(Serie elemento2 : series) {
                if (maxtemp.compreTo(elemento2) > 0)
                    maxtemp = elemento2;

                if (elemento2.isEntregado())
                    sentregadas++;
        }

        System.out.println("Series entregadas: " + sentregadas);
        System.out.println("Serie con mas temporadas: " + maxtemp);
        System.out.println("Videojuegos entregados: " + vjentregados);
        System.out.println("Videojuego con mas horas estimadas: " + maxhoras);
    }
}
