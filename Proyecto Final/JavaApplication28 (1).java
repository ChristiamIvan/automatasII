import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class JavaApplication28 {
 	public static ArrayList<String> lee(String path){
 		      ArrayList<String> lista = new ArrayList<String>(); //declaracion de arreglo llamado lista 

              try {
                  FileReader fb =new FileReader(path);
                  BufferedReader  br = new BufferedReader(fb);

                  String linea;
                  while((linea = br.readLine())!= null){ //ciclo en la cual el arreglo entra 
                  	//System.out.println(linea);
                    StringTokenizer st = new StringTokenizer(linea, ";/./ /\n/:", true); //muestra hasta donde quiero separar por partes
                    // System.out.println("Cuantos: " + st.countTokens());
                    while (st.hasMoreTokens()){ 
						String token = st.nextToken();
						lista.add(token);
                    	//System.out.println(st.nextToken());       
                    }      
                  
               
                    }
              } catch (FileNotFoundException ex) {
                  
              } catch (IOException ex) {
                 
              }
             /* for(int i = 0; i < 5 ; i++)
              {
              	System.out.println(lista.get(i));
              }*/
    		
                  return (lista);//retorno la lista
    	}		      
 
 
        
        public static void comparacion(String dos[][], ArrayList<String> lista){//
             int i=0;
             String h;
             int j=0; 
             //System.out.println(dos.length);//cuantos son  
                while (i < lista.size()) {//obtener un elemento de la lista
                    j=0;
                    h=lista.get(i).trim();//trim quitar los espacios en blanco y es para aliniar a la izquierda
                    //System.out.println(h);
                    while(j < dos.length){ //obtiene la longitud del arreglo
               		if(h.equals(dos[j][0])){
                        System.out.println(dos[j][1]);
                        
                 		break;//rompe ciclos en el que esta
                 		
                	}
                else{
                	
                    j=j+1;    
                }
               
                }
                 i=i+1; 	
             }
           	
            }

    public static void main(String[] args) {
      
       	ArrayList<String> lista = new ArrayList<>();
        lista = lee("F:\\test.txt");
       	//System.out.println(lista.get(6));
		
				
   		String[][]dos= {{"java","pyhton "},
 		      			{"import"," "},
 		      			{"public static","Def"},
 		      			{"Scanner"," "},
 		      			{"void","from import"},
 		      			{"static","def"},
 		      			{"main"," "},
 		      			{"out"," "},
 		      			{"print","print"},
 		      			{"args"," "},
 		      			{"int","int"},
 		      			{"input","input"},
 		      			{"nextInt","str"},
 		      			{"for","for"},
 		      			{" "," "}}; 
 		      				   		
    	comparacion( dos, lista);		
        		
        
      

    }

}
