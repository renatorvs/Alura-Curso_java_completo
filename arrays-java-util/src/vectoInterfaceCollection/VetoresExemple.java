package vectoInterfaceCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import br.com.bitebank.banco.modelo.Conta;
import br.com.bitebank.banco.modelo.ContaCorrente;

public class VetoresExemple {
	public static void main(String[] args) {

    	//Generics
        Vector<Conta> lista = new Vector<Conta>();

        ArrayList<String> nomes = new ArrayList<String>();
        
        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("----------");

        for(Conta oRef : lista) {
            System.out.println(oRef);
        }
}
}

