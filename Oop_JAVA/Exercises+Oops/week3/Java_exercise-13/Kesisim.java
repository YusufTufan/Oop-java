public class Kesisim {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {2,4,7,5,6};
        int [] array3 = intersection(array1, array2);         //methoduu kullanma kesişim bulmak için... 
        for (int k = 0; k < array3.length; k++) {
            System.out.print(array3[k]+" ");                  //array 3 ü yazdırmak...
        }   
    }
    public static int[] intersection (int[] array1, int [] array2){   //Argüman olarak iki integer dizi alıp 1 integer dizi döndüren method... 
        int[] birleşik_dizi = new int[array1.length];                 //kesisim kümesi belirlemek için yeni bir array oluştur..
        int index = 0;                                                //indexi kullancağız şimdilik 0

        for (int i = 0; i<array1.length ; i++){                //ilk for array1 de döner...
            int sayi1 = array1[i];                             //dönünce gelen sayıyı sayi1 e atıyoruz...
            for(int j = 0; j<array2.length ; j++){             //ikinci for array2 de döner...
                int sayi2 = array2[j];                         //dönünce gelen sayıyı sayi2 ye atıyoruz...
                if (sayi1 ==sayi2){                            //sayi1 ve sayi2 eşit mi diye bakar. Eşitse birleşik diziye atar.
                    birleşik_dizi[index++] = sayi1;
                    break;
                }
            }
        }
        int[] intersection = new int[index];                   //index kaç kez arttıysa (kaç tane sayı eşitse) o kadar uzun...
        for (int i = 0; i < index; i++) {
            intersection[i] = birleşik_dizi[i];                //birleşik dizidekileri ntersection dizisine ata...
        }
        return intersection;                                  //Kesşişimi döndür...
    }
}