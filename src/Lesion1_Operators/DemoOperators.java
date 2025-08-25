package Lesion1_Operators;

public class DemoOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;
        //String s = (a%b == 0) ? "a chia hết cho b" : "a không chia hết cho b";
        //số học
        System.out.println("a % b =" + (a % b));

        System.out.println(a++);//in ra sẽ lấy đúng giá trị biến, chưa tính cộng thêm
        //int c = a;

        //b++;
        c = a + b;//Chỉ nên ++ và -- cho 1 biến, ko mang kết hợp cho phép toán
        //Muốn đưa vào biểu thức thì phải cộng biến b trước rồi mới tính vào b.thức sau
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        //Toán tử Logic - kết hợp nhiều điều kiện/ phép toán
        System.out.println("Logic: " + ((a < b) && (b > c)));
        System.out.println("Logic: " + ((a < b) || (b > c)));


        String actualHeader = "";//dùng Selenium get ra header
    }
}
