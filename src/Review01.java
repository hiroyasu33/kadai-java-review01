
public class Review01 {

    public static void main(String[] args) {
       int price = 1400;
       double tax = 0.1;
       int result;
       result = taxMethod(price, tax);
       System.out.println(price + "円の商品の税込価格は" + result + "円" + "(消費税は" + (int)(price * tax) + "円)" + "です。");
    }

    public static int taxMethod(int price, double tax){
       int result = (int)(price * tax + price);
       return result;
     }

    }


