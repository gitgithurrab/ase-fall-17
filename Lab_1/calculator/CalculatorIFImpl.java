package calculator;//package calculator;

public class CalculatorIFImpl implements CalculatorIF {
    @Override
    public int sum(int m, int n) {
        if(n==0) return m;

        if(n>0)
            for(int i=0;i<n;i++) m = m + 1;
        else
            for(int i=0;i<n;i++) m = m - 1;

        return m;
    }

    @Override
    public int minus(int m, int n){
        return sum(m,-n);
    }

    @Override
    //you can only use with parameter>=0
    public int prod(int m,int n){
        if(n==0 || m==0) return 0;
        int result=0;
        for(int i=0;i<n;i++) result= result + m;
        return result;
    }

    @Override
    //you can only use with parameter>=0
    public int divide(int m, int n) {

        if(n==0) throw new IllegalArgumentException();

        int conta = 0;

        while (m > 0) {
            m = m-n;
            conta=conta+1;
        }

        return conta-1;
    }
}
