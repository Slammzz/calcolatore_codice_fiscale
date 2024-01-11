public class CodiceFiscale {
    private String nome;
    private String cognome;
    private String comune;
    private String provincia;
    private boolean sesso;
    private String data;

    public CodiceFiscale(String nome, String cognome, String comune, String provincia, boolean sesso, String data) {
        this.nome = nome;
        this.cognome = cognome;
        this.comune = comune;
        this.provincia = provincia;
        this.sesso = sesso;
        this.data = data;
    }

    public String generatoreCodFisc(){
        return "ciao ";
    }

    private String calcoloNome(String n){
        String consonanti = "";
        int conteggioConsonanti = 0;

        for (int i = 0; i < n.length(); i++) {
            char carattereCorrente = n.charAt(i);

            if (Character.isLetter(carattereCorrente) && !isVocale(carattereCorrente)) {
                consonanti += carattereCorrente;
                conteggioConsonanti++;
            }
        }

        if(conteggioConsonanti == 2){
            char carattereCorrente = n.charAt(0);
            while(isVocale(carattereCorrente))
        }

        return consonanti;
    }

    private static boolean isVocale(char carattere) {
        // Verifica se il carattere è una vocale
        return "aeiouAEIOU".indexOf(carattere) != -1;
    }
}
