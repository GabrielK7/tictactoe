package com.game.ticktacktoe;

import com.game.ticktacktoe.model.GameDTO;
import com.game.ticktacktoe.model.GameState;
import com.game.ticktacktoe.service.WinnerCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller

public class GameController {

   @Autowired
    private WinnerCheckService winnerCheckService;

    private GameState gameState;
private String actualValue = "x";
    @Autowired
    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    @GetMapping("/game")
    public String sayHello(Model model, GameDTO gameDTO) {
        model.addAttribute("message", actualValue);
        System.out.println("From GameState 1> " + gameState.getField1());
        System.out.println("From GameState 2> " + gameState.getField2());
        System.out.println("From GameState 3> " + gameDTO.getField3());
        System.out.println("From GameState 4> " + gameState.getField4());
        System.out.println("From GameState 5> " + gameState.getField5());
        System.out.println("From GameState 6> " + gameState.getField6());
        System.out.println("------------------------------------------------------------");
        gameState.print();
        model.addAttribute("stateField1", gameState.getField1());
        model.addAttribute("stateField2", gameState.getField2());
        model.addAttribute("stateField3", gameState.getField3());
        model.addAttribute("stateField4", gameState.getField4());
        model.addAttribute("stateField5", gameState.getField5());
        model.addAttribute("stateField6", gameState.getField6());
        model.addAttribute("stateField7", gameState.getField7());
        model.addAttribute("stateField8", gameState.getField8());
        model.addAttribute("stateField9", gameState.getField9());
        model.addAttribute("demoData", getArray());
        model.addAttribute("demoText", gameDTO.getDemoText());
        model.addAttribute("actualData", gameState.getActualData());
        gameDTO.setDemoText("Game in process...");
        if(!winnerCheckService.threeInRow() && !winnerCheckService.threeInColumn() &&
        !winnerCheckService.threeInDiagonal()){
            gameDTO.setDemoText("Game started...");
        }else {
            gameDTO.setDemoText("Game over!!! Winner is: " + winnerCheckService.getWinner());
        }
        return "home/index";
    }


    @PostMapping("/game1")
    public String printMove1(@ModelAttribute GameDTO gameDTO) {


        gameState.setField1(gameDTO.getField1());

        System.out.println("DTO info: " + String.valueOf(gameDTO));
        System.out.println("From view> " + gameDTO.getField1());

        System.out.println("Field1 from dto> " + gameState.getField1());
        System.out.println("Field2 from dto> " + gameState.getField2());
        System.out.println("Field3 from dto> " + gameState.getField3());
        System.out.println();
actualValue = (actualValue.equals("x")) ? "o" : "x";
        return "redirect:/game";

    }

    @PostMapping("/game2")

    public String printMove2(@ModelAttribute GameDTO gameDTO) {
        gameState.setField2(gameDTO.getField2());
        actualValue = (actualValue.equals("x")) ? "o" : "x";
        return "redirect:/game";
    }

    @PostMapping("/game3")
    public String printMove3(@ModelAttribute GameDTO gameDTO, Model model) {
        gameState.setField3(gameDTO.getField3());
        actualValue = (actualValue.equals("x")) ? "o" : "x";
        return "redirect:/game";
    }

    @PostMapping("/game4")
    public String printMove4(@ModelAttribute GameDTO gameDTO, Model model) {
        gameState.setField4(gameDTO.getField4());
        actualValue = (actualValue.equals("x")) ? "o" : "x";
        return "redirect:/game";
    }
    @PostMapping("/game5")
    public String printMove5(@ModelAttribute GameDTO gameDTO, Model model) {
        gameState.setField5(gameDTO.getField5());
        actualValue = (actualValue.equals("x")) ? "o" : "x";
        return "redirect:/game";
    }
    @PostMapping("/game6")
    public String printMove6(@ModelAttribute GameDTO gameDTO, Model model) {
        gameState.setField6(gameDTO.getField6());
        actualValue = (actualValue.equals("x")) ? "o" : "x";
        return "redirect:/game";
    }

    @PostMapping("/game7")
    public String printMove7(@ModelAttribute GameDTO gameDTO, Model model) {
        gameState.setField7(gameDTO.getField7());
        actualValue = (actualValue.equals("x")) ? "o" : "x";
        return "redirect:/game";
    }

    @PostMapping("/game8")
    public String printMove8(@ModelAttribute GameDTO gameDTO, Model model) {
        gameState.setField8(gameDTO.getField8());
        actualValue = (actualValue.equals("x")) ? "o" : "x";
        return "redirect:/game";
    }

    @PostMapping("/game9")
    public String printMove9(@ModelAttribute GameDTO gameDTO, Model model) {
        gameState.setField9(gameDTO.getField9());
        actualValue = (actualValue.equals("x")) ? "o" : "x";
        return "redirect:/game";
    }

    public ArrayList<GameDTO> getArray() {

        ArrayList<GameDTO> testData = new ArrayList<>();
        GameDTO gameDTO1 = new GameDTO();
        gameDTO1.setField1("x");
        gameDTO1.setField2("y");
        gameDTO1.setField3("z");

        GameDTO gameDTO2 = new GameDTO();
        gameDTO2.setField1("a");
        gameDTO2.setField2("b");
        gameDTO2.setField3("c");

        testData.add(gameDTO1);
        testData.add(gameDTO2);
        return testData;
    }



}
