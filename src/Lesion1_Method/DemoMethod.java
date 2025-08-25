package Lesion1_Method;

public class DemoMethod {

//    Hàm không trả về kết quả
    public static void login() {
        System.out.println("Set email");
        System.out.println("Set password");
        System.out.println("Click login button");
//        return; //null
    }

//    Hàm có trả về kết quả
    public static String getHeaderPage() {
        System.out.println("Dùng Selenium lấy được cái header page");
        String header = "Custmers Summary";
        return header;
    }

//    Hàm có tham số
    public static void login(String email, String password) {
        System.out.println("Set email: " + email);
        System.out.println("Set password: " + password);
        System.out.println("Click login button");
//        Phân quyền xử lý cho 15 roles
    }

//    GÍA TRỊ TRẢ VỀ CỦA METHOD
//    Phương thức sum trả về kiểu int, là tổng của hai tham số
    public static int sum(int a, int b) {
//        phương thức kết thúc khi gặp return
        return a + b;
    }

    public static int getCustomerTotal() {
//        Dùng Selenium để get CustomerTotal
        int customerTotal = 350;
        return customerTotal;
    }

    public static int getCustomerDeActive() {
        int customerDeActive = 150;
        return customerDeActive;
    }

    public static void main(String[] args) {
//        login();
//        getHeaderPage();

//        VD tạo ra biến kiểu chuỗi
//        String value1 = login(); //hàm login ko thể trả về kết quả
        String value2 = getHeaderPage();
        System.out.println(value2);

        login("admin@example.com","123456");
        login("customer@example.com","1234");

//        System.out.println(sum(123, 456));
//        Cách khác tạo ra 1 cái biến (clean code là code sạch dễ học dễ hiểu, dễ sửa
        int valueSum = sum(123,456);
        System.out.println(valueSum);

        System.out.println(getCustomerTotal() + getCustomerDeActive());
    }
}
