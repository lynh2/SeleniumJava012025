package Lesion1_Collection;

import java.util.HashSet;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {
        Set<String> listSession = new HashSet<>();

        listSession.add("897458765355");
        listSession.add("baihocdemo");
        listSession.add("wr1432456");

        listSession.remove("wr1432456");
        //remove(o:) xoá theo giá trị. Do hàm Set không theo vị trí

        System.out.println(listSession.contains("897458765355"));//true

        System.out.println(listSession.contains("23455"));//false

        for (String session : listSession){
            System.out.println(session);
        }

    }
}
