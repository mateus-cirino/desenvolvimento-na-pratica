package exercicios.string01;

public class StringReplace {

    public static void main(String[] args) {
        String frase = "Geeks for Geeks";
        String fraseAfterReplace = frase.replace("Geeks", "Mateus");
        System.out.println(fraseAfterReplace);

        String fraseComEspaço = " Abacaxi com limão           ";
        String fraseSemEspaço = fraseComEspaço.trim();
    }
}
