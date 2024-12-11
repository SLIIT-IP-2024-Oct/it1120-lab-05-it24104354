public class IT24204354Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_FOR_3_TO_4_DAYS = 0.01;
        final double DISCOUNT_FOR_5_OR_MORE = 0.02;
        double discountRate = 0;
        int startDate, endDate, numberOfDaysReserved;
        double totalAmountForDiscount, fullDiscountAmount, fullAmountToBePaid;
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the start date: ");
        startDate = input.nextInt();
        System.out.print("Enter the end date: ");
        endDate = input.nextInt();
        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Start date and end date cannot be less than 1 or greater than 31.");
            return;
        }
        if (endDate <= startDate) {
            System.out.println("End date should be greater than the start date.");
            return;
        }
        
        numberOfDaysReserved = endDate - startDate;
        System.out.println("Number of Days Reserved: " + numberOfDaysReserved);
        
        if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
            discountRate = DISCOUNT_FOR_3_TO_4_DAYS;
        } else if (numberOfDaysReserved >= 5) {
            discountRate = DISCOUNT_FOR_5_OR_MORE;
        }
        
        totalAmountForDiscount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
        fullDiscountAmount = discountRate * totalAmountForDiscount;
        fullAmountToBePaid = totalAmountForDiscount - fullDiscountAmount;
       
        System.out.println("Total Amount to be Paid: " + fullAmountToBePaid);
        input.close();
    }
}