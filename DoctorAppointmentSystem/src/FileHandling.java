import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public interface FileHandling {
    public void writeFiles(ArrayList<Object> obj, ObjectOutputStream oos, File file);
    public void readFiles(ArrayList<Object> obj,ObjectInputStream ois,File file);
}
