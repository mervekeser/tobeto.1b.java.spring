package com.tobeto.workshop.b.pair7;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categories")

public class CategoriesController {

    @GetMapping
    public String getCategories(){
        return "Kategoriler getirildi";
    }

    @GetMapping("id")
    public String getCategoriesId(){
        return "Kategoriler id'ye göre getirildi";
    }

    @PostMapping
    public String postCategories(){
        return "Kategoriler eklendi";
    }

    @PutMapping
    public String putCategories(){
        return "Kategoriler güncellendi";
    }

    @DeleteMapping
    public String deleteCategories(){
        return "Kategoriler silindi";
    }
}
