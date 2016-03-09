package uni.sistemas.controller;

import uni.sistemas.entity.Area;
import uni.sistemas.model.AreaModel;

public class AreaController {

    //Constructor
    public AreaController() {
    }
    // creando objetos
    AreaModel am = new AreaModel();

    //Generando procesos
    public void procesar(Area a) {
        am.calcularResultado(a);
        am.compararResultado(a);

    }

}
