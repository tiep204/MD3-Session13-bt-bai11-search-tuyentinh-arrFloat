import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] doubles = {3.5,1.4,6.3,2.5,9.0,2,5,9.3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số thực: ");
        double soThuc = Double.parseDouble(sc.nextLine());
        boolean flag = false;
        for (int i = 0; i < doubles.length; i++) {
            if (soThuc==doubles[i]){
                System.out.println("Số "+soThuc+ " bạn vừa tìm nằm ở vị trí số "+i);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Số "+soThuc+" bạn vừa tìm không tìm thấy trong mảng");
        }
    }
}