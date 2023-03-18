package shubh.springFramework.converters;

import lombok.Synchronized;
import org.springframework.stereotype.Component;
import shubh.springFramework.commands.CategoryCommand;
import shubh.springFramework.domain.Category;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category>{

    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source) {
        if (source == null) {
            return null;
        }

        final Category category = new Category();
        category.setId(source.getId());
        category.setDescription(source.getDescription());
        return category;
    }
}
