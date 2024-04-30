
public class Review01 {

    public static void main(String[] args) {
       int price = 1400;
       double tax = 0.1;
       int result;
       result = tax(price, tax);
       System.out.println(price + "円の商品の税込価格は" + (price + result) + "円" + "(消費税は" + result + "円)" + "です。");
    }

    public static int tax(int price, double tax){
        //消費税額
        int result = (int)(price * tax );
       return result;
     }

    }


