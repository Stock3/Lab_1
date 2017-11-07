package First_Lab;

public class Variant_14 {
    private static float PI = 3.14f;
    private static float THREE = (float)Math.sqrt(3);


    public static class Circle{
        private float square;
        private float radius;
        private float len;

        public float getSquare() {
            return square;
        }

        public void setSquare(float square) {
            this.square = square;
        }

        public float getRadius() {
            return radius;
        }

        public void setRadius(float radius) {
            this.radius = radius;
        }

        public float getLen() {
            return len;
        }

        public void setLen(float len) {
            this.len = len;
        }

        @Override
        public boolean equals(Object other){
            Circle dp = (Circle) other;
            return ((this.radius == dp.radius) && (this.square == dp.square) && (this.len == dp.len));
        }
    }
    public Circle findRadiusAndSquare(float l){
        Circle c = new Circle();
        float r, s;
        r = l / (2 * PI);
        s = PI * r * r;

        c.setLen(l);
        c.setRadius(r);
        c.setSquare(s);

        return c;
    }


    public int threeDigitsNumber(int n){
        assert n > 99 && n < 1000: "Argument should be three digits number!";
        int tmp = 0, remainder = 0;
        tmp = n / 10;
        remainder = n % 10;
        n = remainder * 100 + tmp;

        return n;
    }


    public boolean oneIsPositive(float a, float b, float c){
        if (a > 0 && b > 0 && c > 0)
            return false;
        if (a * b * c <= 0)
            return false;

        return true;
    }


    public static class IntNumbers{
        private float max;
        private float min;

        public float getMax() {
            return max;
        }

        public void setMax(float max) {
            this.max = max;
        }

        public float getMin() {
            return min;
        }

        public void setMin(float min) {
            this.min = min;
        }

        @Override
        public boolean equals(Object other){
            IntNumbers dp = (IntNumbers) other;
            return ((this.max == dp.max) && (this.min == dp.min));
        }
    }
    public IntNumbers ifTask(float a, float b, float c){
        IntNumbers ob = new IntNumbers();

        ob.setMax(0);
        ob.setMin(0);

        if (a < b && a < c){
            ob.setMin(a);
            if (b <= c)
                ob.setMax(c);
            else
                ob.setMax(b);
        }
        else if (b < a && b < c){
            ob.setMin(b);
            if(a <= c)
                ob.setMax(c);
            else
                ob.setMax(a);
        }
        else {
            ob.setMin(c);
            if(a <= b)
                ob.setMax(b);
            else
                ob.setMax(a);
        }

        return ob;
    }


    public static class Triangle{
        private float sideA;
        private float inCircleRadius;
        private float outCircleRadius;
        private float square;

        public float getSideA() {
            return sideA;
        }

        public void setSideA(float sideA) {
            this.sideA = sideA;
        }

        public float getInCircleRadius() {
            return inCircleRadius;
        }

        public void setInCircleRadius(float inCircleRadius) {
            this.inCircleRadius = inCircleRadius;
        }

        public float getOutCircleRadius() {
            return outCircleRadius;
        }

        public void setOutCircleRadius(float outCircleRadius) {
            this.outCircleRadius = outCircleRadius;
        }

        public float getSquare() {
            return square;
        }

        public void setSquare(float square) {
            this.square = square;
        }

        @Override
        public boolean equals(Object other){
            Triangle dp = (Triangle) other;
            return ((this.sideA == dp.sideA) && (this.inCircleRadius == dp.inCircleRadius) &&
                    (this.outCircleRadius == dp.outCircleRadius) && (this.square == dp.square));
        }
    }

    public Triangle switchTask(byte number, float value){
        Triangle ob = new Triangle();
        float side = 0.0f;
        switch (number){
            case 1:
                ob.setSideA(value);
                ob.setInCircleRadius(value * THREE / 6);
                ob.setOutCircleRadius(2 * (value * THREE / 6));
                ob.setSquare(value * value * THREE / 4);
                break;

            case 2:
                ob.setInCircleRadius(value);
                side = 6 * value / THREE;
                ob.setSideA(side);
                ob.setOutCircleRadius(2 * value);
                ob.setSquare(side * side * THREE / 4);
                break;

            case 3:
                ob.setOutCircleRadius(value);
                ob.setInCircleRadius(value / 2);
                side = 6 * (value / 2) / THREE;
                ob.setSideA(side);
                ob.setSquare(side * side * THREE / 4);
                break;

            case 4:
                ob.setSquare(value);
                side = (float) Math.sqrt(4 * value / THREE);
                ob.setSideA(side);
                ob.setInCircleRadius(side * THREE / 6);
                ob.setOutCircleRadius(2 * (side * THREE / 6));
                break;

            default:
                ob.setSideA(0.0f);
                ob.setInCircleRadius(0.0f);
                ob.setOutCircleRadius(0.0f);
                ob.setSquare(0.0f);
                break;
        }

        return ob;
    }


    public static class MyArray{
        private int[] arr;

        public int[] getArr() {
            return arr;
        }

        public void setArr(int[] arr) {
            this.arr = arr;
        }
        @Override
        public boolean equals(Object other){
            MyArray dp = (MyArray) other;
            boolean isEqual = true;

            for (int i = 0; i < dp.arr.length; i++)
                if (this.arr[i] != dp.arr[i]){
                    isEqual = false;
                    break;
                }
            return ((this.arr.length == dp.arr.length) && isEqual);
        }
    }

    public MyArray forTask(int n){
        assert n > 0: "Argument n should be more than 0";
        MyArray arr = new MyArray();
        int[] squared = new int[n];
        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += 2 * i - 1;
            squared[i - 1] = sum;
        }

        arr.setArr(squared);

        return arr;
    }


    public static class WhileSummation{
        private float sum;
        private int term;

        public float getSum() {
            return sum;
        }

        public void setSum(float sum) {
            this.sum = sum;
        }

        public int getTerm() {
            return term;
        }

        public void setTerm(int term) {
            this.term = term;
        }
        @Override
        public boolean equals (Object other){
            WhileSummation dp = (WhileSummation) other;
            return ((this.sum == dp.sum) && (this.term == dp.term));
        }
    }

    public WhileSummation whileSummationTask(float a){
        WhileSummation ob = new WhileSummation();
        assert a > 1: "Argument A should be more than 1";
        float sum = 1.0f;
        int i = 2;
        while (sum < a){
            sum += 1.0f / i;
            i++;;
        }
        i--;
        sum -= (1.0f / i);

        ob.setSum(sum);
        ob.setTerm(i);

        return ob;
    }


    public MyArray arrayTask(float[] arr){
        MyArray ob = new MyArray();

        int n = arr.length;
        int j = 0;
        int[] tmp = new int[n];
        for (int i = 0; i < n - 1; i++){
            if (arr[i] < arr[i + 1]){
                tmp[j] = i + 1;
                j++;
            }
        }

        int[] resArr = new int[j];
        for (int i=0;i<j;i++){
            resArr[i] = tmp[i];
        }
        ob.setArr(resArr);

        return ob;
    }


    public float[][] matrixTask(float[][] mtx, int n, int m){
        float tmp = 0.0f;
        int k = m - 1;
        for (int i = m - 1; i >= m / 2; i--){
            for (int j = 0; j < n; j++){
                tmp = mtx[j][i];
                mtx[j][i] = mtx[j][i - k];
                mtx[j][i - k] = tmp;
            }
            k -= 2;
        }
        return mtx;
    }
}
