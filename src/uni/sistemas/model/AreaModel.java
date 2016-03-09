
package uni.sistemas.model;

import java.util.Random;
import javax.swing.Timer;

import uni.sistemas.entity.Area;

public class AreaModel {
    //Creandoconstructor
    public AreaModel() {
    }
    //Creacion de metodos
    public void calcularResultado(Area a ){
        a.setRespuesta((a.getBase()*a.getAltura())/2);
    }
    public void compararResultado(Area a){
        if(a.getRespuesta() == a.getInput()){
            a.setOut("Su respuesta es Correcta");
            
        }else{
            a.setOut("Su respuesta es Incorrecta");
        }
    }
    
}
