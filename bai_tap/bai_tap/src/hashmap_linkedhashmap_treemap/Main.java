package hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HocSinh hocSinh1 = new HocSinh("nguyen",123,"da nang");
        HocSinh hocSinh2 = new HocSinh("Hung",21, "HN");
        HocSinh hocSinh3 = new HocSinh("Ha",22, "HN");

        Map<Integer, HocSinh> hocSinhMap = new HashMap<Integer, HocSinh>();
        hocSinhMap.put(1,hocSinh1);
        hocSinhMap.put(2,hocSinh2);
        hocSinhMap.put(5,hocSinh3);
        hocSinhMap.put(4,hocSinh1);

        for (Map.Entry<Integer, HocSinh> hocsinh: hocSinhMap.entrySet()
             ) {
            System.out.println(hocsinh.toString());
        }
        System.out.println(".............Set");
        Set<HocSinh> hocSinhs = new HashSet<HocSinh>();
        hocSinhs.add(hocSinh1);
        hocSinhs.add(hocSinh2);
        hocSinhs.add(hocSinh3);
        hocSinhs.add(hocSinh1);

        for (HocSinh hocsinh : hocSinhs
             ) {
            System.out.println(hocsinh.toString());
        }
    }
}
