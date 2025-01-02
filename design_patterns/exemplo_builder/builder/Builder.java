package javaFunctions.design_patterns.exemplo_builder.builder;

import javaFunctions.design_patterns.exemplo_builder.aviao.TipoAviao;
import javaFunctions.design_patterns.exemplo_builder.components.Motor;

public interface Builder {
    void setTipoAviao(TipoAviao tipo);
    void setMotor(Motor motor);
    void setAsa(double asa);
    void setArmas(boolean armas);
    void setAssentos(int assentos);
}