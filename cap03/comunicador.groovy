trait Comunicador { 

    private boolean iniciada
    
    private void iniciar() {
        if (! iniciada ) {
            iniciada = true;
        }      
    }
    
    void enviarMensagem(String msg) {
        iniciar()
    }

}

class Telefone implements Comunicador {
    void teste() {
        /* 
            Um erro ser� disparado pois
            o m�todo iniciar s� existe
            privado na trait
        */
        iniciar()
    }    
}

Telefone t = new Telefone()
t.teste()