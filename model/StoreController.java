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

    //Update product code
    public void updateProduct() {
        System.out.println("Enter Model Code: \n");
        int mCode = sc.nextInt();
        sc.nextLine();

        if (phoneList.isEmpty()) {
            System.out.println("Model Code not found\n");
        }

        boolean found = false;

        for (int i = 1; i < phoneList.size(); i++) {
            if (phoneList.get(i).getModelCode() == mCode) {

                //model code found now what to update
                boolean exit = false;
                int choice = 0;
                while (!exit) {
                    System.out.println("Enter data to update?");
                    System.out.println("------------------------------");
                    System.out.println("1 -> Model Name");
                    System.out.println("2 -> Quantity");
                    System.out.println("3 -> Price");
                    System.out.println("4 -> Operating System");
                    System.out.println("5 -> Connectivity");
                    System.out.println("6 -> Exit");
                    System.out.println("------------------------------");
                    choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case (1):
                            System.out.println("Enter Model Name:\n");
                            String mName = sc.nextLine();
                            phoneList.get(i).setModelName(mName);
                        break;
                        case (2):
                            System.out.println("Enter Model Quantity:\n");
                            int mQyt = sc.nextInt();
                            phoneList.get(i).setModelQty(mQyt);
                        break;
                        case (3):
                            System.out.println("Enter Model Price:\n");
                            float mPrice = sc.nextFloat();
                            phoneList.get(i).setModelPrice(mPrice);
                        break;
                        case (4):
                            System.out.println("Enter Model Operating System:\n");
                            String mOS = sc.nextLine();
                            phoneList.get(i).setOS(mOS);
                        break;
                        case (5):
                            System.out.println("Enter Model Connectivity:\n");
                            String mConn = sc.nextLine();
                            phoneList.get(i).setConnectivity(mConn);
                        break;
                        case (6):
                            exit = true;
                        break;
                        default:
                            System.out.println("Enter Valid Choice!");
                        break;
                    }
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Model Code not found!\n");
        }

    }

}
