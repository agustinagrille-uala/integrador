package model.atributo;

import model.enfrentable.Enfrentable;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class AtributoOperacion extends AtributoAbstract {

    private String key1;
    private String key2;

    public AtributoOperacion(float value, String key1, String key2) {
        super(value);
        this.key1 = key1;
        this.key2 = key2;
    }

    @Override
    public float getValor(Enfrentable e) {
        System.out.println(e);

        return getValue();
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