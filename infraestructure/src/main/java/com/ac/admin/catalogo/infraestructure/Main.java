package com.ac.admin.catalogo.infraestructure;

import com.ac.admin.catalogo.application.UseCase;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(new UseCase().execute());
    }
}