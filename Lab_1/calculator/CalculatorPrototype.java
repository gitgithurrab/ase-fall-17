package calculator;//package calculator;

public class CalculatorPrototype implements CalculatorIF {
    @Override
    public int sum(int m, int n) {
        if(n==0) return m;

        if(n>0)
            for(int i=0;i<n;i++) m = m + 1;
        else
            for(int i=0;i<-n;i++) m = m - 1;
        return m;
    }

    @Override
    public int subtract(int m, int n){
        if(n==0) return m;

        if(n>0)
            for(int i=0;i<n;i++) m = m - 1;
        else
            for(int i=0;i<-n;i++) m = m + 1;
        return m;
    }

    @Override
    public int multiply(int m,int n){

        if(n==0 || m==0) return 0;

        if(n<0) return -multiply(m,-n);

        int result=0;
        for(int i=0;i<n;i++) result= result + m;
        return result;

    }

    @Override
    public int divide(int m, int n) {

        if(n==0) throw new ArithmeticException();

        if(n<0) return -divide(m,-n);
        if(m<0) return -divide(-m,n);

        int conta = 0;
        while (m >= 0) {
            m = m-n;
            conta=conta+1;
        }
        return conta-1;
    }
}
