package gr.aueb.cf.ch17.clona;

import java.io.*;

public class DeserializeDemo {

    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("C:/users/vbour/documents/java/trainee.ser"))) {
            Trainee traineeAlice;
            traineeAlice = (Trainee) ois.readObject();
            System.out.println(traineeAlice.getName()+ "successfully read");
            System.out.println("Success in deserialization");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException e1) {
            System.out.println("Serialiazable Exception " + e1);
            e1.printStackTrace();
        } catch (IOException e2) {
            System.out.println("IO Exception " + e2);
            e2.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

