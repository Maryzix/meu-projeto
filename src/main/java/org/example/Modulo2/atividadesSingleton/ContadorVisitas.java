package org.example.Modulo2.atividadesSingleton;

public class ContadorVisitas {
    //6.  Crie uma classe Singleton chamada ContadorVisitas que:
    //-tenha um atributo total, começando em 0;
    //-tenha um metodo registrarVisita() que soma 1 ao total;
    //-tenha um metodo getTotal() que devolve o total.

        private static ContadorVisitas instancia;
        private int total = 0;

        private ContadorVisitas() {
        }

        public void registrarVisita() {
            total++;
        }

        public int getTotal() {
            return total;
        }

        public static ContadorVisitas getInstancia() {
            if (instancia == null) {
                instancia = new ContadorVisitas();
            }

            return instancia;
        }
    }

