
package fecha;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author 203p01
 */
public class Fecha {

    int dia,mes,año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public Fecha(){
        Calendar c=new GregorianCalendar();
        dia=c.get(Calendar.DAY_OF_MONTH);
        mes=c.get(Calendar.MONTH);
        año=c.get(Calendar.YEAR);
    }
    
    
}
