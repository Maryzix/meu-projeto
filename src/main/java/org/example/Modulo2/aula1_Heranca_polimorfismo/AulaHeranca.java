package org.example.Modulo2.aula1_Heranca_polimorfismo;

public class AulaHeranca extends FuncionariosHospital{
    public static void main (String [] args){
        Medicos mariaMedica = new Medicos();

        mariaMedica.baterPonto();
        mariaMedica.dormem();
        mariaMedica.fazerCirurgia();
        mariaMedica.darAtestado();

        FuncionariosHospital joaoDoRh = new FuncionariosHospital();

        Oftalmologista alineOftalmo = new Oftalmologista();

        alineOftalmo.passarCracha();


    }
}
