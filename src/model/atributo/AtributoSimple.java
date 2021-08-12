package model.atributo;

import model.enfrentable.Enfrentable;

public class AtributoSimple implements Atributo {

    private float value;

    public AtributoSimple(float value) {
        this.value = value;
    }

    @Override
    public float getValor(Enfrentable e) {
        return this.value;
    }
}