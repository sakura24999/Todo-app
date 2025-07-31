package com.example.Todo_app.Model;

public class TodoModel {
    // プライベートフィールド
    private String taskadd;
    private String taskdisplay;
    private String taskswitching;
    private String taskupdate;
    private String taskdelete;

    // コンストラクタ
    public TodoModel(String taskadd, String taskdisplay, String taskswitching, String taskupdate,String taskdelete) {
        this.taskadd = taskadd;
        this.taskdisplay = taskdisplay;
        this.taskswitching = taskswitching;
        this.taskupdate = taskupdate;
        this.taskdelete = taskdelete;
    }

    // ゲッター(読み取り用)
    public String getTaskadd() {
        return this.taskadd;
    }

    public String getTaskdisplay() {
        return this.taskdisplay;
    }

    public String getTaskswitching() {
        return this.taskswitching;
    }

    public String getTaskupdate() {
        return this.taskupdate;
    }

    public String getTaskdelete() {
        return this.taskdelete;
    }

    // セッター(書き込み用)
    public void setTaskadd(String taskadd) {
        this.taskadd = taskadd;
    }

    public void setTaskdisplay(String taskdisplay) {
        this.taskdisplay = taskdisplay;
    }

    public void setTaskswitching(String taskswitching) {
        this.taskswitching = taskswitching;
    }

    public void setTaskupdate(String taskupdate) {
        this.taskupdate = taskupdate;
    }

    public void setTaskdelete(String taskdelete) {
        this.taskdelete = taskdelete;
    }
}
