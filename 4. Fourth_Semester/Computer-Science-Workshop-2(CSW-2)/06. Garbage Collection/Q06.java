import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        Runtime runtime = Runtime.getRuntime();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            objects.add(new byte[1024]);
            if (i % 1000 == 0) {
                long currentTime = System.currentTimeMillis();
                long heapSize = runtime.totalMemory();
                long freeMemory = runtime.freeMemory();
                System.out.println("Timestamp: " + new Date(currentTime) + ", Heap Size: " + heapSize + ", Free Memory: " + freeMemory);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken: " + (endTime - startTime) + " ms");

        objects = null;

        System.gc();
    }
}

/**
 * OUTPUT
 *
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 126959456
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 124295112
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 123246536
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 122197960
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 121149384
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 120100808
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 119052232
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 118003656
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 116955080
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 115906504
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 114857928
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 113809352
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 112760776
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 111712200
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 110663624
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 109615048
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 108566472
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 107517896
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 106469320
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 107594864
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 106139872
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 105091296
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 104042720
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 102994144
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 101945568
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 100896992
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 99848416
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 98799840
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 97751264
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 96702688
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 95654112
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 94605536
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 93556960
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 92462040
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 91413464
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 90364888
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 89316312
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 88267736
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 87219160
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 86170584
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 85122008
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 84073432
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 83024856
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 81976280
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 80927704
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 79879128
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 78830552
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 77781976
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 76257608
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 75209032
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 74160456
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 73111880
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 72349696
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 71303168
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 70254592
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 69206016
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 68157440
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 67108864
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 66060288
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 65011712
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 63963136
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 62914560
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 61865984
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 60817408
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 59768832
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 58720256
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 57671680
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 56623104
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 55574528
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 54525952
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 53477376
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 52428800
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 50945656
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 49897080
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 48845968
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 47797392
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 46748816
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 45700240
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 44651664
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 43603088
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 42554512
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 41505936
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 40457360
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 39408784
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 38360208
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 37311632
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 36263056
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 130023424, Free Memory: 35214480
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 390070272, Free Memory: 293832032
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 390070272, Free Memory: 292783456
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 390070272, Free Memory: 291734880
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 390070272, Free Memory: 290686304
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 390070272, Free Memory: 289637728
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 390070272, Free Memory: 288589152
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 390070272, Free Memory: 287540576
 * Timestamp: Wed Apr 17 08:48:42 IST 2024, Heap Size: 390070272, Free Memory: 286492000
 * Timestamp: Wed Apr 17 08:48:43 IST 2024, Heap Size: 390070272, Free Memory: 285443424
 * Timestamp: Wed Apr 17 08:48:43 IST 2024, Heap Size: 390070272, Free Memory: 284394848
 * Timestamp: Wed Apr 17 08:48:43 IST 2024, Heap Size: 390070272, Free Memory: 283346272
 * Timestamp: Wed Apr 17 08:48:43 IST 2024, Heap Size: 390070272, Free Memory: 282297696
 * Total time taken: 153 ms
 */