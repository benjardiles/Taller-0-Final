package Cine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class App {
	
	public static void LeerClientes(String[] NombreUser,String[]ApellidoUser,String[]Rut,String[]Password,int[]Credit) throws FileNotFoundException{
		Scanner Arch = new Scanner(new File("clientes.txt"));
		int x = 0;
		while (Arch.hasNextLine( )){
			String linea = Arch.nextLine();
			String [] partes = linea.split(",");
			String nombre = partes[0];
			NombreUser[x]= nombre;
			String apellido = partes[1];
			ApellidoUser[x]=apellido;
			String ruts = partes[2];
			Rut[x] = ruts;
			String Pasword = partes[3];
			Password[x] = Pasword;
			int credito = Integer.parseInt(partes[4]);
			Credit[x]= credito;
			
			x++;
			
			
			}
		Arch.close();
		
			
		}
	
	public static void LeerStatus(String[] RutStatus,String[]Estado) throws FileNotFoundException{
		Scanner Arch2 = new Scanner(new File("status.txt"));
		int y = 0;
		while(Arch2.hasNextLine()) {
			String linea = Arch2.nextLine();
			String [] partes = linea.split(",");
			String Ruts = partes[0];
			RutStatus[y] = Ruts;
			String Estados = partes[1];
			Estado[y] = Estados;
			
			y++;
			
			
		}
		Arch2.close();
		}
	public static void LeerPeliculas(String[] Peliculas, String[] tipos,String[]salas, String[]funciones, int[]recaudaciones) throws FileNotFoundException{
		Scanner arch3 = new Scanner(new File("peliculas.txt"));
		int z = 0;
		while(arch3.hasNextLine()) {
			String linea = arch3.nextLine();
			String[] partes = linea.split(",");
			String pelicula = partes [0];
			Peliculas[z] =pelicula;
			String tipo = partes[1];
			tipos[z] = tipo;
			int recaudacion = Integer.parseInt(partes[2]);
			recaudaciones[z] = recaudacion;
			for(int i = 0; i<999; i++) {
				String sala = partes[3];
				salas[z]= sala;
				String funcion = partes[4];
				funciones[z] = funcion;
				z++;
			}
			
		arch3.close();
			
		}
	}
	
		 
			

	
	public static void main(String[] args) throws FileNotFoundException {
		
		String Peliculas[] = new String[999];
		String tipos[] = new String[9999];
		int recaudaciones[]= new int[9999];
		String salas[]= new String[9999] ;
		String funciones[]= new String[9999];
		String RutStatus[]= new String[9999];
		String Estado[]= new String[9999];
		String NombreUser[]= new String[9999];
		String ApellidoUser[]= new String[9999];
		String Rut[]= new String[9999];
		String Password[]= new String[9999];
		int Credit[]= new int[9999];

		LeerPeliculas(Peliculas,tipos,salas,funciones,recaudaciones);
		LeerStatus(RutStatus,Estado);
		LeerClientes(NombreUser,ApellidoUser,Rut,Password,Credit);
		
	
		
	

	}

}