package shubh.springFramework.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import shubh.springFramework.domain.Recipe;
import shubh.springFramework.repositories.RecipeRepository;

import java.io.IOException;

@Service
@Slf4j
public class ImageServiceImpl implements ImageService {

    private final RecipeRepository recipeRepository;

    public ImageServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {
        try {
            Recipe recipe = recipeRepository.findById(recipeId).get();
            // we need to convert java primitive byte array to the wrapper class
            Byte[] byteObjects = new Byte[file.getBytes().length];

            int i = 0;

            // here we are iterating to convert to wrapper object
            for (byte b: file.getBytes()){
                byteObjects[i++] = b;
            }

            recipe.setImages(byteObjects);

            recipeRepository.save(recipe);

        } catch (IOException e) {
            log.error("Error Occurred", e);

            e.printStackTrace();
        }
    }
}
