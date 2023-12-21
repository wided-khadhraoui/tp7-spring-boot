package tp.securingweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import tp.securingweb.service.PropertyService;

public class PropertyController {
    @Autowired
    private final PropertyService propertyService;
}
