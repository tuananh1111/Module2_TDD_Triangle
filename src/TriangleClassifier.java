public class TriangleClassifier {
    public static String isTriangle(int numberA, int numberB, int numberC){
        if (numberA==numberB&&numberA==numberC){
            return "Tam giác đều";
        }else if (numberA==numberB ||numberA==numberC||numberC==numberB){
            return "Tam giác cân";
        } else if (numberA < numberB + numberC && numberA > subAbsolute(numberB, numberC)) {
            return "Tam giác thường";
        }else if (numberA>numberB+numberC || numberB>numberA+numberC|| numberC>numberA+numberB){
            return "Không phải là tam giác";
        }else if (numberA<=0 || numberB<=0 || numberC<=0){
            return "Không là tam giác";
        }
        return null;
    }
    public static int subAbsolute(int numberB, int numberC){
        if (numberB-numberC<0) return numberC-numberB;
        return numberB-numberC;
    }
}
