package whatever.Decent_game;

import java.util.*;

public class where_am_i
{
    public static void main(String[] args){
        working game_obj = new working();
        game_obj.moving();
        end_game end_game_obj= new end_game();
        end_game_obj.finished();
    }
}

class traders
{
    Scanner sc= new Scanner(System.in);
    Random rn= new Random();
    int choice,enc=1;
    int total_balance=500;
    int serum_pr,fuel_pr,meds_pr,alco_pr,radio_pr,flash_pr,ammo_pr,food_pr=10;
    float total_weight=0f,max_weight=20f,serum_kg=5.5f,fuel_kg=2.5f,meds_kg=3f,alco_kg=5f,radio_kg=10.5f,flash_kg=7.5f,ammo_kg=15f;
    int food_avl=5,fuel_avl=0,serum_avl=0,meds_avl=0,alco_avl=0,radio_avl=0,flash_avl=0,ammo_avl=0;
    int[] fuel_ar= new int[10];
    int [] serum_ar= new int[10];
    int[] meds_ar= new int[10];
    int[] alco_ar= new int[10];
    int[] radio_ar= new int[3];
    int[] flash_ar= new int[5];
    int[] ammo_ar= new int[3];

    int serum_i=-1,fuel_i=-1,meds_i=-1,alco_i=-1,radio_i=-1,flash_i=-1,ammo_i=-1;
    public void aron(){
        System.out.println("(Aron): Welcome traveller! How may I help you today?\n1.Buy\n2.Sell\n3.Leave");
        choice=sc.nextInt();

        if(choice==1){
            System.out.println("*He pulls out his wares*\n(Aron): I have all kinds of stuffs you can buy:");
            do{
                System.out.print("1. ");
                Serum_buy_display();
                System.out.print("2. ");
                Fuel_buy_display();
                System.out.print("3. ");
                Canned_Food();
                System.out.println("4. Leave");

                choice = sc.nextInt();

                if (choice == 1) {
                    Serum_buy();
                } else if (choice == 2) {
                    Fuel_buy();
                } else if (choice == 3) {
                    Food_buy();
                }
                System.out.println("(Aron): Would you like to buy more stuff?\n1.Yes\n2.No");
                choice=sc.nextInt();
            }while(choice==1);
            System.out.println("*Aron closes his wares*\n(Aron): Come back when you want to do business!");
            System.out.println("*You decide to leave..*");
        }
        else if(choice==2){
            System.out.println("(Aron): Here's a list of what I'm willing to pay:");
            do {
                System.out.print("1. ");
                Serum_sell_display();
                System.out.print("2. ");
                Fuel_sell_display();
                System.out.print("2. ");
                Ammunition_sell_display();
                System.out.println("4. Leave");
                choice = sc.nextInt();

                if (choice == 1) {
                    Serum_sell();
                } else if (choice == 2) {
                    Fuel_sell();
                } else if (choice == 3) {
                    Ammunition_sell();
                }
                System.out.println("(Aron): Would you like to sell more stuff?\n1.Yes\n2.No");
                choice=sc.nextInt();
            }while(choice==1);
            System.out.println("*Aron closes his wares*\n(Aron): Come back when you want to do business!");
            System.out.println("*You decide to leave..*");
            }
        else{
            System.out.println("*You decide to leave..*");
        }
    }

    public void rudy(){
        System.out.println("(Rudy): Welcome in! What do you need?\n1.Buy\n2.Sell\n3.Leave");
        choice=sc.nextInt();

        if(choice==1){
            System.out.println("\n(Rudy): Looking for anything in particluar?:");
            do{
                System.out.print("1. ");
                Radio_buy_display();
                System.out.print("2. ");
                Serum_buy_display();
                System.out.print("3. ");
                Meds_buy_display();
                System.out.print("4. ");
                Canned_Food();
                System.out.println("5. Leave");

                choice = sc.nextInt();

                if (choice == 1) {
                    Radio_buy();
                } else if (choice == 2) {
                    Serum_buy();
                } else if (choice == 3) {
                    Meds_buy();
                }else if (choice == 4){
                    Food_buy();
                }
                System.out.println("(Rudy): Need anything more?\n1.Yes\n2.No");
                choice=sc.nextInt();
            }while(choice==1);
            System.out.println("*Rudy closes his wares*\n(Rudy): See ya later pal");
            System.out.println("*You decide to leave..*");
        }
        else if(choice==2){
            System.out.println("(Rudy): Here's a list of what I'm looking for:");
            do {
                System.out.print("1. ");
                Fuel_sell_display();
                System.out.print("2. ");
                Meds_sell_display();
                System.out.print("3. ");
                Flashlights_sell_display();
                System.out.print("4. ");
                Ammunition_sell_display();
                System.out.println("5. Leave");
                choice = sc.nextInt();

                if (choice == 1) {
                    Fuel_sell();
                } else if (choice == 2) {
                    Meds_sell();
                } else if (choice == 3) {
                    Flashlights_sell();
                } else if (choice == 4) {
                    Ammunition_sell();
                }
                System.out.println("(Rudy): Need anything more?\n1.Yes\n2.No");
                choice=sc.nextInt();
            }while(choice==1);
            System.out.println("*Rudy closes his wares*\n(Rudy): See ya later pal");
            System.out.println("*You decide to leave..*");
        }
        else{
            System.out.println("*You decide to leave..*");
        }
    }

    public void lumina(){
        System.out.println("(Lumina): Oh dear, welcome in! How can I assist you today?\n1.Buy\n2.Sell\n3.Leave");
        choice=sc.nextInt();

        if(choice==1){
            System.out.println("\n(Lumina): Interesting choice!:");
            do{
                System.out.print("1. ");
                Meds_buy_display();
                System.out.print("2. ");
                Flashlights_buy_display();
                System.out.print("3. ");
                Fuel_buy_display();
                System.out.print("4. ");
                Canned_Food();
                System.out.println("5. Leave");

                choice = sc.nextInt();

                if (choice == 1) {
                    Meds_buy();
                } else if (choice == 2) {
                    Flashlights_buy();
                } else if (choice == 3) {
                    Fuel_buy();
                }else if (choice == 4){
                    Food_buy();
                }
                System.out.println("(Lumina): Anything else?\n1.Yes\n2.No");
                choice=sc.nextInt();
            }while(choice==1);
            System.out.println("*Lumina closes her wares*\n(Lumina): Have a safe day dear!");
            System.out.println("*You decide to leave..*");
        }
        else if(choice==2){
            System.out.println("(Lumina): Do you happen to have any of these:");
            do {
                System.out.print("1. ");
                Fuel_sell_display();
                System.out.print("2. ");
                Alcohol_sell_display();
                System.out.print("3. ");
                Serum_sell_display();
                System.out.print("4. ");
                Ammunition_sell_display();
                System.out.print("5. ");
                Radio_sell_display();
                System.out.println("6. Leave");
                choice = sc.nextInt();

                if (choice == 1) {
                    Fuel_sell();
                } else if (choice == 2) {
                    Alcohol_sell();
                } else if (choice == 3) {
                    Serum_sell();
                } else if (choice == 4) {
                    Ammunition_sell();
                } else if (choice == 5){
                    Radio_sell();
                }
                System.out.println("(Lumina): Anything else?:)\n1.Yes\n2.No");
                choice=sc.nextInt();
            }while(choice==1);
            System.out.println("*Lumina closes her wares*\n(Lumina): Have a safe day dear!");
            System.out.println("*You decide to leave..*");
        }
        else{
            System.out.println("*You decide to leave..*");
        }
    }

    public void edric(){
        System.out.println("(Edric): Welcome to the best trade house in town..\n1.Buy\n2.Sell\n3.Leave");
        choice=sc.nextInt();

        if(choice==1){
            System.out.println("\n(Edric): Take a look buddy:");
            do{
                System.out.print("1. ");
                Fuel_buy_display();
                System.out.print("2. ");
                Serum_buy_display();
                System.out.print("3. ");
                Alcohol_buy_display();
                System.out.print("4. ");
                Canned_Food();
                System.out.println("5. Leave");

                choice = sc.nextInt();

                if (choice == 1) {
                    Fuel_buy();
                } else if (choice == 2) {
                    Serum_buy();
                } else if (choice == 3) {
                    Alcohol_buy();
                }else if (choice == 4){
                    Food_buy();
                }
                System.out.println("(Edric): Need anything more?\n1.Yes\n2.No");
                choice=sc.nextInt();
            }while(choice==1);
            System.out.println("*Edric closes his wares*\n(Edric): Later");
            System.out.println("*You decide to leave..*");
        }
        else if(choice==2){
            System.out.println("(Edric): Got anything from this list?:");
            do {
                System.out.print("1. ");
                Radio_sell_display();
                System.out.print("2. ");
                Flashlights_sell_display();
                System.out.print("3. ");
                Meds_sell_display();
                System.out.print("4. ");
                Ammunition_sell_display();
                System.out.println("5. Leave");
                choice = sc.nextInt();

                if (choice == 1) {
                    Radio_sell();
                } else if (choice == 2) {
                    Flashlights_sell();
                } else if (choice == 3) {
                    Meds_sell();
                } else if (choice == 4) {
                    Ammunition_sell();
                }
                System.out.println("(Edric): Anything else?:)\n1.Yes\n2.No");
                choice=sc.nextInt();
            }while(choice==1);
            System.out.println("*Edric closes his wares*\n(Edric): Later..");
            System.out.println("*You decide to leave..*");
        }
        else{
            System.out.println("*You decide to leave..*");
        }
    }

    public void Krypton_8(){
        if(enc==1) {
            System.out.println("*You hear a twig crackle behind you*\n(Anon): Don't turn back..I have a special item that you can sell for good money. Would ya like to see it?\n1.Yes\n2.No");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("(Krp_8): here...");
                System.out.print("1. ");
                Ammunition_buy_display();
                System.out.println("What do ya think?\n1.I'll take it\n2.I don't want to get involved in shady stuff");
                choice = sc.nextInt();
                if (choice == 1) {
                    Ammunition_buy();
                    System.out.println("*Now walk away and don't ever come back*");
                } else {
                    System.out.println("Huh, weakling...get out of my sight!");
                }
            } else {
                System.out.println("*You quickly turn around but the mysterious figure has already disappeared....*");
            }
            enc++;
        }
        else{
            System.out.println("You often wonder if that character will ever return one day.....");
        }
    }
    //Traders

    public void Serum_buy_display(){
        serum_pr=rn.nextInt(35,56);
        System.out.println("Serum 'X': "+serum_pr+"$\t"+serum_kg+"kg");
    }

    public void Serum_buy(){
        if((total_balance-serum_pr>=0) && total_weight+serum_kg<=max_weight){
            total_weight = total_weight + serum_kg;
            total_balance = total_balance - serum_pr;
            serum_avl++;
            serum_i++;
            serum_ar[serum_i] = serum_pr;

            System.out.println("Added to inventory!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else{
            System.out.println("Unable to buy item!");
        }
    }

    public void Serum_sell_display(){
        serum_pr=rn.nextInt(30,51);
        System.out.println("Serum 'X': "+serum_pr+"$");
    }

    public void Serum_sell(){
        if(serum_avl>0) {
            total_balance = total_balance + serum_pr;
            total_weight = total_weight - serum_kg;
            serum_avl--;
            serum_i--;
            System.out.println("1 Serum 'X' sold!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else
            System.out.println("You don't have this particular item!");
    }
    //Serum ends here

    public void Fuel_buy_display(){
        fuel_pr= rn.nextInt(10,19);
        System.out.println("Fuel Cell: "+fuel_pr+"$\t"+fuel_kg+"kg");
    }

    public void Fuel_buy(){
        if((total_balance-fuel_pr>=0) && total_weight+fuel_kg<=max_weight){
            total_weight= total_weight+fuel_kg;
            total_balance=total_balance-fuel_pr;
            fuel_avl++;
            fuel_i++;
            fuel_ar[fuel_i]=fuel_pr;

            System.out.println("Added to inventory!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else{
            System.out.println("Unable to buy item!");
        }
    }

    public void Fuel_sell_display(){
        fuel_pr=rn.nextInt(8,16);
        System.out.println("Fuel Cell: "+fuel_pr+"$");
    }

    public void Fuel_sell(){
        if(fuel_avl>0) {
            total_balance = total_balance + fuel_pr;
            total_weight = total_weight - fuel_kg;
            fuel_avl--;
            fuel_i--;
            System.out.println("1 Fuel Cell sold!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else
            System.out.println("You don't have this particular item!");
    }
    //Fuel ends here

    public void Meds_buy_display(){
        meds_pr=rn.nextInt(85,126);
        System.out.println("Med-Kit: "+meds_pr+"$\t"+meds_kg+"kg");
    }

    public void Meds_buy(){
        if((total_balance-meds_pr>=0) && total_weight+meds_kg<=max_weight){
            total_weight = total_weight + meds_kg;
            total_balance = total_balance - meds_pr;
            meds_avl++;
            meds_i++;
            meds_ar[meds_i] = meds_pr;

            System.out.println("Added to inventory!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else{
            System.out.println("Unable to buy item!");
        }
    }

    public void Meds_sell_display(){
        meds_pr=rn.nextInt(80,141);
        System.out.println("Med-Kit: "+meds_pr+"$");
    }

    public void Meds_sell(){
        if(meds_avl>0) {
            total_balance = total_balance + meds_pr;
            total_weight = total_weight - meds_kg;
            meds_avl--;
            meds_i--;
            System.out.println("1 Med-Kit sold!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else
            System.out.println("You don't have this particular item!");
    }
    //Meds end here

    public void Alcohol_buy_display(){
        alco_pr=rn.nextInt(60,96);
        System.out.println("Alcohol: "+alco_pr+"$\t"+alco_kg+"kg");
    }

    public void Alcohol_buy(){
        if((total_balance-alco_pr>=0) && total_weight+alco_kg<=max_weight){
            total_weight = total_weight + alco_kg;
            total_balance = total_balance - alco_pr;
            alco_avl++;
            alco_i++;
            alco_ar[alco_i] = alco_pr;

            System.out.println("Added to inventory!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else{
            System.out.println("Unable to buy item!");
        }
    }

    public void Alcohol_sell_display(){
        alco_pr=rn.nextInt(50,106);
        System.out.println("Alcohol: "+alco_pr+"$");
    }

    public void Alcohol_sell(){
        if(alco_avl>0) {
            total_balance = total_balance + alco_pr;
            total_weight = total_weight - alco_kg;
            alco_avl--;
            alco_i--;
            System.out.println("1 Alcohol sold!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else
            System.out.println("You don't have this particular item!");
    }
    //Alcohol ends here

    public void Radio_buy_display(){
        radio_pr=rn.nextInt(200,301);
        System.out.println("Radio: "+radio_pr+"$\t"+radio_kg+"kg");
    }

    public void Radio_buy(){
        if((total_balance-radio_pr>=0) && total_weight+radio_kg<=max_weight){
            total_weight = total_weight + radio_kg;
            total_balance = total_balance - radio_pr;
            radio_avl++;
            radio_i++;
            radio_ar[radio_i] = radio_pr;

            System.out.println("Added to inventory!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else{
            System.out.println("Unable to buy item!");
        }
    }

    public void Radio_sell_display(){
        radio_pr=rn.nextInt(150,251);
        System.out.println("Radio: "+radio_pr+"$");
    }

    public void Radio_sell(){
        if(radio_avl>0) {
            total_balance = total_balance + radio_pr;
            total_weight = total_weight - radio_kg;
            radio_avl--;
            radio_i--;
            System.out.println("1 Radio sold!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else
            System.out.println("You don't have this particular item!");
    }
    //Radio ends here

    public void Flashlights_buy_display(){
        flash_pr=rn.nextInt(100,151);
        System.out.println("Flashlight: "+flash_pr+"$\t"+flash_kg+"kg");
    }

    public void Flashlights_buy(){
        if((total_balance-flash_pr>=0) && total_weight+flash_kg<=max_weight){
            total_weight = total_weight + flash_kg;
            total_balance = total_balance - flash_pr;
            flash_avl++;
            flash_i++;
            flash_ar[flash_i] = flash_pr;

            System.out.println("Added to inventory!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else{
            System.out.println("Unable to buy item!");
        }
    }

    public void Flashlights_sell_display(){
        flash_pr=rn.nextInt(80,141);
        System.out.println("Flashlight: "+flash_pr+"$");
    }

    public void Flashlights_sell(){
        if(flash_avl>0) {
            total_balance = total_balance + flash_pr;
            total_weight = total_weight - flash_kg;
            flash_avl--;
            flash_i--;
            System.out.println("1 Flashlight sold!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else
            System.out.println("You don't have this particular item!");
    }
    //Flashlights ends here

    public void Ammunition_buy_display(){
        ammo_pr=rn.nextInt(100,151);
        System.out.println("Ammunition: "+ammo_pr+"$\t"+ammo_kg+"kg");
    }

    public void Ammunition_buy(){
        if((total_balance-ammo_pr>=0) && total_weight+ammo_kg<=max_weight){
            total_weight = total_weight + ammo_kg;
            total_balance = total_balance - ammo_pr;
            ammo_avl++;
            ammo_i++;
            ammo_ar[ammo_i] = ammo_pr;

            System.out.println("Added to inventory!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else{
            System.out.println("Unable to buy item!");
        }
    }

    public void Ammunition_sell_display(){
        ammo_pr=rn.nextInt(200,351);
        System.out.println("Ammunition: "+ammo_pr+"$");
    }

    public void Ammunition_sell(){
        if(ammo_avl>0) {
            total_balance = total_balance + ammo_pr;
            total_weight = total_weight - ammo_kg;
            ammo_avl--;
            ammo_i--;
            System.out.println("1 case of Ammunition sold!");
            System.out.println("Money: "+total_balance);
            System.out.println("Weight: "+total_weight);
        }
        else
            System.out.println("You don't have this particular item!");
    }
    //Ammo ends here

    public void Canned_Food(){
        System.out.println("Food: "+food_pr+"$");
    }

    public void Food_buy(){
        if(total_balance-food_pr>=0){
            System.out.println("Added to inventory!");
            total_balance=total_balance-food_pr;
            food_avl++;
        }
        else{
            System.out.println("Unable to buy item!");
        }
    }
}

class stats extends traders
{

    protected int energy=20,i;
    public void status(){
        System.out.println("Money: "+total_balance+"\t\t Energy: "+energy+"\t\t Weight: "+total_weight+"(max weight: 20kg)");
        System.out.println("Inventory:");
        if(serum_avl>0) {
            System.out.print("Serum 'X' - Quantity: " + serum_avl + "  Brought at: ");serum_looping();System.out.print("\t |");
        }
        if(fuel_avl>0) {
            System.out.print("Fuel Cell - Quantity: " + fuel_avl + " Brought at: ");fuel_looping();System.out.print("\t |");
        }
        if(meds_avl>0){
            System.out.print("Med_kit - Quantity: " + meds_avl + " Brought at: ");meds_looping();System.out.print("\t |");
        }
        if(alco_avl>0){
            System.out.print("Alcohol - Quantity: " + alco_avl + " Brought at: ");alco_looping();System.out.print("\t |");
        }
        if(radio_avl>0){
            System.out.print("Radio - Quantity: " + radio_avl + " Brought at: ");radio_looping();System.out.print("\t |");
        }
        if(flash_avl>0){
            System.out.print("Flashlight - Quantity: " + flash_avl + " Brought at: ");flash_looping();System.out.print("\t |");
        }
        if(ammo_avl>0){
            System.out.print("Flashlight - Quantity: " + ammo_avl + " Brought at: ");ammo_looping();System.out.print("\t |");
        }
        if(food_avl>0)
            System.out.println("Food - "+food_avl);
    }

    public void serum_looping(){
        for(i=0;i<=serum_i;i++)
            System.out.print(serum_ar[i]+", ");
    }
    public void fuel_looping(){
        for(i=0;i<=fuel_i;i++)
            System.out.print(fuel_ar[i]+", ");
    }
    public void meds_looping(){
        for(i=0;i<meds_i;i++)
            System.out.print(meds_ar[i]+",");
    }
    public void alco_looping(){
        for(i=0;i<alco_i;i++)
            System.out.print(alco_ar[i]+",");
    }
    public void radio_looping(){
        for(i=0;i<radio_i;i++)
            System.out.print(radio_ar[i]+",");
    }
    public void flash_looping(){
        for(i=0;i<flash_i;i++)
            System.out.print(flash_ar[i]+",");
    }

    public void ammo_looping(){
        for(i=0;i<ammo_i;i++)
            System.out.print(ammo_ar[i]+", ");
    }
}

class my_map extends stats
{
    Scanner sc= new Scanner(System.in);
    String[][] ar= new String[12][35]; //change row and colums here first
    String sp=" ";
    int row,column;
    int r_ch=2,c_ch=3; //Starting position of character (5,7)
    public void print_map(){
        for(row=0;row<12;row++){
            for(column=0;column<35;column++) {
                if (row == 0 || row == 11) {
                    ar[row][column]="~";
                }
                else if(column==0 || column==34){
                    ar[row][column]="|";
                }

                else if(row== r_ch && column == c_ch){
                    ar[row][column]="*";
                } //My character starting position

                //If anything has to be printed on the screen, make sure to add it in (else if)
                else if(row== 7 && column== 5){
                    ar[row][column]="$";
                } // Trader 1.

                else if(row== 9 && column == 22){
                    ar[row][column]="$";
                } // Trader 2.

                else if(row== 2 && column == 2){
                    ar[row][column]="$";
                } // Aron.

                else if(row== 4 && column == 29){
                    ar[row][column]="$";
                } // Trader 3.

                else if(row== 10 && column == 33){
                    ar[row][column]="!";
                }// Krypton-8.

                else{
                    ar[row][column]=sp;
                }
                System.out.print(ar[row][column]);
            }
            System.out.println(" ");
        }
    }
}
class working extends my_map
{
    String movement;
    working(){
        System.out.println("You eyes open....You slowly try to get up but your body hurts..\nA note falls from your pocket...\nIt reads *You'll probably not remember who I am, but that is not important. You need to collect a 1000$. I'll meet you after that, Good luck Charlie*");
        System.out.println("! You are '*'. You control your character with 'w' 'a' 's' 'd' !");
        System.out.println("Each move costs energy. You can get more energy by consuming food. Make sure your 'Energy' stat doesn't reach 0. If it does, then you are dead :(");
        System.out.println("'w' -> Move forward \t 'a' -> Move left \t 's' -> move backward \t 'd' -> Move right \t 'r' -> Eat food'");
        System.out.println("!You can also dash in any direction by hitting that particular direction key twice, BUT BE CAREFUL, it costs twice the food!");
        System.out.println("------------------------------------------------------------------------------");
    }
    public void moving() {
        status();
        print_map();
        do {
            movement = sc.next();
            switch (movement) {
                case "w" -> {
                    r_ch--;
                    energy--;
                }
                case "a" -> {
                    c_ch--;
                    energy--;
                }
                case "s" -> {
                    r_ch++;
                    energy--;
                }
                case "d" -> {
                    c_ch++;
                    energy--;
                }
                case "ww" -> {
                    r_ch=r_ch-2;
                    energy=energy-2;
                }
                case "aa" -> {
                    c_ch=c_ch-2;
                    energy=energy-2;
                }
                case "ss" -> {
                    r_ch=r_ch+2;
                    energy=energy-2;
                }
                case "dd" -> {
                    c_ch=c_ch+2;
                    energy=energy-2;
                }
                case "r" ->{
                    if(food_avl>0) {
                        food_avl--;
                        energy = energy + 10;
                    }
                    else
                        System.out.println("Wrong Input!");
                }
                case "finishthis" -> total_balance=1010;
                default -> System.out.println("Wrong Input!");
            }
                if ((r_ch < 11 && r_ch > 0) && (c_ch < 34 && c_ch > 0)) {
                    status();
                    print_map();
                    if(r_ch == 2 && c_ch == 2) {
                        aron();
                    }
                    else if(r_ch == 9 && c_ch == 22){
                        edric();
                    }
                    else if(r_ch == 7 && c_ch == 5){
                        rudy();
                    }
                    else if(r_ch == 4 && c_ch == 29) {
                        lumina();
                    }
                    else if(r_ch == 10 && c_ch == 33) {
                        Krypton_8();
                    }
                    // Add character locations here aswell!!
                }
                else {
                    System.out.println("Invalid Move!");
                    if (r_ch == 11) {
                        r_ch--;
                        energy++;
                    } else if (r_ch == 0) {
                        r_ch++;
                        energy++;
                    } else if (c_ch == 0) {
                        c_ch++;
                        energy++;
                    } else if (c_ch == 34) {
                        c_ch--;
                        energy++;
                    } else if (r_ch == 12) {
                        r_ch = r_ch - 2;
                        energy=energy+2;
                    } else if (c_ch == -1) {
                        c_ch = c_ch + 2;
                        energy=energy+2;
                    } else if (c_ch == 35) {
                        c_ch = c_ch - 2;
                        energy=energy+2;
                    } else if (r_ch == -1) {
                        r_ch = r_ch + 2;
                        energy=energy+2;
                    }
                    status();
                    print_map();
                }
            if(energy<=0){
                System.out.println("You succum to the exhaustion....Your eyes slowly shut..");
                System.out.println("DEAD......!");
                //add condition to exit game.
            }
        } while (energy>0 && total_balance<1000);
    }
}

class end_game {
    end_game() {
        System.out.println("*Something hard hits your head as you blackout...........");
        System.out.println("..........");
        System.out.println("..........");
        System.out.println("..........");
        System.out.println("..........");
        System.out.println("..........");
        System.out.println("..........");
        System.out.println("..........");
        System.out.println("..........");
        System.out.println("..........");
        System.out.println("..........");
        System.out.println("..........");
        System.out.println("..........");
        System.out.println("You slowly gain consiousness....Your eyes are are trying to adjust to the dimly light environment...Yours hands are tied and your head feels heavy");
    }

    public void finished() {
        System.out.println("(Random_person_1): You got what you asked for...");
        System.out.println("(Random_person_2): Shhhhh....Guess who's waking up over here.....\n*Your eyes finally adjust to the surrounding and you're able to see Lumina*");
        System.out.println("(Lumina): 'You've made your last delivary kid........Sorry you got twisted up in this scene. It must seem like real bad luck from where you are....'");
        System.out.println("(Lumina): 'Look, there's no good or bad here. *Lumina pulls a gun from her jacket*\nThere are the ones that live to see another day and then there is you.'");
        System.out.println("(Lumina): 'I placed that note in your pocket and you kept following orders like a little rat\nTruth is..........the game was rigged from the start*SHOT*'");
    }
}