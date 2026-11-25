package controllers;

import java.util.List;
import java.util.Objects;
import models.Incidente;

public class IncidenteController {

    public List<Incidente> sort(List<Incidente> incidentes) {
        incidentes.sort(null);
        return incidentes;
    }

    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
        Objects.requireNonNull(incidentes, "incidentes");
        Objects.requireNonNull(objetivo, "objetivo");

        int izquierda = 0;
        int derecha = incidentes.size() - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int comparacion = incidentes.get(medio).compareTo(objetivo);

            if (comparacion == 0) {
                return medio;
            }

            if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1;
    }
}