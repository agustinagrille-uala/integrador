package model.atributo;

import model.enfrentable.Enfrentable;

public class AtributoCondicional extends AtributoAbstract {

    private String key1;
    private String key2;
    private Atributo keyThen;
    private Atributo keyElse;

    public AtributoCondicional(float value, String key1, String key2, Atributo keyThen, Atributo keyElse) {
        super(value);
        this.key1 = key1;
        this.key2 = key2;
        this.keyThen = keyThen;
        this.keyElse = keyElse;
    }

    @Override
    public float getValor(Enfrentable e) {
        return 0;
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

    public Atributo getKeyThen() {
        return keyThen;
    }

    public void setKeyThen(Atributo keyThen) {
        this.keyThen = keyThen;
    }

    public Atributo getKeyElse() {
        return keyElse;
    }

    public void setKeyElse(Atributo keyElse) {
        this.keyElse = keyElse;
    }
}