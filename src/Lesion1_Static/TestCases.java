package Lesion1_Static;

public class TestCases {

    //    Hàm ko phải static, lấy ví dụ gọi biến static
    public static void testAddNewProject() {
        System.out.println(DataConstants.browser);
    }


    public static void testLoginSuccess() {
        System.out.println("Open browser " + DataConstants.browser);
        System.out.println("Navigate to url " + DataConstants.url);
        System.out.println("Enter email and password");
        System.out.println("Click login button");
        System.out.println("Verify...");
    }

    public static void testAddCustomer() {
        testLoginSuccess();
        System.out.println("Click menu Customer");
        System.out.println("Click button Add New Customer");
        System.out.println("Enter ");
        System.out.println("Click save button");
        System.out.println("Verify....");
    }

    public static void testAddNewTask() {
        testLoginSuccess();
        DataConstants.clickElement("Menu Task");
        DataConstants.clickElement("Add Task");
        System.out.println("Input data for task");
        DataConstants.clickElement("Button Save Task");
        System.out.println("Verify......");
    }

    public static void main(String[] args) {
//        Gọi thông qua khai báo đối tượng class
//        TestCases testCases = new TestCases();
//        testCases.testLoginSuccess();

        testLoginSuccess();
        System.out.println("========================");
        testAddCustomer();

        TestCases testCase = new TestCases();
        testAddNewProject();

        System.out.println(DataConstants.browser);

        System.out.println("========================");
        testAddNewTask();
    }
//    Hàm static dùng để khai báo 1 hàm xủ lý chung
}
