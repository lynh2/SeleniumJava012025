package Lesion1_Array;

public class DemoArray3 {
    public static void main(String[] args) {
        String listMenu[] = {"Dashboard", "Customers", "Projects", "Tasks"};

        for (int i = 0; i < listMenu.length; i++) {
            if(listMenu[2].equals("Projects")){
                System.out.println("Có chứa giá trị menu Projects"); //Pass/Fail
                break;
            }
        }

        System.out.println("********************");
        for(String menu : listMenu){
            if(menu.equals("Projects")){
                System.out.println("Có chứa giá trị menu Projects"); //Pass/Fail
                break;
            }
        }
    }
}
