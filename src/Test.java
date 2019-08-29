/**
 * Created by luox on 2019/8/1.
 */
public class Test {

    public static void main(String[] args) {
        String[][] _2dArray = new String[][]{{"lee","22"},
                                            {"jack","18"},
                                            {"susan","25"},
                                            {"aimee","16"}};

        String[] templateMaxItem;
        for (int i = 0; i < _2dArray.length-1; i++) {
            int currentAge = new Integer(_2dArray[i][1]);
            int nextAge = new Integer(_2dArray[i+1][1]);
            if (currentAge > nextAge) {
                templateMaxItem = _2dArray[i];
                _2dArray[i] = _2dArray[i + 1];
                _2dArray[i + 1] = templateMaxItem;
            }
        }

        for (String[] array : _2dArray) {
            for (String str : array) {
                System.out.print(":"+str);
            }
            System.out.println();
        }
    }

}
