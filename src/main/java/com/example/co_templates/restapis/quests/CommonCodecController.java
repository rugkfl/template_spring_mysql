package com.example.co_templates.restapis.quests;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CommonCodecController {
    @GetMapping("/q/r/commonCode/list/{pk_id}") 
    public ResponseEntity<Object> commonCodeList(@PathVariable String pk_id) {
    
        ArrayList arrayList = new ArrayList<>();
        HashMap resultMap = new HashMap<>();

        resultMap.put("pk_id", 1) ;
        resultMap.put("fk_id", 1234) ;
        resultMap.put("name", "gyungha") ;
        arrayList.add(resultMap) ;

        return ResponseEntity.ok().body(arrayList);
  
    }

    @GetMapping("/q/r/commonCode/view/{pk_id}/{fk_id}/{name}")
    public ResponseEntity<Object> commonCodeHashMap (@PathVariable String pk_id, @PathVariable String fk_id, @PathVariable String name) {
        ArrayList arrayList = new ArrayList<>();
        HashMap resultMap = new HashMap<>();

        resultMap.put("pk_id", "pk_01");
        resultMap.put("fk_id", "fk_01");
        resultMap.put("name", "gyungha");

        return ResponseEntity.ok().body(resultMap);
    }
    
}
