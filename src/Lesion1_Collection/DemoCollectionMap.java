package Lesion1_Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {

        Map<String, String> listDevices = new HashMap<>();

        listDevices.put("device1", "Windows");
        listDevices.put("device2", "MacOS");
        listDevices.put("device1", "Linux");

        for (Map.Entry<String, String> entry : listDevices.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
