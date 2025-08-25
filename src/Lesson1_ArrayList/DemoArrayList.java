package Lesson1_ArrayList;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList <String> listMenu = new ArrayList<>();
        //khai báo 1 ArrayList có tên là listMenu
        //có kiểu là String

        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Sales");
        listMenu.add("Contracts");
        listMenu.add("Subscriptions");
        listMenu.add("Expenses");
        listMenu.add("Contracts");

        //listMenu.remove("Sales"); //Xoá giá trị
        listMenu.remove(2); // Xoá theo vị trí thứ 2
        listMenu.add(2, "Projects"); //Thêm giá trị vào vị trí thứ 2

        System.out.println("Check value: " + listMenu.contains("Contracts123"));

        //Kiểm tra xem Expenses có tồn tại trong list không
        System.out.println(listMenu.indexOf("Contracts")); //Tìm vị trí tại kết quả đầu tiên
        System.out.println(listMenu.lastIndexOf("Contracts"));//Tìm vị trí ở kết quả cuối cùng
        System.out.println("****************");

        for (int i = 0; i < listMenu.size(); i++){   //đối với array nói chung thì luôn bắt đầu bằng 0
            System.out.println(listMenu.get(i));
        }

        System.out.println("****************");
        Object mangMenu[] = listMenu.toArray();
        for (String item : mangMenu){
            System.out.println(item);
        }

    }
}
