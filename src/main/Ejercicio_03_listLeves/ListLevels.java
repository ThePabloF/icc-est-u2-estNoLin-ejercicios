package main.Ejercicio_03_listLeves;


import main.Materia.Models.Node;
import java.util.*;

public class ListLevels {
     public List<List<Node>> listLevels(Node root) {
        List<List<Node>> resultado = new ArrayList<>();
        if (root == null) return resultado;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int nivelSize = queue.size();
            List<Node> nivel = new ArrayList<>();

            for (int i = 0; i < nivelSize; i++) {
                Node actual = queue.poll();
                nivel.add(actual);

                if (actual.getLeft() != null) {
                    queue.offer(actual.getLeft());
                }

                if (actual.getRight() != null) {
                    queue.offer(actual.getRight());
                }
            }

            resultado.add(nivel);
        }

        return resultado;
    }
}
