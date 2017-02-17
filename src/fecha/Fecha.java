package fecha;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Alberto Marcos Jardon
 */
public class Fecha {

    private int dia;
    private int mes;
    private int año;
    static int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 30, 30, 31, 30, 31};
    static String[] nombresmes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octumbre", "Noviembre", "Dicicembre"};

    /**
     * Metodo constructor que inicializa la fecha a unas valores que se nos
     * envian.
     *
     * @param dia
     * @param mes
     * @param año
     */
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }

    /**
     * Metodo constructor que inicializa los valores a la fecha del istema si no
     * se envian datos.
     */
    public Fecha() {
        Calendar c = new GregorianCalendar();
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = c.get(Calendar.MONTH + 1);
        año = c.get(Calendar.YEAR);
    }

    /**
     * Metodo para calcular si un año enviado es bisiesto y modificar los duas
     * de febrero
     *
     * @param año
     */
    public void bisiesto(int año) {
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            diasMes[1] = 29;
        } else {
            diasMes[1] = 28;
        }
    }

    /**
     * Metodo para calcular si el año actual es bisiesto y modificar los duas de
     * febrero
     */
    public void bisiesto() {
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            diasMes[1] = 29;
        } else {
            diasMes[1] = 28;
        }
    }

    /**
     * Metodo que comprueba que lo introducido es uan fecha real.
     *
     * @param dia numero del dia del mes
     * @param mes numero del mes del año
     * @param año numero con el año
     * @return
     */
    public boolean comprobarFecha(int dia, int mes, int año) {
        boolean correcto = false;
        if (año > 0 && año < 2100) {
            bisiesto(año);
            if (mes > 1 && mes <= 12) {
                if (dia <= diasMes[mes - 1] && dia > 0) {
                    correcto = true;
                    this.dia = dia;
                    this.mes = mes;
                    this.año = año;
                }
            }
        }
        return correcto;
    }

    /**
     * Metodo que calcula si una fecha es mayor, menor o igual que otra.
     * @param f1 fecha con la que queremos comparar
     * @return estado de la cmparacion con un int 0 para igual -1 para superior y 1 para inferior
     */
    public int comparar(Fecha f1){
        int estado;
        if(año==f1.getAño()){ 
            if(mes==f1.getMes()){
               if(dia==f1.getDia()){
                   estado=0;
               }
               else if(dia>f1.getDia()){
                   estado=-1;
               }
               else{
                   estado=1;
               }
                   
            }
            else if(mes>f1.getMes()){
                estado=-1;
            }
            else{
                estado=1;
            }
        }
        else if(año>f1.getAño()){
            estado=-1;
        }
        else{
            estado=1;
        }
        return estado;
    }
//    
//    public int calcularAños(){
//        int años;
//        Fecha f1=new fecha();
//        años=f1.getAño()-año;
//        
//        if(f1.getMes()<mes || f1.getMes())
//        return años;
//    }
        
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

}
