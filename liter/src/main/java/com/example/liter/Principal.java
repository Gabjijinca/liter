package com.example.liter;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

    }


    @Autowired
    private fraseReposit reposit;


    private authorReposit authorReposit;

    public Principal(fraseReposit reposit, com.example.liter.authorReposit authorReposit) {
        this.reposit = reposit;
        this.authorReposit = authorReposit;
    }


    public void exibeMenu() {
        Scanner sc = new Scanner(System.in);
        int option = 1;

        while (option != 0) {

            System.out.println("==========================================");
            System.out.println("==========================================");
            System.out.println("1- Escolha do livro");
            System.out.println("2- Livros cadastrados no banco de dados");
            System.out.println("3- Autores cadastrados no banco de dados");
            System.out.println("4- Ano");
            System.out.println("5- Língua");
            System.out.println("0- Sair");
            System.out.println("==========================================");
            System.out.println("==========================================");

            option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.println("Digite o Livro Desejado:");

                String title = sc.nextLine();
                String formattedTitle = title.replace(" ", "+");
                apiResponse record = connect.buscarTaxas(formattedTitle);

                System.out.println(record);

                for (newRec rec : record.results()) {
                    List<String> authorNames = new ArrayList<>();

                    for (autores author : rec.authors()) {
                        authorNames.add(author.name());

                        author existingAuthor = authorReposit.findFirstByAuthorNamesAndTitle(author.name(), rec.title());
                        if (existingAuthor == null) {
                            authorReposit.save(new author(
                                    rec.title(),
                                    author.name(),
                                    author.birth_year() != null ? author.birth_year() : 0,
                                    author.death_year() != null ? author.death_year() : 0
                            ));
                        }
                    }

                    pegatudoBank existingBook = reposit.findFirstByTitleAndAuthorNames(rec.title(), String.join(", ", authorNames));
                    if (existingBook == null) {
                        pegatudoBank bookEntity = new pegatudoBank(rec.title(), authorNames, rec.download_count(), String.join(", ", rec.languages()));
                        reposit.save(bookEntity);
                    }
                }

            } else if (option == 2) {
                List<pegatudoBank> allRecords = reposit.findAll();
                System.out.println("Registros Livros cadastrados no banco de livros:");
                allRecords.forEach(System.out::println);

            } else if (option == 3) {
                List<author> allAuthors = authorReposit.findAll();
                System.out.println("Registros cadastrados no banco de autores:");
                allAuthors.forEach(System.out::println);

            } else if (option == 4) {
                System.out.println("Digite o Ano desejado");
                int l = sc.nextInt();

                List<author> allAuthors = authorReposit.findAll();
                allAuthors.stream().filter(t -> t.getDeath_year() >= l && t.getBirth_year() <= l)
                        .forEach(System.out::println);

            }  else if (option == 5) {
                System.out.println("Escolha a língua:  \n es - espanhol \n en - inglês \n fr - francês \n pt - português");

                String selectedLanguage = sc.nextLine();

                List<pegatudoBank> allRecords = reposit.findAll();
                List<pegatudoBank> filteredRecords = allRecords.stream()
                        .filter(t -> Objects.equals(t.getLanguages(), selectedLanguage))
                        .toList();

                if (filteredRecords.isEmpty()) {
                    System.out.println("Não existe Livro nesse Idioma no Banco de Dados");
                } else {
                    filteredRecords.forEach(System.out::println);
                }
            }
            }
        }
    }


    