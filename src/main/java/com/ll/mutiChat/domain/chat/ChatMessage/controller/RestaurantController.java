package com.ll.mutiChat.domain.chat.ChatMessage.controller;


import com.ll.mutiChat.domain.chat.ChatMessage.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/random")  //오늘뭐 먹지 랜덤 5개추천
    public List<String> getRandomRestaurants(
            @RequestParam("lat") double lat,
            @RequestParam("lng") double lng,
            @RequestParam("email") String email) {
        return restaurantService.getRandomRestaurants(lat, lng, email);
    }
}
//Postman에서 요청하면 반경 2km, 찜 목록, 겹치는 키워드 조건에 해당하는 식당 이름 5개가 랜덤으로 반환됩니다.