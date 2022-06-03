package com.ChessDesk.controllers;

import com.ChessDesk.models.HorseStep;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BaseController {

    @PostMapping()
    public String indexPost (@RequestParam("row") Byte row,
                             @RequestParam("col") Byte col,
                             Model model){
        List<HorseStep> horseStep = new ArrayList<>();
        Byte[] mas1 = {1,-1};
        Byte[] mas2 = {2,-2};
        for (byte i=0; i<2; i++){
            for (byte j=0; j<2; j++){
              if (col+mas1[i]<9 && col+mas1[i]>0 && row+mas2[j]<9 && row+mas2[j]>0) {
                  horseStep.add(new HorseStep((byte) (col + mas1[i]), (byte) (row + mas2[j])));
                  horseStep.add(new HorseStep((byte) (col + mas2[i]), (byte) (row + mas1[j])));
              }
            }
        }
        model.addAttribute("horseStep", horseStep);
        return("/index");
    }

    @GetMapping()
    public String index (Model model){
        List<HorseStep> horseStep = new ArrayList<>();
        horseStep.add(new HorseStep((byte) 0, (byte) 0));
        model.addAttribute("horseStep", horseStep);
        return("/index");
    }

}
