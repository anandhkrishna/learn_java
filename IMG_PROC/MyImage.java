import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 
  
public class MyImage 
{ 
    public static void main(String args[])throws IOException 
    { 
        int width = 963;     
        int height = 640;    
  
        BufferedImage image = null; 
  
        // READ IMAGE 
        try
        { 
            File input_file = new File("E:\\process.jpg"); //image file path 
  
          
            image = new BufferedImage(width, height, 
                                    BufferedImage.TYPE_INT_ARGB); 
  
             // Reading input file 
            image = ImageIO.read(input_file); 
  
            System.out.println("Reading complete."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: "+e); 
        } 
  
        try
        { 
            
            File output_file = new File("E:\\Out.jpg"); 
  
            
            ImageIO.write(image, "jpg", output_file); 
  
            System.out.println("Writing complete."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: "+e); 
        } 
    }
}