package Loomine.Arvutamine;

import java.util.*;

public class Puhverdaja<S, V> implements Arvutaja<S, V> {
    Arvutaja<S, V> abiline;
    Map<S, V> puhver = new HashMap<S, V>();
    public Puhverdaja(Arvutaja a){
        abiline=a;
    }
    public V f(S sisend){
        if(!puhver.containsKey(sisend)){
            puhver.put(sisend, abiline.f(sisend));
        }
        return puhver.get(sisend);
    }
}
