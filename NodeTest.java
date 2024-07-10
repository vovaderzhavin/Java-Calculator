package ru.practice.summer.derzhavin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class NodeTest {
    @Test
    void createNewTree(){
        Node node = new Node("node1");
        assertNotNull(node, "Узел не создан");
        assertEquals("node1", node.getName(), "Узел создан не корректно!");
    }

    /** Проверка добавления потомка */
    @Test
    void addNode(){
        Node root = new Node("root");
        Node child1 = root.add("Ivan");
        root.add(child1);
        assertEquals(1, root.getChildren().size());
        assertEquals("Ivan", root.getChildren().get(0).getName());
    }

    /** Проверка поиска узла */
    @Test
    void searchNodeByName(){
        Node root = new Node("root");
        Node child1 = root.add("petya");
        Node child2 = root.add("dasha");
        root.add(child1);
        root.add(child2);
        assertEquals(child2.getName(), root.searchChildByName("dasha").getName());
    }


    /** Проверка поиска узла 2 */
    @Test
    void searchNodeByNameFail(){
        Node root = new Node("root");
        Node child1 = root.add("petya");
        Node child2 = root.add("dasha");
        root.add(child1);
        root.add(child2);
        assertEquals(null, root.searchChildByName("Ivan"));
    }


    /** Проверка удаления узла по имени */
    @Test
    void deleteNodeByName(){
        Node root = new Node("root");
        Node child1 = root.add("petya");
        Node child2 = root.add("dasha");
        root.add(child1);
        root.add(child2);
        root.deleteChildByName("petya");
        assertEquals(1, root.getChildren().size());
        assertEquals("dasha", root.getChildren[0].getName());
    }

    /** Проверка удаления узла по id */
    @Test
    void deleteNodeById(){
        Node root = new Node("root");
        Node child1 = root.add("petya");
        Node child2 = root.add("dasha");
        root.add(child1);
        root.add(child2);
        root.deleteChildById(child2.getId());
        assertEquals(1, root.getChildren().size());
        assertEquals("petya", root.getChildren[0].getName());
    }



    /** Проверка удаления дочерних узлов */
    @Test
    void deleteAllNode(){
        Node root = new Node("root");
        Node child1 = root.add("Ivan");
        root.add(child1);
        root.deleteAll();
        assertEquals(0, root.getChildren().size());
    }

    /** Проверка изменения имени узла */
    @Test
    void renameNode() {
        Node root = new Node("root");
        root.setName("root1");
        assertEquals("root1", root.getName());
    }
}
