package File;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVWriter;

public class Archivo {
	
	public Archivo( )  {
		
		
		
		
	}

	private static String FILE = "Pet.csv";

	public ArrayList<Pet> readFile() {
		ArrayList<Pet> list = new ArrayList<Pet>();
		BufferedReader bufferLectura = null;
		try {
			bufferLectura = new BufferedReader(new FileReader(FILE));

			String line = bufferLectura.readLine();

			while (line != null) {
				Pet pet = new Pet();
				String[] row = line.split(",");
				if (row.length == 10) {
					try {
						pet.setCase(row[0]);
						pet.setEspecie(row[1]);
						pet.setTamaño(row[2]);
						pet.setDireccion(row[3]);
						pet.setLocalidad(row[4]);
						pet.setNombre(row[5]);
						pet.setTelefono(row[6]);
						pet.setEmail(row[7]);
						pet.setComentarios(row[8]);
						pet.setFecha(row[9]);
						list.add(pet);

					} catch (NumberFormatException e) {

					}
				}
				line = bufferLectura.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferLectura != null) {
				try {
					bufferLectura.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return list;
	}

	public void writeFile(ArrayList<Pet> list) throws IOException{

      
    	FileWriter csvWriter = new FileWriter("Pet.csv");
    	
    	
    	for (Pet pet : list) {
    		
    		csvWriter.append("\n");
    		csvWriter.append(pet.getCase());
    		csvWriter.append(",");
    		csvWriter.append(pet.getEspecie());
    		csvWriter.append(",");
    		csvWriter.append(pet.getTamaño());
    		csvWriter.append(",");
    		csvWriter.append(pet.getLocalidad());
    		csvWriter.append(",");
    		csvWriter.append(pet.getDireccion());
    		csvWriter.append(",");
    		csvWriter.append(pet.getNombre());
    		csvWriter.append(",");
    		csvWriter.append(pet.getTelefono());
    		csvWriter.append(",");
    		csvWriter.append(pet.getEmail());
    		csvWriter.append(",");
    		csvWriter.append(pet.getComentarios());
    		csvWriter.append(",");
    		csvWriter.append(pet.getFecha());
    		
    		
    	}
        	csvWriter.flush();
        	csvWriter.close();
    }
}
