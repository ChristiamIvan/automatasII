package InicioEvaluador;
/**
 *
 * @author Migue
 */
public class Evaluador {
    
    public static String operadores(String exp){
        String datoSalida = "";
        //Metodo para establecer el tipo de caracter
        for (int i = 0; i < exp.length(); i++) {
            if(esOperador(exp.charAt(i)))
                datoSalida+=exp.charAt(i);
        }
        return datoSalida;
    }
    
//metodo para obtener y evaluar una cadena de caracteres   
    public static double evaluar(String infija){
        String posfija = convertir(infija);
//      System.out.println("LA EXPRESION POSFIJA ES: "+ posfija);
        return evaluarPosfija(posfija);
        
    }

    
    
    public static String convertir(String infija) {
        // Metodo para convertir de infija a postfija
       String posfija= "";
      Pila pila = new Pila(100);
      //evaluar el recorrido del string caracteres
        for (int i = 0; i < infija.length(); i++) {
            char letra = infija.charAt(i);
            if(esOperador (infija.charAt(i))){
                //si es operador mandarlo a la pila
                if (pila.estaVacia()){
                    pila.apilar(letra);
                }else{
                   //evaluando la prioridad de la expresion con la prioridad de la pila
                    int pe=prioridadEnExpresion(letra);
                    int pp=prioridadEnPila((char)pila.elementoTope());
                    
                    if (pe>pp) {
                        pila.apilar(letra);
                    }else{
                        posfija+=pila.desapilar();
                        pila.apilar(letra);
                    }
                }
            }else {
                    posfija +=letra;
                }
        }
        //baciar la pila para no dejar operadores
        while (!pila.estaVacia()){
            posfija+=pila.desapilar();
        }
        return posfija;
      
    }

    //metodo para evaluar la prioridad de los operadores en la expresion
    private static int prioridadEnExpresion (char operador){
         if (operador == '^') return 4;
         if (operador == '*' || operador == '/') return 2;
         if (operador == '+' || operador == '-') return 1;
         if (operador == '(' ) return 5;
         return 0;
    }
    
        //metodo para evaluar la prioridad de los operadores en la pila
    private static int prioridadEnPila (char operador){
         if (operador == '^') return 3;
         if (operador == '*' || operador == '/') return 1;
         if (operador == '+' || operador == '-') return 2;
         if (operador == '(' ) return 0;
         return 0;
    }
    
    //metodo para evaluar los datos de postfijo en la pila (dar el resultado)
    private static double evaluarPosfija(String posfija) {
        Pila pila = new Pila(100);
        for (int i = 0; i < posfija.length(); i++) {
            char letra = posfija.charAt(i);
            if (!esOperador(letra)) {
                double num = new Double(letra +"");//convertir a double un char
                pila.apilar(num);
            }else{
                double num1 = (double)pila.desapilar();
                double num2 = (double)pila.desapilar();
                double num3 = opereacion(letra, num1, num2);
                pila.apilar(num3);
            }
        }
        return (double)pila.elementoTope();
    }

    //determinar si el caracter recorrido es un operador o un entero
    //Si es operador lo manda a la pila si es caracter lo manda a postfijo
    private static boolean esOperador(char letra) {
        if (letra =='^' || letra =='*' || letra =='/' || letra =='+'
                || letra =='-' || letra =='(' || letra ==')'){
        return true;
    }
        return false;
    }

    //Metodo para hacer las operaciones de postfija
    private static double opereacion(char letra, double num1, double num2) {
        if (letra=='*') return num1*num2;
        if (letra=='/') return num1/num2;
        if (letra=='+') return num1+num2;
        if (letra=='-') return num1-num2;
        if (letra=='^') return Math.pow(num1, num2);//potencia
        return 0;
    }
    
}
