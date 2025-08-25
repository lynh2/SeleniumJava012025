package Lesion1_IF_Else_Switch_Case;

public class DemoIFElse {

//    Các khác khi viết hàm có mệnh đề điều kiện bên ngoài hàm main
    public static String xepLoai(int diem) {
        if (diem >= 90) {
            return ("Loại Xuất Sắc"); //Hàm có kq trả về nên dùng return để trả ra kết quả
        } else if (diem < 90 && diem >= 80) {
            return ("Loại Khá");
        } else if (diem < 80 && diem >= 70) {
            return ("Loại Trung Bình");
        } else {
            return ("Loại Yếu");
        }
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        String expected = "Customer Summary";

//        Mệnh đề IF
        if (a < b) {
            System.out.println("a < b");
        }

        if (expected.equals("Customer Summary")) {
            System.out.println("Passed");
        }

        if ((a < b) && (expected.equals("Customer Summary"))) {
            System.out.println("TC Passesd");
        }

        if ((a > b) || (expected.equals("Customer Summary"))) {
            System.out.println("TC2 Passed");
        }

//        Mệnh đề IF Else
        if (a > b) {
            System.out.println("A > B");
        } else {
            System.out.println("A < B");
        }

//        Mệnh đề IF Else IF
        double marks = 7.8;
        if (marks < 4.0) {
            System.out.println("TẠCH");
        } else if (marks >= 4.0 && marks < 6.0) {
            System.out.println("Xếp loại D");
        } else if (marks >= 6.0 && marks < 7.5) {
            System.out.println("Xếp loại C");
        } else if (marks >= 7.5 && marks < 8.5) {
            System.out.println("Xếp loại B");
        } else if (marks >= 8.5 && marks < 10) {
            System.out.println("Xếp loại A");
        } else {
            System.out.println("Giá trị không hợp lệ");
        }

        int diem = 95;
        System.out.println("Kết quả: " + xepLoai(diem)); //cần hàm để in ra kết quả

    }
}
