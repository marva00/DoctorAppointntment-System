import java.io.*;
import java.util.ArrayList;
public class Inventory implements FileHandling{
    ArrayList<Doctor> docList = new ArrayList<>();
    ArrayList<Patient> patientList = new ArrayList<>();
    File docFile = new File("doctors.text");
    File patientFile = new File("patients.txt");
    ObjectOutputStream oos = null;

    public Inventory(){
    }

    public void add(Doctor doctor) {
        docList.add(doctor);
        try {
            oos = new ObjectOutputStream(new FileOutputStream(docFile));
            for(Doctor doc: docList){
                oos.writeObject(doc);
            }
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void add(Patient patient) {
        patientList.add(patient);
        try {
            oos = new ObjectOutputStream(new FileOutputStream(patientFile));
            for(Patient pat: patientList){
                oos.writeObject(pat);
            }
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void remove(Doctor doctor){
        docList.remove(doctor);
        try {
            oos = new ObjectOutputStream(new FileOutputStream(docFile));
            for(Doctor doc: docList){
                oos.writeObject(doc);
            }
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void remove(Patient patient){
        patientList.remove(patient);
        try {
            oos = new ObjectOutputStream(new FileOutputStream(patientFile));
            for(Patient pat: patientList){
                oos.writeObject(pat);
            }
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void writeFiles(ArrayList<Object> obj,ObjectOutputStream oos, File file) {
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            if(obj.get(0) instanceof Doctor) {
                for(Doctor doc: docList){
                    oos.writeObject(doc);
                }
            }
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void readFiles(ArrayList<Object> obj,ObjectInputStream ois, File file) {

    }
}






