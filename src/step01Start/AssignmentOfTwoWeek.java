package step01Start;

public class AssignmentOfTwoWeek {

    static private String result = ""; // 결제 결과

    static private int money = 5000; // 보유 금액

    static public void main(String[] args) {
        String name = "최민규";

        // 구매 대상 제품들
        int     bape    = 3500, // 빵
                gum     = 1000, // 껌
                snack   = 1500, // 과자
                alcohol = 2000; // 주류

        // buyProduct 메서드 호출
        buyProduct(name, bape);

        buyProduct(name, snack);

        buyProduct(name, alcohol);
    }

    static private void buyProduct(String customer, int product) {
        String  name        = customer, // 구매자
                success     = "성공", // 결제 성공
                failure     = "실패"; // 결제 실패

        int vat = product / 10; // 부가세(결제 금액의 10%)

        /*
         * 제품을 구매할 돈이 있을 경우 구매 후 결제 결과 '성공' 대입
         * 제품을 구매할 돈이 부족할 경우 결제 결과 '실패' 대입
         */
        if(money >= product) {
            money -= product;

            result = success;
        } else {
            result = failure;
        }

        System.out.println("--------------------- Receipt -------------------");
        System.out.println("구매자 : " + customer);
        System.out.println("결제 금액 :" + product);
        System.out.println("남은 금액 : " + money);
        System.out.println("부가세 : " + vat);
        System.out.println("결제 " + result);
        System.out.println("----------------------------------------");
    }
}
