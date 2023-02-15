package com.example.andreyexam.service.Impl;

import com.example.andreyexam.domain.entity.Category;
import com.example.andreyexam.domain.entity.CategoryEnumName;
import com.example.andreyexam.repository.CategoryRepository;
import com.example.andreyexam.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void checkCategoryInDb() {
        if(categoryRepository.count()!=0) {
            return;
        }
        Arrays.stream(CategoryEnumName.values())
                .forEach(categoryEnumName -> {
                    Category category = new Category();
                  category.setName(categoryEnumName);
                   category.setDescription("Description is"+categoryEnumName.name());

                    categoryRepository.save(category);
                });
    }
}
