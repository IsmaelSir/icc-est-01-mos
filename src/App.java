public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodos de ordenamiento Seleccion");
        MetodosDeOrdenamiento mO = new MetodosDeOrdenamiento();

        int[] arreglo = {10,5,8,2,0};
        //mO.sortBySeleccion(arreglo);
        System.out.println("Con Boleand");
        System.out.println("\nOrden decendente");
        mO.sortBySeleccionBoolean(arreglo, true);
        mO.printArreglo(arreglo);

        System.out.println("\nOrden acendente");
        mO.sortBySeleccionBoolean(arreglo, false);
        mO.printArreglo(arreglo);
        
    }
}
