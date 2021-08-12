package model.atributo;

import model.enfrentable.Enfrentable;

public class AtributoOperacion implements Atributo {

    private String key1;
    private String key2;

    public AtributoOperacion(String key1, String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    @Override
    public float getValor(Enfrentable e) {
        return e.getValorAtributo(this.key1)+e.getValorAtributo(key2);
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }
}