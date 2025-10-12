import java.util.Scanner;

public class HammingAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] inp = {1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1};
        
        int[] msg = {-1, -1, 1, -1, 1, 0, 0, -1, 0, 0, 0, 1, 1, 1, 0, -1, 1, 0, 1};
        
        System.out.print("Enter parity scheme (ODD or EVEN): ");
        String Parsch = scanner.next().toUpperCase();
        
        int msglenght = msg.length;
        
        System.out.println("\n--- Calculating Parity Bits ---");
        
        calculateH1(msg, msglenght, Parsch);
        calculateH2(msg, msglenght, Parsch);
        calculateH3(msg, msglenght, Parsch);
        calculateH4(msg, msglenght, Parsch);
        calculateH5(msg, msglenght, Parsch);
        
        System.out.println("\n--- Final Hamming Code ---");
        System.out.print("Message: ");
        for (int i = 0; i < msglenght; i++) {
            System.out.print(msg[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
    public static void calculateH1(int[] msg, int msglenght, String Parsch) {
        int s1 = 0;
        int h1 = 0;
        for (int i = 1; i < msglenght; i += 2) {
            if (msg[i] != -1) {
                s1 = s1 + msg[i];
            }
        }
        
        int r = s1 % 2;
        
        if (Parsch.equals("ODD")) {
            if (r != 0) {
                h1 = 0;  
            } else {
                h1 = 1;  
            }
        } else {
            if (r == 0) {
                h1 = 0;  
            } else {
                h1 = 1;  
            }
        }
        
        msg[0] = h1;
        System.out.println("H1 (Position 1): Sum=" + s1 + ", Parity Bit=" + h1);
    }
    
    public static void calculateH2(int[] msg, int msglenght, String Parsch) {
        int s2 = 0;
        int h2 = 0;
        
        for (int i = 2; i <= msglenght; i++) {
            // Check if bit 1 is set in position number
            if ((i & 2) != 0) {
                if (msg[i - 1] != -1) {
                    s2 = s2 + msg[i - 1];
                }
            }
        }
    
        int r = s2 % 2;
        
        if (Parsch.equals("ODD")) {
            if (r != 0) {
                h2 = 0;
            } else {
                h2 = 1;
            }
        } else {
            if (r == 0) {
                h2 = 0;
            } else {
                h2 = 1;
            }
        }
        
        msg[1] = h2;  // Store at position 2 (index 1)
        System.out.println("H2 (Position 2): Sum=" + s2 + ", Parity Bit=" + h2);
    }

    public static void calculateH3(int[] msg, int msglenght, String Parsch) {
        int s3 = 0;
        int h3 = 0;
        for (int i = 4; i <= msglenght; i++) {
            // Check if bit 2 is set in position number
            if ((i & 4) != 0) {
                if (msg[i - 1] != -1) {
                    s3 = s3 + msg[i - 1];
                }
            }
        }
        
        int r = s3 % 2;
        
        if (Parsch.equals("ODD")) {
            if (r != 0) {
                h3 = 0;
            } else {
                h3 = 1;
            }
        } else {
            if (r == 0) {
                h3 = 0;
            } else {
                h3 = 1;
            }
        }
        
        msg[3] = h3;  
        System.out.println("H3 (Position 4): Sum=" + s3 + ", Parity Bit=" + h3);
    }

    public static void calculateH4(int[] msg, int msglenght, String Parsch) {
        int s4 = 0;
        int h4 = 0;
        for (int i = 8; i <= msglenght; i++) {
            if ((i & 8) != 0) {
                if (msg[i - 1] != -1) {
                    s4 = s4 + msg[i - 1];
                }
            }
        }
        
        int r = s4 % 2;
        
        if (Parsch.equals("ODD")) {
            if (r != 0) {
                h4 = 0;
            } else {
                h4 = 1;
            }
        } else {
            if (r == 0) {
                h4 = 0;
            } else {
                h4 = 1;
            }
        }
        
        msg[7] = h4;
        System.out.println("H4 (Position 8): Sum=" + s4 + ", Parity Bit=" + h4);
    }
    
    public static void calculateH5(int[] msg, int msglenght, String Parsch) {
        int s5 = 0;
        int h5 = 0;
        for (int i = 16; i <= msglenght; i++) {
            // Check if bit 4 is set in position number
            if ((i & 16) != 0) {
                if (msg[i - 1] != -1) {
                    s5 = s5 + msg[i - 1];
                }
            }
        }
        
        int r = s5 % 2;
        
        if (Parsch.equals("ODD")) {
            if (r != 0) {
                h5 = 0;
            } else {
                h5 = 1;
            }
        } else {
            if (r == 0) {
                h5 = 0;
            } else {
                h5 = 1;
            }
        }
        
        msg[15] = h5;  // Store at position 16 (index 15)
        System.out.println("H5 (Position 16): Sum=" + s5 + ", Parity Bit=" + h5);
    }

}
