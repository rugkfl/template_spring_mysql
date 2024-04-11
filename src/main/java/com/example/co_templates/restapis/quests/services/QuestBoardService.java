package com.example.co_templates.restapis.quests.services;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.co_templates.restapis.quests.restapis.QuestBoardController;

@Service
public class QuestBoardService {
    public <Object> ArrayList list(String pk_id) {

        ArrayList arrayList = new ArrayList<>();
        HashMap resultMap = new HashMap<>();

        resultMap.put("pk_id", 1) ;
        resultMap.put("title", "자바는 오늘도 차갑다") ;
        resultMap.put("contents", "주륵") ;
        arrayList.add(resultMap) ;

        return arrayList;
    }

    public <Object> HashMap view(String pk_id) {

        HashMap resultMap = new HashMap<>();

        resultMap.put("pk_id", 2);
        resultMap.put("title", "자바는 오늘도 차갑다");
        resultMap.put("contents", "주르르륵");

        return resultMap;
    }


      
    
}
