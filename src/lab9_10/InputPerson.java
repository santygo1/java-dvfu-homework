package lab9_10;

import java.io.*;

/**
 * @author Danil on 28.11.2022
 * @project DVFUHomework
 */
public class InputPerson {

    public static void main(String[] args) {
        InputPerson inputPerson = new InputPerson();

        final File inputFile = new File("./src/lab9_10/person.data");
        System.out.println(inputPerson.readPersonFromFile(inputFile));
    }

    /**
     * Reading person from file with data about him
     *
     * @param file file with person data
     * @return null - reading isn't success
     */
    public Person readPersonFromFile(File file) {
        Person readingResult = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            readingResult = (Person) ois.readObject();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return readingResult;
    }


}
