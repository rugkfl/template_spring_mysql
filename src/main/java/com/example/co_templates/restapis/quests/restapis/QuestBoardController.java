package com.example.co_templates.restapis.quests.restapis;

// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.co_templates.restapis.quests.services.QuestBoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.HashMap;


@RestController
public class QuestBoardController {

    @Autowired QuestBoardService boardService ;

    @GetMapping("/q/r/board/list/{pk_id}")
    public ResponseEntity<Object> list(@PathVariable String pk_id) {
        
        ArrayList arrayList = new ArrayList<>();

        arrayList = boardService.list(pk_id);

        return ResponseEntity.ok().body(arrayList);

    }

    @GetMapping("/q/r/board/view/{pk_id}")
    public ResponseEntity<Object>  view(@PathVariable String pk_id) {
        
        HashMap resultMap = new HashMap<>();

        resultMap = boardService.view(pk_id);

        return ResponseEntity.ok().body(resultMap);
    }



    
    
}
