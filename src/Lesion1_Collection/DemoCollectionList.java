package Lesion1_Collection;

import java.util.ArrayList;
import java.util.List;

public class DemoCollectionList {
    public static void main(String[] args) {
        List<String> listMenu = new ArrayList<>();

        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Task");

        listMenu.remove(1);

        System.out.println(listMenu.size()); //hàm size tính tổng số phần tử

        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i));
        }
    }
}
