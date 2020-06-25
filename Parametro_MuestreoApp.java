/*
Diseñe e implemente una Clase Parametro Simulacion, que entrega los siguientes
atributos :periodo_muestreo de tipo decimal y tasa_momento de tipo decimal; e
implemente los métodos get , set y to String ,un constructor sobrecargado y otro
constructor que permita inicializar las variables de la clase ,adicionalmente
,implemente 2 métodos especiales .
Ingresar_valor(float  tasa_momento) se ingresa el valor al parametro de simulacion
, si la cantidad introducida es negativa nó se hará nada ;por lo que se aceptará
el ingreso del valor en el parametro.
Determinar_valor(float  tasa_momento) se determina el valor al parametro de simulacion
,considerando que si,considerando que ,si restando la cantidad actual a la que nos pasan
es negativa ,el parametro de simulacion pasa a ser un cero.

 */
package parametro_muestreoapp;

/**
 *
 * @author Lenin Paul
 */
class Parametro_Simulacion{
private double periodo_muestreo;
private double tasa_momento;
//constructor
public Parametro_Simulacion(double periodo_muestreo){
    this(periodo_muestreo , 0);
}
public Parametro_Simulacion(double periodo_muestreo ,double tasa_momento){
    this.periodo_muestreo=periodo_muestreo;
    if(tasa_momento <0){
        this.tasa_momento=0;
    }else{
        this.tasa_momento=tasa_momento;
    }
}
 //metodos
public double getPeriodo_muestreo(){
    return periodo_muestreo;
}
public void setPeriodo_muestreo(double periodo_muestreo){
    this.periodo_muestreo=periodo_muestreo;
}
public double getTasa_momento(){
    return tasa_momento;
}
public void setTasa_momento(double tasa_momento){
    this.tasa_momento = tasa_momento;
}
public void Ingresar_Valor(double tasa_momento){
    if(tasa_momento>0){
        this.tasa_momento+=tasa_momento;
    }

}

public void Determinar_valor(double tasa_momento){
    if(tasa_momento<0){
        this.tasa_momento=tasa_momento;
    }else{
        this.tasa_momento-=tasa_momento;
    }
}
@Override
public String toString(){
    return " El valor del periodo de muestreo    "+ periodo_muestreo+" con la tasa de moemento "+ tasa_momento +
             "  cosntruye le curva de simulacion";
}
}

public class Parametro_MuestreoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Parametro_Simulacion parametro_1= new Parametro_Simulacion(0,2);
      Parametro_Simulacion parametro_2= new Parametro_Simulacion(0.2 , 4.5);
      parametro_1.Ingresar_Valor(0.66);
      parametro_2.Ingresar_Valor(1.57);

      parametro_1.Determinar_valor(0.25);
      parametro_2.Determinar_valor(0.7);

        System.out.println(parametro_1);
        System.out.println(parametro_2);
    }

}
