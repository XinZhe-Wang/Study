public class TestSort {

    public static void testsort() {
        String[] input = {"i","have","an","egg"};
        String[] expected = {"an","egg","have","i"};

        Sort.sort(input);

        org.junit.Assert.assertArrayEquals(expected,input);
    }

    public static void testfindsmallest(){
        String[] input = {"i","have","an","egg"};
        int expected =2;

        int actual = Sort.findSmallest(input,0);
        org.junit.Assert.assertEquals(expected,actual);

        String[] input2 = {"there","are","many","pigs"};
        int expected2 =2;

        int actual2 = Sort.findSmallest(input2,2);
        org.junit.Assert.assertEquals(expected2,actual2);
    }

    public static void testswap() {
        String[] input = {"i","have","an","egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an","have","i","egg"};

        Sort.swap(input,a,b);

        org.junit.Assert.assertArrayEquals(expected,input);
    }

    public static void main(String[] args) {
        //testfindsmallest();
        testsort();
    }
}
