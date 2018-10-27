package Symulacje;

import java.math.BigDecimal;

public class Functions {


    BigDecimal gravityConst = new BigDecimal(6.74).multiply(new BigDecimal(Math.pow(10,-11)));


    BigDecimal calcPlanetAttraction( BigDecimal r, long m1){

        return  gravityConst.multiply(BigDecimal.valueOf(m1/Math.pow( r.doubleValue(),2)));
    }

    BigDecimal[] calcAttractionSimpleForces(BigDecimal x, BigDecimal y,long m1){
        BigDecimal r =BigDecimal.valueOf(Math.pow(x.doubleValue()*x.doubleValue() + y.doubleValue()*y.doubleValue(),-2));

        BigDecimal mainForce = calcPlanetAttraction(r,m1) ;
        BigDecimal xForce = mainForce.multiply(x.divide(r));
        BigDecimal yForce = mainForce.multiply(y.divide(r));


        return new BigDecimal[]{xForce, yForce};
    }

    BigDecimal[] calcRocketSimpleForces(BigDecimal mainForce,long alpha){

        Math.cos(Math.toRadians(alpha));

        Math.sin(Math.toRadians(alpha));


        BigDecimal xForce = mainForce.multiply();
        BigDecimal yForce = mainForce.multiply();


        return new BigDecimal[]{xForce, yForce};
    }
}