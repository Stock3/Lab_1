package First_LabTest;

import First_Lab.Variant_14;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import First_Lab.Variant_14.*;

import java.util.Arrays;

public class Variant_14Test {
    @Test(dataProvider = "circleProvider")
    public void findRadiusAndSquareTest(float l, Circle res){
        assertTrue(res.equals(new Variant_14().findRadiusAndSquare(l)));
    }
    @DataProvider
    public Object[][] circleProvider(){
        Circle c = new Circle();
        c.setLen(25.5f);
        c.setRadius(4.060509f);
        c.setSquare(51.77149f);

        return new Object[][] {{25.5f, c}};
    }

    @Test
    public void testw(){
        Circle c = new Circle();
        c.setLen(25.5f);
        c.setRadius(4.060509f);
        c.setSquare(51.77149f);
        assertEquals(c,new Variant_14().findRadiusAndSquare(25.5f), "should");
    }



    @Test(dataProvider = "threeDigitsNumberProvider")
    public void threeDigitsNumberTest(int n, int res){
        assertEquals(new Variant_14().threeDigitsNumber(n), res);
    }
    @DataProvider
    public Object[][] threeDigitsNumberProvider(){
        return new Object[][]{{123, 312}, {597, 759}};
    }



    @Test(dataProvider = "oneIsPositiveProvider")
    public void oneIsPositiveTest(float a, float b, float c, boolean res){
        assertEquals(new Variant_14().oneIsPositive(a, b, c), res);
    }
    @DataProvider
    public Object[][] oneIsPositiveProvider(){
        return new Object[][]{{-5, -1, 0, false}, {1, -2, -3, true}};
    }



    @Test(dataProvider = "ifProvider")
    public void ifTest(float a, float b, float c, IntNumbers res){
        assertTrue(res.equals(new Variant_14().ifTask(a, b, c)));
    }
    @DataProvider
    public Object[][] ifProvider(){
        IntNumbers N = new IntNumbers();
        N.setMax(11.1f);
        N.setMin(-1.23f);

        return new Object[][]{{5, 11.1f, -1.23f, N}};
    }



    @Test(dataProvider = "switchProvider")
    public void switchTest(byte n, float v, Triangle res){
        assertEquals(res, new Variant_14().switchTask(n, v));
    }
    @DataProvider
    public Object[][] switchProvider(){
        Triangle t = new Triangle();

        t.setSideA(18.082611f);
        t.setInCircleRadius(5.22f);
        t.setOutCircleRadius(10.44f);
        t.setSquare(141.58685f);

        return new Object[][]{{(byte)3, 10.44f, t}};
    }



    @Test(dataProvider = "forTaskProvider")
    public void forTest(int n, MyArray res){
        assertTrue(res.equals(new Variant_14().forTask(n)));
    }
    @DataProvider
    public Object[][] forTaskProvider(){
        MyArray r = new MyArray();
        int[] output = {1, 4, 9, 16, 25};

        r.setArr(output);

        return new Object[][]{{5, r}};
    }



    @Test(dataProvider = "whileSumationProvider")
    public void whileSumationTest(float A, WhileSummation res){
        assertTrue(res.equals(new Variant_14().whileSummationTask(A)));
    }
    @DataProvider
    public Object[][] whileSumationProvider(){
        WhileSummation s = new WhileSummation();

        s.setSum(2.2833335f);
        s.setTerm(6);

        return new Object[][]{{2.4f, s}};
    }



    @Test(dataProvider = "arrayProvider")
    public void arrayTest(float[] input, MyArray ob){
        assertTrue(ob.equals(new Variant_14().arrayTask(input)));
    }
    @DataProvider
    public Object[][] arrayProvider(){
        MyArray res = new MyArray();

        float[] input = {0, -1, 5, -8, 2, 1, 2.4f, 2.3f, 2.35f};
        int[] output = {2, 4, 6, 8};
        res.setArr(output);

        return new Object[][]{{input, res}};
    }



    @Test(dataProvider = "matrixProvider")
    public void matrixTest(float[][] input, int n, int m, float[][] output){
        assertTrue(Arrays.deepEquals(output, new Variant_14().matrixTask(input, n, m)));
    }
    @DataProvider
    public Object[][] matrixProvider(){
        float[][] input1 = {{-3, 6, 9, -9}, {-98, -9, 2, 1}, {-2, 1, 6, 1}, {-8, 1, 5, 3}};
        float[][] output1 = {{-9, 9, 6, -3}, {1, 2, -9, -98}, {1, 6, 1, -2}, {3, 5, 1, -8}};

        float[][] input2 = {{-3.1f, 6.5f, 9, -9, 0.12f}, {-98, -9, 2.1f, 1, 4}, {-2, 1.1f, 6, 1, -3.2f}, {-8, 1, 5, 3, 7.25f}};
        float[][] output2 = {{0.12f, -9, 9, 6.5f, -3.1f}, {4, 1, 2.1f, -9, -98}, {-3.2f, 1, 6, 1.1f, -2}, {7.25f, 3, 5, 1, -8}};

        return new Object[][] {{input1, 4, 4, output1}, {input2, 4, 5, output2}};
    }

}
