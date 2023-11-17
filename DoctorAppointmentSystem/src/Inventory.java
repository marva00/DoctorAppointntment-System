import java.util.ArrayList;
public class Inventory {

    ArrayList<Doctor> docList = new ArrayList<>(50);
    ArrayList<Patient> patientList = new ArrayList<>(50);

        public void add(Doctor doctor) {

            docList.add(doctor);
        }

        public void add(Patient patient) {

            patientList.add(patient);
        }

        public void remove(Doctor doctor){

            docList.remove(doctor);
        }

        public void remove(Patient patient){

            patientList.remove(patient);
            }




        }






