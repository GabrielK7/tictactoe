package com.game.ticktacktoe.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GameState {
    private  String field1="";

    private  String field2="";

    private  String field3 = "";
    private  String field4="";
    private  String field5="";
    private  String field6="";
    private  String field7="";
    private  String field8="";
    private  String field9="";

   private ArrayList<String> actualData = new ArrayList<>();

   public void print(){
       for(String data : getActualData()){
           System.out.println(data);
       }
   }

    public ArrayList<String> getActualData() {
        actualData.add(field1);
        actualData.add(field2);
        actualData.add(field2);
        return actualData;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }

    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8;
    }

    public String getField9() {
        return field9;
    }

    public void setField9(String field9) {
        this.field9 = field9;
    }
}
