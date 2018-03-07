
package LibrarySytem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chathu
 */
public class SerialKiller {
    public static void serialize (Object obj, String files)
    {
        try (FileOutputStream files2 = new FileOutputStream(files))
        {
            ObjectOutputStream object = new ObjectOutputStream(files2);
            object.writeObject(obj);
            object.flush();
        } catch (IOException ex) {
            Logger.getLogger(SerialKiller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Object Deserialize (String file) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        FileInputStream moreFiles = new FileInputStream(file);
        ObjectInputStream object2 = new ObjectInputStream(moreFiles);
        return object2.readObject();
    }
}
