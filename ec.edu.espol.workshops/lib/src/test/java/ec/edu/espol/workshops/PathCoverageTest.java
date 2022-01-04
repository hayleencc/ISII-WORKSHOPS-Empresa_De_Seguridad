package ec.edu.espol.workshops;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class PathCoverageTest {
	@Test
    public void IP_001(){
       InputStream stdin = System.in;
       System.setIn(new ByteArrayInputStream("21\nF\nY\n1234567890\n".getBytes()));

       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       PrintStream ps = new PrintStream(byteArrayOutputStream);
       PrintStream stdout = System.out;
       System.setOut(ps);

       CarInsurance.main(new String[0]);

       System.setIn(stdin);
       System.setOut(stdout);

       String outputText = byteArrayOutputStream.toString();
       String[] arr = outputText.split("\n");
       String[] resultados = new String[] {"$300"};
       Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
    }
	
	@Test
    public void IP_002(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("45\nF\nY\n1234567890\n".getBytes()));

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
    public void IP_003(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("64\nM\nN\n1234567890\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        CarInsurance.main(new String[0]);

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String[] arr = outputText.split("\n");
        String[] resultados = new String[] {"$400"};
        Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
     }
    
	@Test
    public void IP_004(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("18\nM\nN\n1234567890\n".getBytes()));

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
    public void IP_005(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("66\nF\nY\n123456789\n1234567890\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        CarInsurance.main(new String[0]);

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String[] arr = outputText.split("\n");
        String[] resultados = new String[] {"$300"};
        Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
     }
	
	@Test
    public void IP_006(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("21\nF\nM\nY\n1234567890\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        CarInsurance.main(new String[0]);

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String[] arr = outputText.split("\n");
        String[] resultados = new String[] {"$300"};
        Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
     }
	
	@Test
    public void IP_007(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("21\nwoman\nf\nY\n1234567890\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        CarInsurance.main(new String[0]);

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String[] arr = outputText.split("\n");
        String[] resultados = new String[] {"$300"};
        Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
     }
	
	
	@Test
    public void IP_008(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("17\n".getBytes()));

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
    public void IP_009(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("81\n".getBytes()));

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
    public void IP_010(){
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("twenty-one\n21\nF\nY\n1234567890\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        CarInsurance.main(new String[0]);

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String[] arr = outputText.split("\n");
        String[] resultados = new String[] {"$300"};
        Assert.assertTrue(arr[arr.length-1].contains(resultados[0]));
     }
}
