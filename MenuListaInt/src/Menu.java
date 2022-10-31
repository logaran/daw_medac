public class Menu {
    private String elementos[];

    // Constuctor
    public Menu(String elementos[]) {
        this.elementos = elementos;
    }

    // Metodos

    public String mostrar(int opcion) {
        String menu = "";

        for (int i = 0; i <= this.elementos.length - 1; i++) {
            String linea = (i == opcion) ? "-->" + this.elementos[i] + "\n" : this.elementos[i] + "\n";
            menu += linea;
        }
        return menu;

    }

    public String[] getElementos() {
        return elementos;
    }

}
