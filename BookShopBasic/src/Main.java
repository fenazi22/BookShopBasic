import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String[] names = new String[100];
        String[] author = new String[100];
        int[] price = new int[100];
        int index = -1;
        while (true) {
            System.out.println("--- Main  Menu ---");
            System.out.println("1- Display all book");
            System.out.println("2- add Book");
            System.out.println("3- update Book");
            System.out.println("4- Delete Book");
            System.out.println("5- Search Book");
            System.out.println("6- Exit");
            char choice = input.nextLine().charAt(0);
            switch (choice) {
                case '2':
                    //Add Book;
                    System.out.println("how many book you want input: ");
                    int addBooks = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < addBooks; i++) {
                        System.out.println("Enter Book name:");
                        String names1 = input.nextLine();
                        System.out.println("Enter author Book name:");
                        String author1 = input.next();
                        input.nextLine();
                        System.out.println("Enter  price of Book:");
                        int price1 = input.nextInt();
                        input.nextLine();
                        names[i] = names1;
                        author[i] = author1;
                        price[i] = price1;
                        index++;
                    }
                    break;
                //Display Book;
                case '1':
                    System.out.println("name\t author \t price");
                    for (int i = 0; i <= index; i++) {
                          if (names[i] == null) continue;
                        System.out.print(names[i] + "\t" + author[i] + " \t\t" + price[i] + "\n");
                    }
                    break;

                //Update Book
                case '3':
                    System.out.println("Enter name of book");
                    String searchBookName2 = input.nextLine();
                    boolean found2 = false;
                    for (int i = 0; i < names.length; i++) {
                        if(names[i]==null)continue;
                        if (searchBookName2.equalsIgnoreCase(names[i]) ) {
                            System.out.println("name\t author \t price");
                            System.out.print(names[i] + "\t" + author[i] + " \t\t" + price[i] + "\n");
                            found2 = true;
                            System.out.println("if you want update y/n:");
                            char choice1=input.nextLine().charAt(0);
                            switch (choice1){
                                case 'y':
                                    System.out.println("Enter Book name:");
                                    String names1 = input.nextLine();
                                    System.out.println("Enter author Book name:");
                                    String author1 = input.next();
                                    input.nextLine();
                                    System.out.println("Enter  price of Book:");
                                    int price1 = input.nextInt();
                                    input.nextLine();
                                    names[i] = names1;
                                    author[i] = author1;
                                    price[i] = price1;
                                    break;
                                case 'n':
                                    System.out.println("thanks");
                                    break;
                                default:
                                    System.out.println("your input wrong!");
                                    break;
                            }
                            break;
                        }
                    }
                    if (found2 == false) {
                        System.out.println("Sorry Not found " + searchBookName2);
                    }



                    break;


                //Delete Book
                case '4':
                    System.out.println("Enter name of book");
                    String searchBookName1 = input.nextLine();
                    boolean found1 = false;
                    for (int i = 0; i < names.length; i++) {
                        if(names[i]==null)continue;
                        if (searchBookName1.equalsIgnoreCase(names[i]) ) {
                            System.out.println("name\t author \t price");
                            names[i]=null;
                            author[i]=null;
                            if(names[i]==null)continue;
                            System.out.print(names[i] + "\t" + author[i] + " \t\t" + price[i] + "\n");
                            found1 = true;

                            break;
                        }
                    }
                    if (found1 == false) {
                        System.out.println("Sorry Not found " + searchBookName1);
                    }

                    break;

                // Search Book
                case '5':
                    System.out.println("Enter name of book");
                    String searchBookName = input.nextLine();
                    boolean found = false;
                    for (int i = 0; i < names.length; i++) {
                            if(names[i]==null)continue;
                        if (searchBookName.equalsIgnoreCase(names[i]) ) {
                            System.out.println("name\t author \t price");
                            System.out.print(names[i] + "\t" + author[i] + " \t\t" + price[i] + "\n");
                            found = true;
                            break;
                        }
                    }
                    if (found == false) {
                        System.out.println("Sorry Not found " + searchBookName);
                    }

                    break;

                // Exit
                case '6':
                    System.out.println("--- thanks for use My Application, bye ---");
                    System.exit(0);
                    break;

                default:
                    System.out.println("your input wrong!");
                    break;
            }

        }


    }
}