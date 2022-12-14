public class Lista {
    // Declaramos las propiedades de nuestras lista

    private int elementos;
    private int lista[];
    private boolean llena;

    public Lista(int cantidad) {
        this.elementos = cantidad;

    }

    public void generarValores() {
        lista = new int[this.elementos];
        for (int i = 0; i <= elementos - 1; i++) {
            lista[i] = (int) (Math.random() * 999 + 1);
        }
        llena = true;
    };

    public boolean isLlena() {
        return llena;
    }

    public String toString(boolean invertida) {
        if (this.llena) {
            String listado = "";
            int salto = 0;
            for (int i = 0; i <= this.elementos - 1; i++) {
                if (invertida) {
                    listado += (i == this.elementos - 1) ? this.lista[this.elementos - 1 - i]
                            : this.lista[this.elementos - 1 - i] + ", ";
                } else {
                    listado += (i == this.elementos - 1) ? this.lista[i] : this.lista[i] + ", ";
                }
                salto++;
                if (salto == 25) {
                    listado += "\n";
                    salto = 0;
                }
            }
            return listado;
        } else {
            return "Me temo que no hay nada que mostrar. Prueba primero a generar los valores";
        }
    }

    public Lista ordena(Lista original) {
        Lista listaOrdenada = new Lista(this.elementos);
        //Primero hacemos una copia exacta de la lista original

        for (int i =0;i <= original.elementos -1; i++){
            listaOrdenada.lista[i] = original.lista[i];
        }

        return listaOrdenada;

    }
}