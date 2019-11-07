import java.io.File;

public class R02_XP00_J
{
        // Rule 02, NC
        public void deleteFile_NC(){
 
            File someFile = new File("someFileName.txt");
            // Do something with someFile
            someFile.delete();
          }
    
        // Rule 02, C
        public void deleteFile_C(){
     
            File someFile = new File("someFileName.txt");
            // Do something with someFile
            if (!someFile.delete()) {
              // Handle failure to delete the file
            }
           
        }
    
    
}