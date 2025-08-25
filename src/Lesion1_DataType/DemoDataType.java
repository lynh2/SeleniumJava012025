package Lesion1_DataType;

public class DemoDataType {

    public static void main(String[] args) {

        String customer_name = "KiotViet";
        String customerName = "Viettel VTCC";
        String CUSTOMER_NAME = "VNPT IT"; //dùng cách khai báo nào cũng được

        char kitu = 'A'; // dùng dấu ngoặc đơn, chỉ 1 ký tự, số không âm

        int so_nguyenDuong = 2147483647;
        int so_nguyenAm = -2147483648;
        System.out.println(so_nguyenAm);

        long soNguyenDuongLong = 10147483648L;
        System.out.println(soNguyenDuongLong);

        float soThucFloat = 10.5356F;
        System.out.println(soThucFloat);

        double soThucDouble = 10.1284598275D;
        System.out.println(soThucDouble);

    }
}
