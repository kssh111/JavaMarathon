package day11;

public class test {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println(warehouse + " " + picker + " " + courier);
        picker.doWork();
        courier.doWork();
        System.out.println(warehouse + " " + picker + " " + courier);



        for(int i = 0;i<=1500;i++){
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println(warehouse + " " + picker + " " + courier);
    }
}
