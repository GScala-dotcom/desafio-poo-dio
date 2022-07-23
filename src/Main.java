import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main (String [] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao: Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descricao: Curso Javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao: Mentoria Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGiovana = new Dev();
        devGiovana.setNome("Giovana");
        devGiovana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Giovana: " + devGiovana.getConteudosInscrito());
        devGiovana.progredir();
        devGiovana.progredir();
        devGiovana.progredir();
        System.out.println("----------------------------------");
        System.out.println("Conteudos inscritos Giovana: " + devGiovana.getConteudosInscrito());
        System.out.println("Conteudos concluidos Giovana: " + devGiovana.getConteudosConcluidos());
        System.out.println("XP: " + devGiovana.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscrito());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("----------------------------------");
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscrito());
        System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
