public class Doctor {
    private int docID;
    private static int counter = 0;
    private String docName;
    private DoctorType doctorType;

    private boolean isAvailable;
    Doctor(){
        docID = counter++;
    }


    public int getDocID() {
        return docID;
    }

    public void setDocID(int docID) {
        this.docID = docID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Doctor.counter = counter;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public DoctorType getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(DoctorType doctorType) {
        this.doctorType = doctorType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
