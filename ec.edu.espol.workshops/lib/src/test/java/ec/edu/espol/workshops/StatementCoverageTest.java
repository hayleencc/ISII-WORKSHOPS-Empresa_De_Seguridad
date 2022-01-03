package ec.edu.espol.workshops;
import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
public class StatementCoverageTest {
	@Test
    public void pathTest1(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("20\nM\nN\n1234567891\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"$2000\n"};
       //System.out.print(arr[arr.length-1].getClass().getName());
       //System.out.print(resultados[0].getClass().getName());
       //String key = "output:";
       //String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
       Assert.assertEquals(arr[arr.length-1], resultados[0] );
    }
	@Test
    public void pathTest2(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("hola\n48\nchao\nF\nnegativo\nY\nnum\n1234567891\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"$200\n"};
       //System.out.print(arr[arr.length-1].getClass().getName());
       //System.out.print(resultados[0].getClass().getName());
       //String key = "output:";
       //String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
       Assert.assertEquals(arr[arr.length-1], resultados[0] );
    }
	@Test
    public void pathTest3(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("10\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"Sorry, premium car insurance is not available for under age\n"};
       //System.out.print(arr[arr.length-1].getClass().getName());
       //System.out.print(resultados[0].getClass().getName());
       //String key = "output:";
       //String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
       Assert.assertEquals(arr[arr.length-1], resultados[0] );
    }
	@Test
    public void pathTest4(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("90\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"Sorry, premium car insurance is not available for 80 years older\n"};
       //System.out.print(arr[arr.length-1].getClass().getName());
       //System.out.print(resultados[0].getClass().getName());
       //String key = "output:";
       //String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
       Assert.assertEquals(arr[arr.length-1], resultados[0] );
    }
}
