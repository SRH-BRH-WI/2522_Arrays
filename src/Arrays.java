public class Arrays {

    public static boolean sucheImArray(int[] array, int datum) {
        for (int i=0; i < array.length; i++) {
            if (datum == array[i])
                return true;
        }
        return false;
    }

    public static int kleinsterWertImArray(int[] array) {
        // TODO
    }


    public static void main(String[] args) {
//        // Anlegen eines Arrays
//        int[] array = { 5, 4, 3, 2, 1 };
//        //              0  1  2  3  4
//        // festes Array mit 5 Elementen und ihren entsprechenden Werten
//        int[] nochEinArray = new int[ 1000 ];
//        int[] einWeiteresArray = array;

//        einWeiteresArray[3] = -1;
//        System.out.println( array[3] );
//        System.out.println( nochEinArray[473] );
//        System.out.println( einWeiteresArray[3] );

        int[] datenreihe = { 17, 3, 29, 22, 5, 11, 9, 13, 7, 12 };

        System.out.println( "Ist die 13 im Array? " + sucheImArray(datenreihe, 13) );
        System.out.println( "Ist die 42 im Array? " + sucheImArray(datenreihe, 42) );
    }
}
