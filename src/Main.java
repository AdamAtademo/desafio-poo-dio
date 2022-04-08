import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso C#");
        curso3.setDescricao("Descrição curso C#");
        curso3.setCargaHoraria(6);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAdam = new Dev();
        devAdam.setNome("Adam");
        devAdam.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Adam: " + devAdam.getConteudosInscritos());
        devAdam.progredir();
        devAdam.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Adam: " + devAdam.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Adam: " + devAdam.getConteudosConcluidos());
        System.out.println("XP: " + devAdam.calcularTotalXp());


        System.out.println("----------------------------");


        Dev devMariana = new Dev();
        devMariana.setNome("Mariana");
        devMariana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mariana: " + devMariana.getConteudosInscritos());
        devMariana.progredir();
        devMariana.progredir();
        devMariana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mariana: " + devMariana.getConteudosInscritos());
        System.out.println("Conteúdos Comcluidos Mariana: " + devMariana.getConteudosConcluidos());
        System.out.println("XP: " + devMariana.calcularTotalXp());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

    }
}
