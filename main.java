import java.util.Scanner;

public class main {
      static int pilihanMenu;
      static String ulangMenu;
      static Scanner input = new Scanner(System.in);

      public static void main(String args[]) {
            clear();
            System.out.println("==========================");
            System.out.println("1. VOLUME");
            System.out.println("2. GGS");
            System.out.println("0. Keluar");
            System.out.println("==========================");

            do {
                  while (true) {
                        System.out.print("Pilih : ");
                        Scanner input = new Scanner(System.in);
                        if (input.hasNextInt()) {
                              pilihanMenu = input.nextInt();
                              break;
                        }
                        System.out.println("Harap input angka !");
                  }

                  switch (pilihanMenu) {
                        case 0:
                              Rumus.exit();
                              break;
                        case 1:
                              Rumus.VOLUME();
                        case 2:
                              Rumus.GGS();
                        default:
                              System.out.println("Pilihan tidak ada");
                              pilihanMenu = 0;
                              break;
                  }
            } while (pilihanMenu == 0);
      }

      public static void GGS() {
            float gaya_gesek_statis, koefisien_gesek_statis, massa, percepatan_gravitasi = 10;
            clear();

            System.out.println("=====================================");
            System.out.println("Gaya Gesek Statis");
            System.out.println("=====================================");
            System.out.println("1. Mencari gaya gesek statis (N)");
            System.out.println("2. Mencari koefisien gesek statis");
            System.out.println("3. Mencari massa (kg)");
            System.out.println("0. Exit");
            System.out.println("=====================================");

            do {
                  while (true) {
                        System.out.print("Pilih : ");
                        Scanner input = new Scanner(System.in);
                        if (input.hasNextInt()) {
                              pilihanMenu = input.nextInt();
                              break;
                        }
                        System.out.println("Harap input angka !");
                  }
                  if (pilihanMenu == 0)
                        exit();

                  else if (pilihanMenu == 1) {
                        System.out.println("=====================================");
                        System.out.println("Anda ingin mencari gaya gesek :");
                        System.out.println("=====================================");

                        while (true) {
                              System.out.print("Masukkan koefisien gesek statis : ");
                              Scanner input = new Scanner(System.in);
                              if (input.hasNextFloat()) {
                                    koefisien_gesek_statis = input.nextFloat();
                                    break;
                              }
                              System.out.println("Harap input angka !");
                        }

                        while (true) {
                              System.out.print("Masukkan massa : ");
                              Scanner input = new Scanner(System.in);
                              if (input.hasNextFloat()) {
                                    massa = input.nextFloat();
                                    break;
                              }
                              System.out.println("Harap input angka !");
                        }

                        System.out.println("Hasilnya " + (koefisien_gesek_statis * massa * percepatan_gravitasi) + "N");
                  }

                  else if (pilihanMenu == 2) {
                        System.out.println("=====================================");
                        System.out.println("Anda ingin mencari koefisien gesek :");
                        System.out.println("=====================================");

                        while (true) {
                              System.out.print("Masukkan gaya gesek statis : ");
                              Scanner input = new Scanner(System.in);
                              if (input.hasNextFloat()) {
                                    gaya_gesek_statis = input.nextFloat();
                                    break;
                              }
                              System.out.println("Harap input angka !");
                        }

                        while (true) {
                              System.out.print("Masukkan massa : ");
                              Scanner input = new Scanner(System.in);
                              if (input.hasNextFloat()) {
                                    massa = input.nextFloat();
                                    break;
                              }
                              System.out.println("Harap input angka !");
                        }

                        System.out.println("Hasilnya " + (gaya_gesek_statis / massa / percepatan_gravitasi));
                  }

                  else if (pilihanMenu == 3) {
                        System.out.println("=====================================");
                        System.out.println("Anda ingin mencari massa :");
                        System.out.println("=====================================");

                        while (true) {
                              System.out.print("Masukkan gaya gesek statis : ");
                              Scanner input = new Scanner(System.in);
                              if (input.hasNextFloat()) {
                                    gaya_gesek_statis = input.nextFloat();
                                    break;
                              }
                              System.out.println("Harap input angka !");
                        }

                        while (true) {
                              System.out.print("Masukkan koefisien gesek statis : ");
                              Scanner input = new Scanner(System.in);
                              if (input.hasNextFloat()) {
                                    koefisien_gesek_statis = input.nextFloat();
                                    break;
                              }
                              System.out.println("Harap input angka !");
                        }

                        System.out.println("Hasilnya "
                                    + (gaya_gesek_statis / koefisien_gesek_statis / percepatan_gravitasi) + "kg");
                  }

                  else {
                        System.out.println("Pilihan tidak ada");
                        pilihanMenu = 0;
                  }
            } while (pilihanMenu == 0);

            while (true) {
                  Scanner input = new Scanner(System.in);
                  System.out.print("Ulangi perhitungan (Y/T) : ");
                  ulangMenu = input.nextLine();
                  if (ulangMenu.equals("Y") || ulangMenu.equals("y"))
                        GGS();
                  else if (ulangMenu.equals("T") || ulangMenu.equals("t")) {
                        System.out.print("Kembali ke Menu Utama (Y/T) : ");
                        ulangMenu = input.nextLine();
                        if (ulangMenu.equals("Y") || ulangMenu.equals("y"))
                              main(new String[0]);
                        else if (ulangMenu.equals("T") || ulangMenu.equals("t"))
                              exit();
                  }
            }
      }

      public static void clear() {
            System.out.print("\033[2J\033[1;1H");
      }

      public static void exit() {
            System.exit(0);
      }
}