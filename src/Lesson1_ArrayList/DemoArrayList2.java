package Lesson1_ArrayList;

import java.util.ArrayList;

public class DemoArrayList2 {
    public static void main(String[] args) {
        ArrayList <String> listMenu = new ArrayList<>();
        //khai báo 1 ArrayList có tên là listMenu
        //có kiểu là String

        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Sales");
        listMenu.add("Subscriptions");
        listMenu.add("Espenses");
        listMenu.add("Contracts");


        for (int i = 0; i < listMenu.size(); i++){   //đối với array nói chung thì luôn bắt đầu bằng 0
            System.out.println(listMenu.get(i));
        }

        System.out.println("****************************");
        ArrayList <String> list2 = new ArrayList<>();
        list2.addAll(listMenu); //Thêm nguyên cái listMenu vào list2
        list2.add("Tasks");
        list2.add("Reports");

        //list2.removeAll(listMenu); //Xoá những thằng chỉ định
        list2.retainAll(listMenu); //Xoá ngược, xoá những thằng không chỉ định

        for (int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i));
        }
        System.out.println("++++++++++++++++++++++");

        //Mở rộng kiểu dữ liệu Object( Chứa nhiều kiểu giá trị khác)
        ArrayList <Object> list3 = new ArrayList<>();
        list3.add("100");
        list3.add(10);
        for (int i = 0; i < list3.size(); i++){
            System.out.println(list3.get(i));
            System.out.println(list3.get(i) == "10");
            System.out.println("++++++++++++++++++++++++++");
            //System.out.println(Integer.parseInt(list3.get(i)));
        }

    }
}
