import java.io.*;

public class MostraArquivoTexto {
  public static void main(String[] args) {
    BufferedReader in = null;
    try {
      in = new BufferedReader(new FileReader("teste.txt"));
      String str;
      while ((str = in.readLine()) != null) {
        System.out.println(str);
      }
      in.close();
    } catch (IOException e) {
    }
  }
}
