import java.util.ArrayList;

public class recursiveBinarySearch {

    public static void main(String[] args) {
        Integer target = 23;
        ArrayList<Integer> arrayBoy = new ArrayList<Integer>();
        arrayBoy.add(10);
        arrayBoy.add(18);
        arrayBoy.add(20);
        arrayBoy.add(23);
        arrayBoy.add(24);
        arrayBoy.add(64);
        arrayBoy.add(77);
        arrayBoy.add(106);
        arrayBoy.add(121);
        arrayBoy.add(142);
        arrayBoy.add(151);
        arrayBoy.add(176);
        arrayBoy.add(195);
        arrayBoy.add(287);
        arrayBoy.add(332);
        arrayBoy.add(356);
        arrayBoy.add(359);
        arrayBoy.add(385);
        arrayBoy.add(399);
        arrayBoy.add(444);
        arrayBoy.add(452);
        arrayBoy.add(484);
        arrayBoy.add(492);
        arrayBoy.add(645);
        arrayBoy.add(731);
        arrayBoy.add(771);
        arrayBoy.add(781);
        arrayBoy.add(795);
        arrayBoy.add(851);
        arrayBoy.add(860);
        arrayBoy.add(966);
        arrayBoy.add(967);

        binarySearch(arrayBoy, target, 0, 32);

    }

    public static int binarySearch(ArrayList<Integer> pList, Integer pKey, int pLow, int pHigh) {
        if(pLow > pHigh) {return -1;}
        int middle = (pLow + pHigh) / 2;
        System.out.println("Current middle of Array: " + middle + ", Value = " + pList.get(middle));
        if (pKey.equals(pList.get(middle))) {
            System.out.println("Target is middle: " + pList.get(middle));
            return middle;
        } 
        else if (pKey < pList.get(middle)) {
            System.out.println("Bisect: Lower half");
            return binarySearch(pList, pKey, pLow, middle - 1);
        }
        else {
            System.out.println("Bisect: Upper half");
            return binarySearch(pList, pKey, middle + 1, pHigh);
        }
    }
}