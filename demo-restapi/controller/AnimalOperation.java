import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

public class AnimalOperation {
  

  @PostMapping (value ="animal")
public Animal createAnimal (Animal animal);

}
