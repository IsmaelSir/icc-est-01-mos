public class MetodosDeOrdenamiento {

   public MetodosDeOrdenamiento (){

    }

    public int[] sortBySeleccion(int[] arreglo){
        int tamanio = arreglo.length;

        //Recorre el arreglo
        for (int i = 0; i < tamanio; i++) {
            int indice = i;
            for (int j = i+1; j < tamanio; j++) {
                if(arreglo[j] < arreglo[indice]){
                    indice = j;
                }
            }
            //Aqui hago el intercambio del indice con la primera posicion
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] =aux;
        }
        return arreglo;
    }

    public void printArreglo (int[] arreglo){
        for (int num : arreglo) {
            System.out.print(num+" ");
        }
    }

    public int[] sortBySeleccionBoolean(int[] arr, boolean asendente){
    //    
    int tamanio = arr.length;

    //Recorre el arreglo
    for (int i = 0; i < tamanio; i++) {
        int indice = i;
        for (int j = 0; j < arr.length; j++) {
            if(asendente
            ? arr[j] < arr[indice]
            : arr[j] > arr[indice]){
                indice = j;
            }
        }
        //Aqui hago el intercambio del indice con la primera posicion
        int aux = arr[indice];
        arr[indice] = arr[i];
        arr[i] =aux;
    }
        return arr;
    }
}
