package lab9_10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Danil on 28.11.2022
 * @project DVFUHomework
 */
public class OutputPerson {
    public static void main(String[] args) {
        OutputPerson outputPerson = new OutputPerson();

        final File outputFile = new File("./src/lab9_10/person.data");
        Person person = new Person("Danil", "Spirin", "c. Vladivostok",2002 );
        outputPerson.writePersonInFile(person,outputFile);
    }

    /**
     * Writing person object in the file
     * @param person person for writing
     * @param outputFile output file for writing
     */
    public void writePersonInFile(Person person, File outputFile) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile, false))) {
            oos.writeObject(person);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
