import java.util.*; 
public class Ex9 { 
	public static <T> void imprime(List<T> lista){ 
		for(T n : lista){ 
			T d = n; 
			System.out.println(d); 
 		} 
 	} 
 
	public static void main(String [] args){ 
		double [] valores = {10.1, 20.2, 30.3, 40.4, 50.5}; 
		List<Double> lista = new ArrayList<Double>(); 
		
		for(double d : valores){ 
			lista.add(d); 
		} 
		
		imprime(lista); 
	} 
} 