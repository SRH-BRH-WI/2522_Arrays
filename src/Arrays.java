public class Arrays {

    public static boolean sucheImArray(int[] array, int datum) {
        for (int i=0; i < array.length; i++) {
            if (datum == array[i])
                return true;
        }
        return false;
    }

    public static int kleinsterWertImArray(int[] array) {
        int kleinsterWert = array[0];
        for (int i=1; i < array.length; i++) {
            if (array[i] < kleinsterWert)
                kleinsterWert = array[i];
        }
        return  kleinsterWert;
    }

    public static int größterWertImArray(int[] array) {
        int größterWert = array[0];
        for (int i=1; i < array.length; i++) {
            if (array[i] > größterWert)
                größterWert = array[i];
        }
        return  größterWert;
    }

    public static boolean istDasArrayAufsteigendSortiert(int[] array) {
        for (int i=0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) return false;
        }
        return true;
    }

    /*
     Sei array ein Feld von n Zahlen
     Für i = 1 bis n
        Merke  m  als  i.Wert im array
        Setze j = i
        Solange j > 0 und der Wert an (j-1). Stelle im array größer ist als m
            Kopiere den Wert von (j-1). Stelle an die j. Stelle im array
            Erniedrige j um 1
        Kopiere den Wert m an die j. Stelle im array

        Hinweis: n ist array.length
     */
    public static void machWasMitDemArray(int[] array) {
        for (int i=0; i < array.length; i++) {
            int m = array[i];
            int j = i;
            while (j > 0 && array[j-1] > m) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = m;
        }
    }

    private static void arrayAusgeben(int[] array) {
        System.out.print("[");
        for (int i=0; i<array.length; i++) {
            if (i>0) System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println("]");
    }

    private static int[] erstelleKopieDesArrays(int[] array) {
        int[] neuesArray = new int[ array.length ];
        for (int i=0; i<array.length; i++)
            neuesArray[i] = array[i];
        return neuesArray;
    }

    private static boolean sindDieArraysGleich(int[] a, int[] b) {
        return false;
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
        int[] sortierteDatenreihe = { 3, 5, 7, 9, 11, 12, 13, 17, 22, 29 };

        System.out.println( "Ist die 13 im Array? " + sucheImArray(datenreihe, 13) );
        System.out.println( "Ist die 42 im Array? " + sucheImArray(datenreihe, 42) );
        System.out.println( kleinsterWertImArray(datenreihe) );
        System.out.println( größterWertImArray(datenreihe) );
        System.out.println( "Array sortiert? " + istDasArrayAufsteigendSortiert(datenreihe) );
        System.out.println( "Zweite Array sortiert? " + istDasArrayAufsteigendSortiert(sortierteDatenreihe) );
        machWasMitDemArray(datenreihe);
        System.out.println( "Array jetzt sortiert? " + istDasArrayAufsteigendSortiert(datenreihe) );
        arrayAusgeben( datenreihe );
        int[] nochEinArray = erstelleKopieDesArrays(datenreihe);
        //nochEinArray[ nochEinArray.length / 2 ] = 55;
        arrayAusgeben( nochEinArray );
        System.out.println( sindDieArraysGleich(datenreihe, nochEinArray) );
    }


}
