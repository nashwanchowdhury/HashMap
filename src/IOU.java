import java.util.HashMap;
public class IOU {
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
    HashMap<String, Double> map = new HashMap<>();
    public IOU() {
    }
    public void setSum(String toWhom, double amount) {
       map.put(toWhom, amount);

    }
    public double howMuchDoIOweTo(String toWhom) {
        return map.get(toWhom);
    }

}
