package ec.edu.espol.workshops;
import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
public class BranchCoverageTest {
	@Test
    public void BC001(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("none\n48\nund\nF\n*\nY\nnum\n1234567891\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"$200"};
       Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
    }
	
	@Test
    public void BC002(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("85\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"Sorry, premium car insurance is not available for 80 years older"};
       Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
    }
	
	@Test
    public void BC003(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("15\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"Sorry, premium car insurance is not available for under age"};
       Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
    }
	
	@Test
    public void BC004(){
	      InputStream stdin = System.in;
	       System.setIn(new ByteArrayInputStream("24\nM\nN\n1234567891\n".getBytes()));

	       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	       PrintStream ps = new PrintStream(byteArrayOutputStream);
	       PrintStream stdout = System.out;
	       System.setOut(ps);

	       CarInsurance.main(new String[0]);

	       System.setIn(stdin);
	       System.setOut(stdout);

	       String outputText = byteArrayOutputStream.toString();
	       String[] arr = outputText.split("\n");
	       String[] resultados = new String[] {"$2000"};
	       Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
    }
	@Test
    public void BC005(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("50\nM\nY\n1234567891\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"$200"};
       Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
    }
}

