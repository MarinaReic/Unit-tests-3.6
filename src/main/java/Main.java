public class Main {
    public static void main(String[] args) {
        long[] salesJan2022 = {38, 137, 197, 187, 14, 91, 55, 135, 92, 5, 22, 158, 100, 153, 32, 90, 194, 36, 116, 118, 87, 29, 133, 120, 6, 109, 124, 86, 101, 69, 97};
        SalesManager january2022 = new SalesManager(salesJan2022);
        long bestJan2022 = january2022.max();
        System.out.println("Лучший результат продаж в январе 2022 - " + bestJan2022 + " штук за один день!");

        long averageJan2022 = january2022.average();
        System.out.println("Обрезанное среднее количество продаж в январе 2022 составило " + averageJan2022);
    }
}
