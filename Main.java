public class Main {
    public static void main(String[] args) {


        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};


        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };

        System.out.println("-------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------------");
        System.out.println(" \t\t  PS5 \t\t  XBOX \t\t  SWITCH");

        for (int i = 0; i < sales.length; i++) {
            System.out.print(cities[i] + "\t ");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + "\t\t ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------");

        int maxTotal = 0;
        String topCity = "";


        for (int i = 0; i < cities.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            System.out.println(cities[i] + "\t " + total);

            if (total > maxTotal) {
                maxTotal = total;
                topCity = cities[i];
            }
        }
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("-------------------------------------------------");
    }
}