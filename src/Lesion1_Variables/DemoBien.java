package Lesion1_Variables;

public class DemoBien {
    //Biến toàn cục ko mang bộ nhớ từ đầu đến đuôi, sẽ bị khởi tạo lại
    String country = "VietNam"; //Đây là biến toàn cục
    int zip_code = 100001; //Biến toàn cục

    //Biến static
    static String phone = "0354865300";
    public static int age = 18;


    public void HelloWorld() {
        int number = 100; //Đây là biến cục bộ dùng để khai báo và tính toán chỉ trong hàm đó
        //Biến cục bộ không được gọi dùng ở hàm khác
        int a = 5;
        int b = 6;
        b = a + number;
        //In ra biến cục bộ
        System.out.println(b);
        System.out.println(zip_code);
        //In ra biến static
        System.out.println(phone);
        System.out.println(age);
    }

    public void getInfo() {

        System.out.println(country);

        System.out.println(DemoBien.phone); //Biến static được gọi thông qua class
        //System.out.println(age);

        //System.out.println(number); //biến cục bộ ko gọi được ở hàm khác

    }

    public static void main(String[] args) { //tên hàm main có static nên dùng được biến static ko dùng được biến toàn cục
        System.out.println("Hi Java");

        String name = "Huong Ly";
        System.out.println("Xin chào mình là " + name);

        System.out.println(phone);

        //System.out.println(number); //Không gọi được biến cuc bộ từ hàm HelloWorld()

        DemoBien demoBien = new DemoBien(); //khai báo đối tượng class

        System.out.println(demoBien.country);

        System.out.println(demoBien.zip_code);

        String country = "Laos"; //Biến cục bộ trùng tên với biến toàn cục => ưu tiên biến cục bộ

        System.out.println(country);

    }
}
