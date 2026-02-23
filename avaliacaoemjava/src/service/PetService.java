package service;

import java.util.ArrayList;
import java.util.List;
import model.Pet;

public class PetService {

    private List<Pet> pets = new ArrayList<>();

    // CREATE
    public void cadastrar(Pet pet) {
        pets.add(pet);
        System.out.println("Pet cadastrado com sucesso!");
    }

    // READ - Listar todos
    public void listarTodos() {
        if (pets.isEmpty()) {
            System.out.println("Nenhum pet cadastrado.");
        } else {
            for (Pet p : pets) {
                System.out.println(p);
            }
        }
    }

    // READ - Buscar por nome
    public Pet buscarPorNome(String nome) {
        for (Pet p : pets) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    // UPDATE
    public void atualizar(String nome, int novaIdade, String novoDono) {
        Pet pet = buscarPorNome(nome);
        if (pet != null) {
            pet.setIdade(novaIdade);
            pet.setDono(novoDono);
            System.out.println("Pet atualizado com sucesso!");
        } else {
            System.out.println("Pet não encontrado.");
        }
    }

    // DELETE
    public void remover(String nome) {
        Pet pet = buscarPorNome(nome);
        if (pet != null) {
            pets.remove(pet);
            System.out.println("Pet removido com sucesso!");
        } else {
            System.out.println("Pet não encontrado.");
        }
    }
}
