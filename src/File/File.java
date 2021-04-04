package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class File {


    private final String FILE = "CSV\\pets-citizens.csv";


    public File() {

    }

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

    public void writeFile(ArrayList<Pet> list){

        final String DELIMITADOR = ",";
        final String[] encabezado = {"Caso ", "Especie", "Tamaño", "Direccion","Localidad","Nombre","Telefono","Email","Comentarios"};


        try {
            Writer writer = Files.newBufferedWriter(Paths.get(FILE));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(encabezado)
                    .withDelimiter(DELIMITADOR));

            for (Pet p : list) {
                csvPrinter.printRecord(Arrays.asList(
                        p.getNombre(),
                        p.getApellido(),
                        String.valueOf(p.getEdad()),
                        p.getMail()));
            }
            csvPrinter.flush();
            System.out.println("Archivo CSV creado.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
