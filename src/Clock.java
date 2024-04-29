
public class Clock {

    public static void main(String[] args) {
        //現在時刻21：39：35を秒に変換
        int num1 = 21;
        int num2 = 39;
        int num3 = 35;
        int result;
        result = getSeconds(num1, num2, num3);
        // 演算結果を表示する
        System.out.println("getSekonds" + result );
    }
    public static int getSeconds(int num1, int num2, int num3) {
       int result = num1 * num2 * num3;
       return result;
    }
    }


