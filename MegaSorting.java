import java.util.Scanner;

public class MegaSorting{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("\nhow many items do u want to sort?");
        int n = Scanner.nextInt();
        System.out.println("\nWhat do you want to sort?");
        System.out.println("1.Numbers");
        System.out.println("2.Names");
        System.out.print("Enter choice(1 or 2 ):");
        int dataType = Scanner.nextInt();
        System.out.println("\nWhich method do u wanna use?");
            System.out.println("1.Bubble sort");
            System.out.println("2.Selection sort");
            System.out.print("Enter choice(1 or 2):");
            int method = Scanner.nextInt();

        if(dataType == 1){
            int[] arr = new int[n];
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                arr[i] = Scanner.nextInt();
            }

            

            System.out.println("\nWhich order u wanna sort in?");
            System.out.println("1.Ascending order");
            System.out.println("2.Descending order");
            System.out.print("Enter choice(1 or 2):");
            int order = Scanner.nextInt();

            if(method == 1){
                if(order == 1){
                    for(int i = 0; i < n - 1; i++){
                        for(int j = 0; j < n - 1; j++){
                            if(arr[j] > arr[j + 1]){
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }

                }else{
                     for(int i = 0; i < n - 1; i++){
                        for(int j = 0; j < n - 1; j++){
                            if(arr[j] < arr[j + 1]){
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                }
            }else{
                if(order == 1){
                    for(int i = 0; i < n; i++){
                        int minIndex = i;
                        for(int j = i + 1; j < n; j++){
                            if(arr[j] < arr[minIndex]){
                                minIndex = j;
                            }
                        }
                        int temp = arr[minIndex];
                        arr[minIndex] = arr[i];
                        arr[i] = temp;
                    }

                    }else{
                        for(int i = 0; i < n; i++){
                        int maxIndex = i;
                        for(int j = i + 1; j < n; j++){
                            if(arr[j] > arr[maxIndex]){
                                maxIndex = j;
                            }
                        }
                        int temp = arr[maxIndex];
                        arr[maxIndex] = arr[i];
                        arr[i] = temp;
                    }
                }
            }


            

            
        }else{
            String[] arr = new String[n];
            System.out.println("Enter " + n + " names:");
            for (int i = 0; i < n; i++) {
                arr[i] = Scanner.next();
        }
        System.out.println("Sort names(1) A to Z or (2) Z to A");
        int order = Scanner.nextInt();

             if(method == 1){
                if(order == 1){
                for(int i = 0; i < n - 1; i++){
                        for(int j = 0; j < n - 1; j++){
                            if(arr[j].compareTo(arr[j + 1]) > 0){
                                String temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                }else{
                    for(int i = 0; i < n - 1; i++){
                        for(int j = 0; j < n - 1; j++){
                            if(arr[j] .compareTo(arr[j + 1]) < 0){
                                String temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                }
            
            }else{
                if(order == 1){
                    for(int i = 0; i < n; i++){
                        int minIndex = i;
                        for(int j = i + 1; j < n; j++){
                            if(arr[j].compareTo(arr[minIndex]) < 0){
                                minIndex = j;
                            }
                        }
                        String temp = arr[minIndex];
                        arr[minIndex] = arr[i];
                        arr[i] = temp;
                    }
               }else{
                    for(int i = 0; i < n; i++){
                        int maxIndex = i;
                        for(int j = i + 1; j < n; j++){
                            if(arr[j].compareTo(arr[maxIndex]) > 0){
                                maxIndex = j;
                            }
                        }
                        String temp = arr[maxIndex];
                        arr[maxIndex] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
            System.out.print("Sorted: ");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        Scanner.close();

    }
}