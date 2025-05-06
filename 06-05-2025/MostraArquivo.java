import java.io.*;

public class MostraArquivo {
  public static void main(String[] args) {
    InputStream fi = null;
    int i = -1;
    try {
      fi = new FileInputStream("teste.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado !!");
    }
    do {
      try {
        i = fi.read();
      } catch (IOException e) {
        System.out.println("Arquivo não pode ser lido !!");
      }
      if (i != -1)
        System.out.print((char) i);
    } while (i != 1);
  }
}
