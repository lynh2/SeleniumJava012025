package Lesion1_Static;

public class KhoiStatic {

//    Khối static dùng để chạy trước hàm main hoặc trước nhất trong class này
//    Tự động chạy, khong gọi lại sủ dụng được
    static {
        System.out.println("Setup môi trường");
    }

    public void getInfor() {
        System.out.println("Name: Huong Ly");
    }

    public static void main(String[] args) {
        System.out.println("Login test");
    }
}
