package com.example.dogadjaj181.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dogadjaj181.models.in.CategoryIn;
import com.example.dogadjaj181.models.out.CategoryOut;

@Service
public interface CategoryService {
    List<CategoryOut> getAllCategories();
    
    CategoryOut addNewCategory(CategoryIn categoryIn);

    CategoryOut edit(Integer id, CategoryIn catIn);
}
