package day5.AlgorithmRefactor;

//람다를 이용하면 식을 더 간결하게 리팩터할 수 있다

interface Compare {
    boolean doSomething(int valueA, int valueB);
}


public class MaxAndMin {
    //매개변수로 인터페이스를 받음 : callback
    private int getMaxOrMin(int[] arr, Compare compare) {
        int targetValue = arr[0];
        for (int i=0; i<arr.length; i++) {
//            boolean isSth = arr[i]>maxValue;
            boolean isSth = compare.doSomething(arr[i],targetValue);
//            if(arr[i] > maxValue) {
//            이부분만 바꾸어주면 된다 boolean으로 빼주고 -> 인터페이스 생성
            if (isSth) {
                targetValue = arr[i];
            }
        }
        return targetValue;
    }

    //클래스 밖으로 빼서 Override한 버전도 만들어보기
    public int max(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int min(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        int[] arr =  new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        MaxAndMin maxAndMin = new MaxAndMin();
        int maxResult = maxAndMin.max(arr);
        int minResult = maxAndMin.min(arr);

        System.out.println(maxResult);
        System.out.println(minResult);

    }
}
