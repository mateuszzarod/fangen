package com.designpatterns.matidesignpatterns.prototype2;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class prototype2TestSuite {
    @Test
    public void testToString() {
        //given
        //creating the TaskList todos
        TaskList listToDo = new TaskList("To do tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To Do Task number" + n)));

        //creating the inProgress todos
        TaskList listInProgress = new TaskList("In progress tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In progress Task number" + n)));

        //creating the TaskList for done task
        TaskList listDone = new TaskList("Done tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Task number" + n)));
        //creating the board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);
        System.out.println(board);

        //making a shallow copy
        Board cloneBoard = null;
        try {
            cloneBoard = board.shallowCopy();
            cloneBoard.setName("Project nr 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //making a deep copy
        Board deepCloneBoardDeep = null;
        try {
            deepCloneBoardDeep = board.deepCopy();
            deepCloneBoardDeep.setName("Project nr 3 deep");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);

        //Then
        System.out.println(board);
        System.out.println(cloneBoard);
        System.out.println(deepCloneBoardDeep);
        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2, cloneBoard.getLists().size());
        Assert.assertEquals(3, deepCloneBoardDeep.getLists().size());
        Assert.assertEquals(cloneBoard.getLists(), board.getLists());
        Assert.assertNotEquals(board.getLists(), deepCloneBoardDeep.getLists());
    }
}
