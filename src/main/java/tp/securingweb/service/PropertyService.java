package tp.securingweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.securingweb.Entity.Property;
import tp.securingweb.Repository.PropertyRepo;

import java.util.List;
import java.util.Optional;
@Service
public class PropertyService {
    private final PropertyRepo propertyRepo;

    @Autowired
    public PropertyService(PropertyRepo propertyRepo) {
        this.propertyRepo = propertyRepo;
    }

    public List<Property> getAllProperty(){
        return propertyRepo.findAll();
    }
    public Property findPropertyById(Long id){
        Optional<Property> property=propertyRepo.findById(id);
        return property.orElse(null);
    }
    public Boolean createProperty(Property property){
        if (propertyRepo.existsById(property.getId())){
            return false;
        }
        propertyRepo.save(property);
        return true;
    }
    public Boolean updateProperty(Long id,Property property){
        
    }
}
