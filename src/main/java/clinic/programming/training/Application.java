package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
 public  int countWords(String words){
        String[] separateWords = StringUtils.split(words, ' ');
        if  (separateWords == null){
            return 0;
        }else {
            return separateWords.length;
        }
    }

    public void greet(){
        List<String> greetings = new ArrayList<>();
        greetings.add("hello");
        for(String greeting : greetings){
            System.out.println("greeting: " + greeting);
        }
    }

    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
        System.out.println ("Starting Application");
        Application app = new Application();
        app.greet();
        int result = app.countWords("Hola mundo esto con seis palabras");
        System.out.println("num palabras: " + result);
    }
   

}
