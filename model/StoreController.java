import java.util.ArrayList;
import java.util.Scanner;

public class StoreController {
    Scanner sc = new Scanner(System.in);
    
    //ArrayList
    ArrayList<SmartPhoneModel> phoneList = new ArrayList<>();

    public void addNewProduct() {
        System.out.println("Enter Model Code: \n");
        int mCode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Model Name: \n");
        String mName = sc.nextLine();
        System.out.println("Enter Quantity: \n");
        int Qty = sc.nextInt();
        sc.nextInt();
        System.out.println("Enter Price: \n");
        float price = sc.nextFloat();
        sc.nextInt();
        System.out.println("Enter Operating System: \n");
        String os = sc.nextLine();
        System.out.println("Enter Connectivity: \n");
        String conn = sc.nextLine();

        //Creating a Object
        SmartPhoneModel SmartphoneInventoryModel = new SmartPhoneModel(mCode, mName, Qty, price, os, conn);

        phoneList.add(SmartphoneInventoryModel);
        System.out.println("New Product Added...");
    }

    public void deleteProduct() {
        System.out.println("Enter Model Code: \n");
        int mCode = sc.nextInt();
        sc.nextLine();

        if (phoneList.isEmpty()) {
            System.out.println("Model Code not found\n");
        }

        boolean found = false;

        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getModelCode() == mCode) {
                phoneList.remove(i);
                found = true;
                System.out.println("Product deleted successfully.");
                break;
        }
    }

        if (!found) {
            System.out.println("Model Code not found.");
        }
    }

}
