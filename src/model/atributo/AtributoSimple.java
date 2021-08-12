package model.atributo;

import model.enfrentable.Enfrentable;

public class AtributoSimple extends AtributoAbstract {

    public AtributoSimple(float value) {
        super(value);
    }

    @Override
    public float getValor(Enfrentable e) {
        return 0;
    }
}