package com.designpatterns.matidesignpatterns.prototype2;


import java.util.HashSet;
import java.util.Set;

//board with lists of tasks
//extends prototype - nasza klasa została odznaczona jako obsługująca klonowanie
public class Board extends Prototype {
    String name;
    Set<TaskList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TaskList> getLists() {
        return lists;
    }

    public String toString(){
        String s = "Board [" + name + "]\n";
        for(TaskList list: lists){
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Board shallowCopy() throws CloneNotSupportedException{
        return (Board) super.clone();
    }

    public Board deepCopy() throws CloneNotSupportedException{
        Board clonedBoard = (Board) super.clone();
        //do pola cloneBoard przypisuje nowy hashSet

        clonedBoard.lists = new HashSet<>();
        //dla każdej listy zadań wykonuje pętle

        for(TaskList theList: lists){
            //wykonuje pętle dla każdego zadania na liście dla listy zadań
            TaskList clonedList = new TaskList(theList.getName());
            //Dla każdego zadania tworzony jest nowy obiekt typu Task, a
            for (Task task: theList.getTasks()){
                clonedList.getTasks().add(task);
            }
            // dla każdej listy zadań tworzona jest nowa lista typu TasksList i cała struktura klonowana jest “zadanie po zadaniu” do nowych obiektów
            clonedBoard.getLists().add(clonedList);
        }
        return clonedBoard;
    }

    public void setName(String name) {
        this.name = name;
    }
}
