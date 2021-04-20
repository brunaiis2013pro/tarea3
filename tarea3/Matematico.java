
public class Matematico
{
    public  Dupla calcularEcuacionSegundoGrado(double a, double b, double c){
        double discriminante;
        Dupla respuesta = new Dupla(0,0);
        
        discriminante = Math.pow(b,2) - (4*a*c);
        
        if(discriminante>=0){
            double x1,x2;
            
            x1 = (-b + Math.sqrt(discriminante))/(2*a);
            x2 = (-b - Math.sqrt(discriminante))/(2*a);
            respuesta.setX1(x1);
            respuesta.setX2(x2);
        }
       
            return respuesta;
     }
    
    public Dupla2 calcularEcuacionRecta(Punto punto1, Punto punto2){
         double m,b; 
         
                         //ECUACION DE UNA RECTA QUE PASA POR 2 PUNTOS
                         //    y = mx + b
                         
         m  = (punto2.getY()-punto1.getY())/(punto2.getX()-punto1.getX());
         b  = punto1.getY() - (m*punto1.getX()); //Puedes escojer cualquiera de los 2 puntos para encontrar b
         Dupla2 y = new Dupla2(m,b);
         
         return y;
         
     }
    
    public double calcularCatetoFaltante(double hipotenusa, double cateto1){
        double cateto2;
        
        cateto2 = Math.sqrt(Math.pow(hipotenusa,2) - Math.pow(cateto1,2));
        
        return cateto2;
    }
}
