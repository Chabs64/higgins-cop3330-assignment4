/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ToDoManagerController {

    //text section
    public TextArea DisplayList;
    public TextField UserInput;
    public TextArea UserPrompt;
    public TextArea DisplayTitle;

    //user Navigation
    public Button NextItem;
    public Button PreviousItem;

    public Button NextList;
    public Button PreviousList;

    //user interaction buttons
    public Button NewToDoList;
    public Button NewItem;

    //user Menus
    public Button ShowAll;
    public Button ShowCompleted;
    public Button ShowIncomplete;


    public MenuItem EditDate;
    public MenuItem EditDesc;
    public MenuItem MarkDone;
    public MenuItem DeleteItem;


    public MenuItem Save;
    public MenuItem SaveAll;


    public MenuItem Load;
    public MenuItem LoadAll;


    public MenuItem EditTitle;
    public MenuItem DeleteToDoList;
}
