trait Integrador {

    abstract boolean iniciarIntegracao()
    abstract boolean finalizarIntegracao()
    
    boolean testarIntegracao() {
    
        iniciarIntegracao() && finalizarIntegracao()
    
    }

}

class IntegradorEquipamentos implements Integrador {

    boolean iniciarIntegracao() { println "iniciando" ; true }
    boolean finalizarIntegracao() { println "final" ; true }
    
    boolean testarIntegracao() { finalizarIntegracao() }

}

IntegradorEquipamentos integrador = new IntegradorEquipamentos()
integrador.testarIntegracao()