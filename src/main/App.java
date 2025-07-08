package main;

import utils.StudentValidator;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;

import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ


        // === Ejercicio 01: Insertar en BST ===
        InsertBST bst = new InsertBST();
        Node root = null;
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        for (int v : values) {
            root = bst.insert(root, v);
        }
        System.out.println("Árbol BST insertado correctamente.");

        // === Ejercicio 02: Invertir árbol ===
        InvertBinaryTree inverter = new InvertBinaryTree();
        Node invertedRoot = inverter.invertTree(root);
        System.out.println("Árbol invertido correctamente.");

        // === Ejercicio 03: Listar niveles ===
        ListLevels levelLister = new ListLevels();
        List<List<Node>> niveles = levelLister.listLevels(root);
        System.out.println("Listado de niveles:");
        for (List<Node> nivel : niveles) {
            for (Node n : nivel) {
                System.out.print(n.getValue() + " ");
            }
            System.out.println();
        }
        // === Ejercicio 04: Profundidad máxima ===
        Depth depthCalc = new Depth();
        int profundidad = depthCalc.maxDepth(root);
        System.out.println("Profundidad máxima del árbol original: " + profundidad);
    

        System.out.println("PROBANDO");
    }

}
